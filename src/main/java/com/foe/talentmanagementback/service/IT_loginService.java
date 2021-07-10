package com.foe.talentmanagementback.service;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.T_login;
import com.baomidou.mybatisplus.extension.service.IService;
import com.foe.talentmanagementback.entity.T_talent;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/09/23:11
 * @Description:
 */
public interface IT_loginService extends IService<T_login> {

    public Result<T_talent> login(String account, String password);
}
