package com.foe.talentmanagementback.utils;

import com.foe.talentmanagementback.entity.enums.UserRight;
import com.foe.talentmanagementback.service.impl.T_departmentServiceImpl;
import com.foe.talentmanagementback.service.impl.T_hrServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author: Matt
 * @date: 2021/7/12/10:37
 * @description:
 */
@Component
public class RightUtils {

    @Autowired
    private T_hrServiceImpl hrService;
    @Autowired
    private T_departmentServiceImpl departmentService;

    public UserRight confirmRight(Integer talentId){
        System.out.println(hrService.getHrByTalentId(1));
        if(hrService.getHrByTalentId(talentId)
                != null){
            return UserRight.HR_USER;
        }
        if (departmentService.getDepartmentByTalentId(talentId) != null){
            return UserRight.MANAGER_USER;
        }
        return UserRight.NORMAL_USER;
    }
}
