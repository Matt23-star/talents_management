package com.foe.talentmanagementback.service;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.pojo.T_department;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface IT_departmentService extends IService<T_department> {

    T_department getDepartmentByTalentId(Integer talentId);

    T_department getDepartmentById(Integer departmentId);

    Result<List<T_department>> getDepartmentsByCoId(Integer companyId);
}
