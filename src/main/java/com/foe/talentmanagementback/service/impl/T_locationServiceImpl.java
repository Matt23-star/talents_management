package com.foe.talentmanagementback.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.enums.ResultMsg;
import com.foe.talentmanagementback.entity.pojo.T_location;
import com.foe.talentmanagementback.mapper.T_locationMapper;
import com.foe.talentmanagementback.service.T_locationService;
import com.foe.talentmanagementback.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Matt
 * @date: 2021/7/19/20:42
 * @description:
 */

@Service
public class T_locationServiceImpl extends ServiceImpl<T_locationMapper, T_location> implements T_locationService {

    @Autowired
    private T_locationMapper locationMapper;

    public void addLocation(T_location location){
        locationMapper.insert(location);
    }

    @Override
    public Result<List<T_location>> getLocatons() {
        return ResultUtils.success(ResultMsg.SUCCESS,locationMapper.selectList(null));
    }
}
