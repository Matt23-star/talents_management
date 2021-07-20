package com.foe.talentmanagementback.service;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.pojo.T_location;

import java.util.List;

/**
 * @author: Matt
 * @date: 2021/7/19/20:01
 * @description:
 */
public interface MapService {

    Result<List<T_location>> getTalentsAddress();
}
