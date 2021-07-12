package com.foe.talentmanagementback.controller;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.service.impl.T_registerServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/09/23:11
 * @Description:
 */
@RestController
@Api(tags = "注册接口")
@RequestMapping("/api/register")
public class T_registerController {

    @Autowired
    private T_registerServiceImpl registerService;
    /**
     * @Description:
     * @Param:
     * @return:
     * @Author: 张越
     * @Date: 2021/7/12
     */
    @PostMapping("")
    @ApiOperation(value = "输入用户名和密码注册")
    public Result register(@ApiParam(value = "账号",required = true)@RequestParam(value="account") String account,
                           @ApiParam(value = "密码",required = true)@RequestParam(value="password") String password){

        return registerService.register(account,password);
    }
}
