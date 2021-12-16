package com.foe.talentmanagementback.controller;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.dto.NormalEmailDTO;
import com.foe.talentmanagementback.service.impl.MailServiceImpl;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/mails")
@Api(tags = "邮箱接口")
public class MailController {

    @Autowired
    private MailServiceImpl mailService;

    @PostMapping("/poll-codes")
    @ApiOperation(value = "通过account和email发送验证码，返回验证码")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "account", value = "用户名account", dataType = "String", paramType = "query", required = true),
            @ApiImplicitParam(name = "email", value = "用户邮箱email", dataType = "String", paramType = "query", required = true)
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功", response = String.class),
            @ApiResponse(code = 503, message = "邮件发送失败")
    })
    public Result<String> getPollCode(@RequestParam("account") String account,
                                      @RequestParam("email") String password) {
        return mailService.sendVerifyEmail(account, password);
    }

//    @PostMapping("/retrieve-passwords")
//    @ApiOperation(value = "")
//    @ApiImplicitParams({
//            @ApiImplicitParam
//    })
//    public Result<String> retrievePassword(){
//        return mailService.sendVerifyEmail();
//    }

    @PostMapping("/send")
    @ApiOperation(value = "通过toId、title和content发送邮件，返回是否成功")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "toId", value = "接收方Id", dataType = "Integer", paramType = "query", required = true),
            @ApiImplicitParam(name = "title", value = "发送邮件的标题title", dataType = "String", paramType = "query", required = true),
            @ApiImplicitParam(name = "content", value = "发送邮件的内容content", dataType = "String", paramType = "query", required = true)
    })
    public Result<Boolean> sendEmail(@RequestBody NormalEmailDTO normalEmail) {
        return mailService.sendEmailToTalent(normalEmail.getToId(), normalEmail.getTitle(), normalEmail.getContent());
    }
}
