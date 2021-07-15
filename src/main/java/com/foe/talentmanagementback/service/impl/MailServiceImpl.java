package com.foe.talentmanagementback.service.impl;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.enums.ResultMsg;
import com.foe.talentmanagementback.service.MailService;
import com.foe.talentmanagementback.utils.MailTemplateUtils;
import com.foe.talentmanagementback.utils.ResultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Random;


/**
 * @author: Matt
 * @date: 2021-07-15 10:20
 * @description: 邮箱发送
 */

@Service
public class MailServiceImpl implements MailService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MailTemplateUtils emailTemplate;

    @Autowired
    private JavaMailSender mailSender;

    @Value("${mail.fromMail.addr}")
    private String from;


    @Override
    public Result<String> getCheckCode(String account, String email) {
        String checkCode = String.valueOf(new Random().nextInt(899999) + 100000);
        sendVerifyEmail(email, "跨组织人才管理系统验证码", checkCode, account);
        return ResultUtils.success(ResultMsg.SUCCESS,checkCode);
    }

    //发送固定html模板的邮件，模板在src/main/resources/templates/mail_template.html
    @Override
    public void sendVerifyEmail(String to, String title, String code, String username) {
        emailTemplate.initEmailTemplate();
        MimeMessage message = mailSender.createMimeMessage();
        try {
            //true表示需要创建一个multipart message
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo(to);//邮件接收者
            helper.setSubject(title);//邮件主题
            String email = emailTemplate.getHtml(title, username, "注册验证", code);
            helper.setText(email, true);//邮件内容
            mailSender.send(message);
            logger.debug("邮件发送成功");
        } catch (MessagingException messagingException) {
            logger.error("发送失败！发送人:{}", to);
        }
    }

    //发送最基础邮件，只包含标题 和 内容
    @Override
    public void sendSimpleMail(String to, String subject, String content) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);

        try {
            mailSender.send(message);
            logger.info("简单邮件已经发送。");
        } catch (Exception e) {
            logger.error("发送简单邮件时发生异常！", e);
        }
    }

    //发送一个html页面
    @Override
    public void sendHtmlMail(String to, String subject, String content) {
        MimeMessage message = mailSender.createMimeMessage();

        try {
            //true表示需要创建一个multipart message
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content, true);

            mailSender.send(message);
            logger.info("html邮件发送成功");
        } catch (MessagingException e) {
            logger.error("发送html邮件时发生异常！", e);
        }
    }
}