package com.foe.talentmanagementback.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

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
public class MailTemplateUtils {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public String getHtml(String title, String userName, String type, String captcha) {
        String emailTemplet = System.getProperty("mail_template");
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

            ClassPathResource classPathResource = new ClassPathResource("templates/mail_template.html");
            InputStream resourceAsStream = classPathResource.getInputStream();
//          考虑到编码格式
            InputStreamReader read = new InputStreamReader(
                    resourceAsStream, encoding);
            BufferedReader bufferedReader = new BufferedReader(read);
            String lineTxt = null;
            while ((lineTxt = bufferedReader.readLine()) != null) {
                sb.append(lineTxt);
            }
            System.setProperty("mail_template", sb.toString());
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