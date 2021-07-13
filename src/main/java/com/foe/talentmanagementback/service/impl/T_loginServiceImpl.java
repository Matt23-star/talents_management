package com.foe.talentmanagementback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.foe.talentmanagementback.entity.*;
import com.foe.talentmanagementback.entity.dto.UserDTO;
import com.foe.talentmanagementback.entity.enums.JobStatus;
import com.foe.talentmanagementback.entity.enums.ResultMsg;
import com.foe.talentmanagementback.entity.pojo.T_archive_detail;
import com.foe.talentmanagementback.entity.pojo.T_login;
import com.foe.talentmanagementback.entity.pojo.T_talent;
import com.foe.talentmanagementback.entity.pojo.T_worker;
import com.foe.talentmanagementback.mapper.*;
import com.foe.talentmanagementback.service.IT_loginService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.foe.talentmanagementback.utils.ResultUtils;
import com.foe.talentmanagementback.utils.RightUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Matt
 * @Date: 2021/07/09/23:11
 * @Description:
 */
@Service
public class T_loginServiceImpl extends ServiceImpl<T_loginMapper, T_login> implements IT_loginService {


    @Autowired
    private T_loginMapper loginMapper;

    @Autowired
    private T_talentMapper talentMapper;

    @Autowired
    private T_nationMapper nationMapper;

    @Autowired
    private T_archive_detailMapper archiveDetailMapper;

    @Autowired
    private T_workerMapper workerMapper;

    @Autowired
    private T_departmentServiceImpl departmentService;

    @Autowired
    private T_companyServiceImpl companyService;

    @Autowired
    private RightUtils rightUtils;

    @Override
    public Result<UserDTO> login(String account, String password) {
        QueryWrapper<T_login> queryWrapperLogin = new QueryWrapper<>();
        QueryWrapper<T_talent> queryWrapperTalent = new QueryWrapper<>();
        QueryWrapper<T_archive_detail> queryWrapperArchive = new QueryWrapper<>();
        QueryWrapper<T_worker> queryWrapperWorker = new QueryWrapper<>();

        //登录鉴权
        queryWrapperLogin.eq("account_number", account);
        queryWrapperLogin.eq("password", password);
        T_login login = loginMapper.selectOne(queryWrapperLogin);
        if (login == null) {
            return ResultUtils.error(new ResultMessage(404, "该用户不存在！"));
        }

        //获取talent信息
        queryWrapperTalent.eq("account_number", login.getAccountNumber());
        T_talent talent = talentMapper.selectOne(queryWrapperTalent);

        //使用ModelMapper 映射到UserDTO
        ModelMapper modelMapper = new ModelMapper();
        UserDTO userDTO = modelMapper.map(talent,UserDTO.class);

        //若talent能查到
        if(talent!=null) {
            //根据talent信息设置公司名、民族名、头像路径以及工作状态
            userDTO.setCompanyName(companyService
                    .getCompanyById(talent.getCompanyId())
                    .getName());
            userDTO.setNation(nationMapper
                    .selectById(talent.getNationId())
                    .getName());
            userDTO.setHeadPortrait(login.getHeadPortrait());
            if (talent.getJobStatus() == 0) {
                userDTO.setJobStatusEnum(JobStatus.UNEMPLOYED.getJobStatus());
            } else userDTO.setJobStatusEnum(JobStatus.EMPLOYED.getJobStatus());
            userDTO.setUserRight(rightUtils.confirmRight(talent.getId()));

            //查询档案记录
            queryWrapperArchive.eq("talent_id", talent.getId());
            queryWrapperArchive.eq("company_id", talent.getCompanyId());
            T_archive_detail archiveDetail = archiveDetailMapper.selectOne(queryWrapperArchive);
            if (archiveDetail!=null) {
                    userDTO.setDepartmentName(departmentService
                            .getDepartmentByTalentId(archiveDetail.getDepartmentLast())
                            .getDepartmentName());
                    userDTO.setPosition(archiveDetail.getPositionLast());
                }
            }
        return ResultUtils.success(ResultMsg.SUCCESS, userDTO);
    }
}
