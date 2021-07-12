package com.foe.talentmanagementback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.T_department;
import com.foe.talentmanagementback.mapper.T_departmentMapper;
import com.foe.talentmanagementback.service.IT_departmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.foe.talentmanagementback.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
@Service
public class T_departmentServiceImpl extends ServiceImpl<T_departmentMapper, T_department> implements IT_departmentService {

    @Autowired
    private T_departmentMapper departmentMapper;

    @Override
    public T_department getDepartmentByTalentId(Integer talentId) {
        QueryWrapper<T_department> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("department_manager_id",talentId);
        return departmentMapper.selectOne(queryWrapper);
    }
}
