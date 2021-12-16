package com.foe.talentmanagementback.controller;


import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.dto.UserDTO;
import com.foe.talentmanagementback.service.impl.T_loginServiceImpl;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "登录接口")
@RequestMapping("/api/login")
public class T_loginController {

    @Autowired
    private T_loginServiceImpl loginService;

    @PostMapping("")
    @ApiOperation(value = "通过account和password登录系统，返回UserDTO")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "account", value = "用户名account", dataType = "String", paramType = "query", required = true),
            @ApiImplicitParam(name = "password", value = "密码password", dataType = "String", paramType = "query", required = true)
    })
    @ApiResponses(@ApiResponse(code = 200,message = "成功",response = UserDTO.class))
    public Result<UserDTO> login(@RequestParam("account") String account,
                                 @RequestParam("password") String password) {
        return loginService.login(account,password);
    }
}

