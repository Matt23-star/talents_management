package com.foe.talentmanagementback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.dto.WorkExperienceListDTO;
import com.foe.talentmanagementback.entity.enums.ResultMsg;
import com.foe.talentmanagementback.entity.pojo.T_department;
import com.foe.talentmanagementback.entity.pojo.T_worker;
import com.foe.talentmanagementback.mapper.T_workerMapper;
import com.foe.talentmanagementback.service.IT_workerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.foe.talentmanagementback.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Matt
 * @Date: 2021/07/09/23:11
 * @Description:
 */
@Service
public class T_workerServiceImpl extends ServiceImpl<T_workerMapper, T_worker> implements IT_workerService {

    @Autowired
    private T_workerMapper workerMapper;

    @Autowired
    private T_departmentServiceImpl departmentService;

    /**
     * @author: Matt
     * @date: 2021-07-14 10:53
     * @description: 通过档案id查询t_worker表，获得工作者记录集合workerList，
     * 然后访问每个节点，对WorkExperienceListDTO中的不同链表属性插入对应节点。
     */

    @Override
    public Result<WorkExperienceListDTO> getWorkerByArchiveId(Integer archiveId) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("archive_detail_id", archiveId);
        List<T_worker> workerList = workerMapper.selectList(queryWrapper);
        if (workerList.isEmpty())
            return ResultUtils.error(ResultMsg.WORKER_NOT_EXIST);
        WorkExperienceListDTO workExperienceListDTO = new WorkExperienceListDTO();
        for (T_worker worker :
                workerList) {
            T_department department = departmentService.getDepartmentByTalentId(worker.getDepartmentManagerId());
            if (department != null) {
                if (department.getDepartmentName() != null) {
                    workExperienceListDTO
                            .getDepartmentNames()
                            .add(department.getDepartmentName());
                }
                if (worker.getPosition() != null) {
                    workExperienceListDTO
                            .getPositions()
                            .add(worker.getPosition());
                }
                if (worker.getWorkingYears() != null) {
                    workExperienceListDTO
                            .getWorkingYears()
                            .add(worker.getWorkingYears());
                }
                if (worker.getSalary() != null) {
                    workExperienceListDTO
                            .getSalaries()
                            .add(worker.getSalary());
                }
            }
        }
        return ResultUtils.success(ResultMsg.SUCCESS, workExperienceListDTO);
    }
}
