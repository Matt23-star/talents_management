package com.foe.talentmanagementback.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author: Matt
 * @date: 2021-07-15 11:23
 * @description: 邮件html格式规范
 */

@Component
public class CodeEmailUtils {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JavaMailSender mailSender;

    @Value("${mail.fromMail.addr}")
    private String from;

    public void sendVerifyEmail(String to, String title, String code, String username) {
        initEmailTemplate();
        MimeMessage message = mailSender.createMimeMessage();
        try {
            logger.info("开始设置");
            //true表示需要创建一个multipart message
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo(to);//邮件接收者
            helper.setSubject(title);//邮件主题
            String email = setCodeEmailHtml(title, username, "注册验证", code);
            helper.setText(email, true);//邮件内容
            logger.info("开始发送");
            mailSender.send(message);
            logger.info("邮件发送成功");
        } catch (MessagingException messagingException) {
            logger.error("发送失败！发送人:{}", to);
        }
    }

    public static String setCodeEmailHtml(String title, String userName, String type, String captcha) {
        String emailTemplet = System.getProperty("email_template");
        emailTemplet = emailTemplet.replace("$(title)", title);
        emailTemplet = emailTemplet.replace("$(userName)", userName);
        emailTemplet = emailTemplet.replace("$(type)", type);
        emailTemplet = emailTemplet.replace("$(captcha)", captcha);
        System.out.println("设置完成");
        return emailTemplet;
    }

    /** 
     * Description：容器初始化是加载
     * @return void
     * @author name：yuxin <br>email: yuruixin_china@163.com
     **/

    public void initEmailTemplate() {
        StringBuilder sb = new StringBuilder();
        try {
            String encoding = "UTF-8";

            ClassPathResource classPathResource = new ClassPathResource("templates/email_template.html");
            InputStream resourceAsStream = classPathResource.getInputStream();
//          考虑到编码格式
            InputStreamReader read = new InputStreamReader(
                    resourceAsStream, encoding);
            BufferedReader bufferedReader = new BufferedReader(read);
            String lineTxt = null;
            while ((lineTxt = bufferedReader.readLine()) != null) {
                sb.append(lineTxt);
            }
            System.setProperty("email_template", sb.toString());
            logger.info("注入文件:"+sb.toString());
            resourceAsStream.close();
            read.close();
            logger.info("注入完成");
        } catch (IOException e) {
            logger.error("读取文件内容出错");
            e.printStackTrace();
        }
    }
}