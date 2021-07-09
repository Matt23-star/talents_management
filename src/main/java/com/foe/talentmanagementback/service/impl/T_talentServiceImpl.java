package com.foe.talentmanagementback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.foe.talentmanagementback.entity.*;
import com.foe.talentmanagementback.mapper.*;
import com.foe.talentmanagementback.service.IT_talentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.foe.talentmanagementback.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
@Service
public class T_talentServiceImpl extends ServiceImpl<T_talentMapper, T_talent> implements IT_talentService {
    @Autowired
    private T_talentMapper talentMapper;
    @Autowired
    private T_hrMapper hrMapper;
    @Autowired
    private T_departmentMapper departmentMapper;
    @Autowired
    private T_companyMapper companyMapper;
    @Autowired
    private T_workerMapper workerMapper;


    @Override
    public Result<List<T_talent>> getTalents() {
        return ResultUtils.success(talentMapper.selectList(null));
    }

    public Result<T_talent> getTalentByName(String name) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("name", name);
        return ResultUtils.success(talentMapper.selectOne(queryWrapper));
    }

    @Override
    public Result<T_talent> getTalentById(long id) {
        return ResultUtils.success(talentMapper.selectById(id));
    }

    @Override
    public Result<List<T_talent>> getTalentsByLeaderId(int talentId) {
        QueryWrapper queryWrapper = new QueryWrapper();
        QueryWrapper queryWrapper1 = new QueryWrapper();
        queryWrapper1.exists("select company_id from t_hr where hr_talent_id ='"+talentId+"'");
        queryWrapper.eq("company_id",queryWrapper1);
        List<T_worker> workers = workerMapper.selectList(queryWrapper);
        Collection<Integer> talentIds = new ArrayList<>();
        for (T_worker worker:
             workers) {
            talentIds.add(worker.getId());
        }
        QueryWrapper queryWrapper2 = new QueryWrapper();
        queryWrapper2.in("id",talentIds);
        return ResultUtils.success(talentMapper.selectList(queryWrapper2));
    }


}
