package com.foe.talentmanagementback.service.impl;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.enums.ResultMsg;
import com.foe.talentmanagementback.entity.pojo.T_talent;
import com.foe.talentmanagementback.service.MailService;
import com.foe.talentmanagementback.utils.CodeHtmlUtils;
import com.foe.talentmanagementback.utils.MailUtils;
import com.foe.talentmanagementback.utils.ResultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Random;


/**
 * @author: Matt
 * @date: 2021-07-15 10:20
 * @description: 邮箱发送
 */

@Component
public class MailServiceImpl implements MailService {

    @Value("${mail.fromMail.addr}")
    private String from;
    @Autowired
    private CodeHtmlUtils codeHtmlUtils;

    @Autowired
    private MailUtils mailUtils;

    @Autowired
    private T_talentServiceImpl talentService;

    @Override
    public Result<String> sendVerifyEmail(String account, String email) {
        String checkCode = String.valueOf(new Random().nextInt(899999) + 100000);
        codeHtmlUtils.initEmailTemplate();
        String content = codeHtmlUtils.setCodeEmailHtml("跨组织人才管理系统验证码", account, "注册验证", checkCode);
        mailUtils.sendHtmlEmail(email, "跨组织人才管理系统验证码", content);
        return ResultUtils.success(ResultMsg.SUCCESS, checkCode);
    }

    @Override
    public Result<Boolean> sendEmailToTalent(Integer toId, String title, String content) {
        T_talent talent = talentService.getTalentById(toId).getData();
        return ResultUtils.success(ResultMsg.SUCCESS, mailUtils.sendHtmlEmail(talent.getEmail(), title, content));
    }

}