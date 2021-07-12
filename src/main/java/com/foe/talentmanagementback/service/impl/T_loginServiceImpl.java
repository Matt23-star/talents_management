package com.foe.talentmanagementback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.foe.talentmanagementback.entity.*;
import com.foe.talentmanagementback.entity.dto.UserDTO;
import com.foe.talentmanagementback.entity.enums.JobStatus;
import com.foe.talentmanagementback.entity.enums.ResultMsg;
import com.foe.talentmanagementback.mapper.*;
import com.foe.talentmanagementback.service.IT_loginService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.foe.talentmanagementback.utils.ResultUtils;
import com.foe.talentmanagementback.utils.RightUtils;
import org.apache.catalina.User;
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
    private T_hrMapper hrMapper;


    @Override
    public Result<UserDTO> login(String account, String password) {
        UserDTO userDTO = new UserDTO();
        QueryWrapper<T_login> queryWrapperLogin = new QueryWrapper<>();
        QueryWrapper<T_talent> queryWrapperTalent = new QueryWrapper<>();
        QueryWrapper<T_archive_detail> queryWrapperArchive = new QueryWrapper<>();
        QueryWrapper<T_worker> queryWrapperWorker = new QueryWrapper<>();

        queryWrapperLogin.eq("account_number", account);
        queryWrapperLogin.eq("password", password);
        T_login login = loginMapper.selectOne(queryWrapperLogin);
        if (login == null) {
            return ResultUtils.error(new ResultMessage(404, "该用户不存在！"));
        }

        queryWrapperTalent.eq("account_number", login.getAccountNumber());
        T_talent talent = talentMapper.selectOne(queryWrapperTalent);
        queryWrapperArchive.eq("talent_id",talent.getId());
        queryWrapperArchive.eq("company_id",talent.getCompanyId());
        T_archive_detail archiveDetail = archiveDetailMapper.selectOne(queryWrapperArchive);
        queryWrapperWorker.eq("archive_detail_id", archiveDetail.getId());
        T_worker worker = workerMapper.selectOne(queryWrapperWorker);

        userDTO.setDepartmentName(new T_departmentServiceImpl()
                .getDepartmentByTalentId(worker.getDepartmentManagerId())
                .getData()
                .getDepartmentName());
        userDTO.setPosition(worker.getPosition());
        userDTO.setNation(nationMapper.selectById(talent.getNationId()).getName());
        if (talent.getJobStatus() == 0) {
            userDTO.setJobStatus("未就业");
        } else userDTO.setJobStatus("已就业");
        userDTO.setHeadPortrait(login.getHeadPortrait());
        userDTO.setUserRight(new RightUtils().confirmRight(talent.getId()));
        return ResultUtils.success(ResultMsg.SUCCESS, userDTO);
    }
}
