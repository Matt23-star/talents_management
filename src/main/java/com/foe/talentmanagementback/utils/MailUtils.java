package com.foe.talentmanagementback.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * @author: Matt
 * @date: 2021/7/16/11:03
 * @description:
 */

@Component
public class MailUtils {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JavaMailSender mailSender;

    @Value("${mail.fromMail.addr}")
    private String from;

    //发送html转为字符串的邮件
    public Boolean sendHtmlEmail(String to, String title, String content) {
        MimeMessage message = mailSender.createMimeMessage();
        try {
            //true表示需要创建一个multipart message
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo(to);//邮件接收者
            helper.setSubject(title);//邮件主题
            helper.setText(content, true);//邮件内容

            logger.info("开始发送");
            mailSender.send(message);
            logger.info("邮件发送成功");
            return true;
        } catch (MessagingException messagingException) {
            logger.error("发送失败！发送人:{}", to);
            return false;
        }
    }

    //发送最基础邮件，只包含标题 和 内容
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
}
