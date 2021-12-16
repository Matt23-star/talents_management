package com.foe.talentmanagementback.service;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.pojo.T_login;
import com.baomidou.mybatisplus.extension.service.IService;
import com.foe.talentmanagementback.entity.dto.UserDTO;


public interface IT_loginService extends IService<T_login> {

    Result<UserDTO> login(String account, String password);
}
