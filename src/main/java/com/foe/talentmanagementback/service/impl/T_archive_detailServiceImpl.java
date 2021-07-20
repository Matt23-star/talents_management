package com.foe.talentmanagementback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.bo.ExperienceDetailBO;
import com.foe.talentmanagementback.entity.dto.ArchiveDTO;
import com.foe.talentmanagementback.entity.pojo.T_archive_detail;
import com.foe.talentmanagementback.entity.dto.WorkExperienceDTO;
import com.foe.talentmanagementback.entity.enums.ResultMsg;
import com.foe.talentmanagementback.mapper.T_archive_detailMapper;
import com.foe.talentmanagementback.service.IT_archive_detailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.foe.talentmanagementback.utils.DateUtils;
import com.foe.talentmanagementback.utils.ResultUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */


@Service
public class T_archive_detailServiceImpl extends ServiceImpl<T_archive_detailMapper, T_archive_detail> implements IT_archive_detailService {

    @Autowired
    private T_archive_detailMapper archive_detailMapper;

    @Autowired
    private T_companyServiceImpl companyService;

    @Autowired
    private T_departmentServiceImpl departmentService;

    @Autowired
    private T_workerServiceImpl workerService;
    @Autowired
    private T_evaluation_detailsServiceImpl evaluationDetailsService;

    /**
     * @author: Matt
     * @date: 2021-07-14 11:04
     * @description:
     */

    @Override
    public Result<List<WorkExperienceDTO>> getArchivesByTalentId(int talentId) {
        ModelMapper modelMapper = new ModelMapper();
        QueryWrapper<T_archive_detail> queryWrapperArchive = new QueryWrapper();

        queryWrapperArchive.eq("talent_id",talentId);
        List<T_archive_detail> archiveDetails =  archive_detailMapper.selectList(queryWrapperArchive);
        List<WorkExperienceDTO> workExperienceDTOS = new ArrayList<>();
        if(archiveDetails == null){
            return ResultUtils.error(ResultMsg.TALENT_ARCHIVE_NOT_EXIST);
        }

        for (T_archive_detail archiveDetail: archiveDetails
             ) {
            archiveDetail.setEntryTime(DateUtils.dateConvert(archiveDetail.getEntryTime()));
            WorkExperienceDTO workExperienceDTO = modelMapper.map(archiveDetail,WorkExperienceDTO.class);
            workExperienceDTO.setCompanyName(companyService
                    .getCompanyById(archiveDetail.getCompanyId())
                    .getName());
            workExperienceDTO.setDepartmentNameLast(departmentService
                    .getDepartmentById(archiveDetail.getDepartmentLast())
                    .getDepartmentName());
            workExperienceDTOS.add(workExperienceDTO);
        }
        return ResultUtils.success(ResultMsg.SUCCESS,workExperienceDTOS);
    }

    /**
     * @author: Matt
     * @date: 2021-07-14 11:04
     * @description:
     */

    @Override
    public Result<ExperienceDetailBO> getArchiveBytIdWcId(int talentId, int companyId) {
        QueryWrapper<T_archive_detail> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("talent_id",talentId);
        queryWrapper.eq("company_id",companyId);
        T_archive_detail archiveDetail = archive_detailMapper.selectOne(queryWrapper);
        if(archiveDetail ==null)
            return ResultUtils.error(ResultMsg.ARCHIVE_NOT_EXIST);

        Integer archiveId = archiveDetail.getId();
        ModelMapper modelMapper = new ModelMapper();
        ExperienceDetailBO experienceDetailBO = new ExperienceDetailBO();
        ArchiveDTO archive = modelMapper.map(archiveDetail, ArchiveDTO.class);

        //程序要求必须有入职时间，因此先检测入职时间是否存在
        if (archiveDetail.getEntryTime()==null){
            return ResultUtils.error(ResultMsg.ENTRY_TIME_IS_NULL);
        }

        //求工作天数
        archive.setWorkingDays(DateUtils.getDaysInterval(archiveDetail.getEntryTime(),archiveDetail.getQuitTime()));

        //存入ArchiveDTO
        experienceDetailBO.setArchive(archive);
        //存入工作经历
        experienceDetailBO.setWorkExperience(this.workerService.getWorkerByArchiveId(archiveId).getData());
//        存入需要发送的评价表数据
        experienceDetailBO.setEvaluationSends(this.evaluationDetailsService.getEvaluationsByArchiveId(archiveId).getData());
//        存入评价表的统计数据
        experienceDetailBO.setEvaluationStatistic(this.evaluationDetailsService.getEvaluationStatisticByArchiveId(archiveId).getData());
        return ResultUtils.success(ResultMsg.SUCCESS,experienceDetailBO);
    }
}
