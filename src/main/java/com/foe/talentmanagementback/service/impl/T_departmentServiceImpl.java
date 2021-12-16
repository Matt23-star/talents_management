package com.foe.talentmanagementback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.enums.ResultMsg;
import com.foe.talentmanagementback.entity.pojo.T_department;
import com.foe.talentmanagementback.mapper.T_departmentMapper;
import com.foe.talentmanagementback.service.IT_departmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.foe.talentmanagementback.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class T_departmentServiceImpl extends ServiceImpl<T_departmentMapper, T_department> implements IT_departmentService {

    @Autowired
    private T_departmentMapper departmentMapper;

    @Override
    public T_department getDepartmentByTalentId(Integer talentId) {
        QueryWrapper<T_department> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("department_manager_id", talentId);
        return departmentMapper.selectOne(queryWrapper);
    }

    @Override
    public T_department getDepartmentById(Integer departmentId) {
        return departmentMapper.selectById(departmentId);
    }

    @Override
    public Result<List<T_department>> getDepartmentsByCoId(Integer companyId) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("company_id", companyId);
        List<T_department> departmentList = departmentMapper.selectList(queryWrapper);
        if (departmentList.isEmpty())
            return ResultUtils.error(ResultMsg.NO_DEPARTMENT_IN_COMPANY);
        return ResultUtils.success(ResultMsg.SUCCESS, departmentList);
    }

}
