package com.foe.talentmanagementback.controller;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.service.impl.MailServiceImpl;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Matt
 * @date: 2021/7/15/13:00
 * @description:
 */

@RestController
@RequestMapping("/api/mails")
public class MailController {

    @Autowired
    private MailServiceImpl mailService;

    @PostMapping("/check-codes")
    @ApiOperation(value = "通过account和email发送验证码，返回验证码")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "account", value = "用户名account", dataType = "String", paramType = "query", required = true),
            @ApiImplicitParam(name = "email", value = "用户邮箱email", dataType = "String", paramType = "query", required = true)
    })
    public Result<String> getCheckCode(@RequestParam("account") String account,
                                       @RequestParam("email") String password) {
        return mailService.sendVerifyEmail(account, password);
    }

    @PostMapping("/send")
    @ApiOperation(value = "通过toId、title和content发送邮件，返回是否成功")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "toId", value = "接收方Id", dataType = "Integer", paramType = "query", required = true),
            @ApiImplicitParam(name = "title", value = "发送邮件的标题title", dataType = "String", paramType = "query", required = true),
            @ApiImplicitParam(name = "content", value = "发送邮件的内容content", dataType = "String", paramType = "query", required = true)
    })
    public Result<Boolean> sendEmail(@RequestParam("toId") Integer toId,
                                    @RequestParam("title") String title,
                                    @RequestParam("content") String content) {
        return mailService.sendEmailToTalent(toId,title,content);
    }
}
