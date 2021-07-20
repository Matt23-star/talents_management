package com.foe.talentmanagementback.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.pojo.T_location;

import java.util.List;

/**
 * @author: Matt
 * @date: 2021/7/19/20:42
 * @description:
 */
public interface T_locationService extends IService<T_location> {

    Result<List<T_location>> getLocatons();
}
