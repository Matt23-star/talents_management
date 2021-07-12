package com.foe.talentmanagementback.service;

import com.foe.talentmanagementback.entity.Result;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/11/16:09
 * @Description:
 */
public interface IT_registerService {
    Result register(String account, String passWord);
}
