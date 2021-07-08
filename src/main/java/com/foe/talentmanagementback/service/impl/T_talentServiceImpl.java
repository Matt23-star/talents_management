package com.foe.talentmanagementback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.foe.talentmanagementback.entity.T_talent;
import com.foe.talentmanagementback.mapper.T_talentMapper;
import com.foe.talentmanagementback.service.IT_talentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
@Service
public class T_talentServiceImpl extends ServiceImpl<T_talentMapper, T_talent> implements IT_talentService {
    @Autowired
    private T_talentMapper talentMapper;

    @Override
    public List<T_talent> getTalents() {
        return talentMapper.selectList(null);
    }

    public T_talent getTalentByName(String name) {
        QueryWrapper queryWrapper =new QueryWrapper();
        queryWrapper.eq("name",name);
        return  talentMapper.selectOne(queryWrapper);
    }

    @Override
    public T_talent getTalentById(long id) {
        return talentMapper.selectById(id);
    }


}
