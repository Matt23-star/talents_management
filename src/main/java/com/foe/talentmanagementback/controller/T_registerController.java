package com.foe.talentmanagementback.controller;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.service.impl.T_registerServiceImpl;
import com.foe.talentmanagementback.utils.ResultUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/11/15:56
 * @Description:
 */
@RestController
@Api(tags = "注册接口")
@RequestMapping("/registerPage")
public class T_registerController {
    @Autowired
    private T_registerServiceImpl registerService;
    @PostMapping("/register")
    @ApiOperation(value = "输入用户名和密码注册")
    public Result register(@RequestParam(value="account") String account,
                           @RequestParam(value="password") String password){

        return registerService.register(account,password);
    }
}
