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
    public Result<List<T_talent>> getWorkersByHrId(int hrId) {
        T_hr hr =  hrMapper.selectById(hrId);
        QueryWrapper<T_worker> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("company_id",hr.getCompanyId());
        List<T_worker> workers = workerMapper.selectList(queryWrapper);
        List<Integer> ids = new ArrayList<>();
        for (T_worker w:workers
             ) {
            ids.add(w.getId());
        }
        List<T_talent> result = talentMapper.selectBatchIds(ids);
        return ResultUtils.success(result);
    }



}
