package com.foe.talentmanagementback.controller;


import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.T_talent;
import com.foe.talentmanagementback.service.impl.T_loginServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Matt
 * @Date: 2021/07/09/23:11
 * @Description:
 */
@RestController
@Api(value = "登录接口", tags = "登录接口")
@RequestMapping("/loginPage")
public class T_loginController {

    @Autowired
    private T_loginServiceImpl loginService;

    @GetMapping("/login/{account}/{password}")
    @ApiOperation(value = "通过账号和密码登录系统")
    public Result<T_talent> login(@PathVariable("account") String account,
                                  @PathVariable("password") String password) {
        return  loginService.login(account,password);
    }
}

