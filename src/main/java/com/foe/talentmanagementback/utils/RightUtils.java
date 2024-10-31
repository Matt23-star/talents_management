package com.foe.talentmanagementback.utils;

import com.foe.talentmanagementback.entity.enums.UserRight;
import com.foe.talentmanagementback.service.impl.T_departmentServiceImpl;
import com.foe.talentmanagementback.service.impl.T_hrServiceImpl;
import com.foe.talentmanagementback.service.impl.T_talentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: Matt
 * @date: 2021/7/12/10:37
 * @description: 使用者权限判断
 */

@Component
public class RightUtils {

    @Autowired
    private T_hrServiceImpl hrService;
    @Autowired
    private T_departmentServiceImpl departmentService;

    @Autowired
    private T_talentServiceImpl talentService;

    public UserRight confirmRight(Integer talentId){
        if(hrService.getHrByTalentId(talentId)
                != null){
            return UserRight.HR_USER;
        }
        if (departmentService.getDepartmentByTalentId(talentId) != null){
            return UserRight.MANAGER_USER;
        }
        if(talentService.getTalentById(talentId).getData().getCompanyId()!=null) {
            return UserRight.WORKER_USER;
        }
        return UserRight.NORMAL_USER;
    }
}
