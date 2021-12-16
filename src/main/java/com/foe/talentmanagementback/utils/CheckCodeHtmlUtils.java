package com.foe.talentmanagementback.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


@Component
public class CheckCodeHtmlUtils {

    private static final Logger logger = LoggerFactory.getLogger(CheckCodeHtmlUtils.class);

    public static String setCodeEmailHtml(String title, String userName, String type, String captcha) {
        String emailTemplet = System.getProperty("email_template");
        emailTemplet = emailTemplet.replace("$(title)", title);
        emailTemplet = emailTemplet.replace("$(userName)", userName);
        emailTemplet = emailTemplet.replace("$(type)", type);
        emailTemplet = emailTemplet.replace("$(captcha)", captcha);
        System.out.println("设置完成");
        return emailTemplet;
    }



    public static void initEmailTemplate() {
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