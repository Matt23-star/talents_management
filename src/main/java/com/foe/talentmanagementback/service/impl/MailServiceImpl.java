package com.foe.talentmanagementback.service.impl;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.enums.ResultMsg;
import com.foe.talentmanagementback.entity.pojo.T_talent;
import com.foe.talentmanagementback.service.MailService;
import com.foe.talentmanagementback.utils.CheckCodeHtmlUtils;
import com.foe.talentmanagementback.utils.MailUtils;
import com.foe.talentmanagementback.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;


/**
 * @author: Matt
 * @date: 2021-07-15 10:20
 * @description: 邮箱发送
 */

@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private CheckCodeHtmlUtils codeHtmlUtils;

    @Autowired
    private MailUtils mailUtils;

    @Autowired
    private T_talentServiceImpl talentService;

    @Override
    public Result<String> sendVerifyEmail(String account, String email) {
        String checkCode = String.valueOf(new Random().nextInt(899999) + 100000);
        codeHtmlUtils.initEmailTemplate();
        String content = codeHtmlUtils.setCodeEmailHtml("跨组织人才管理系统验证码", account, "注册验证", checkCode);
        if (mailUtils.sendHtmlEmail(email, "跨组织人才管理系统验证码", content))
            return ResultUtils.success(ResultMsg.SUCCESS, checkCode);
        return ResultUtils.error(ResultMsg.SEND_EMAIL_FAIL);
    }

    @Override
    public Result<Boolean> sendEmailToTalent(Integer toId, String title, String content) {
        T_talent talent = talentService.getTalentById(toId).getData();
        return ResultUtils.success(ResultMsg.SUCCESS, mailUtils.sendHtmlEmail(talent.getEmail(), title, content));
    }

}