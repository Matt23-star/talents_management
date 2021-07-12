package com.foe.talentmanagementback.controller;


import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.T_talent;
import com.foe.talentmanagementback.entity.dto.UserDTO;
import com.foe.talentmanagementback.service.impl.T_loginServiceImpl;
import com.foe.talentmanagementback.service.impl.T_registerServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import javaslang.collection.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Matt
 * @Date: 2021/07/09/23:11
 * @Description:
 */
@RestController
@Api(value = "登录和注册接口", tags = "登录和注册接口")
@RequestMapping("/loginPage")
public class T_loginController {

    @Autowired
    private T_loginServiceImpl loginService;
    @Autowired
    private T_registerServiceImpl registerService;

    @PostMapping("/login")
    @ApiOperation(value = "通过account和password登录系统，返回UserDTO")
    public Result<UserDTO> login(@RequestParam("account") String account,
                                 @RequestParam("password") String password) {
        return  loginService.login(account,password);
    }
}

