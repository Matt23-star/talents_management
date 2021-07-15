package com.foe.talentmanagementback;

import com.foe.talentmanagementback.service.MailService;
import com.foe.talentmanagementback.utils.DateUtils;
import com.foe.talentmanagementback.utils.RightUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.Random;

@SpringBootTest
class TalentManagementBackApplicationTests {

    @Autowired
    RightUtils rightUtils;

    @Autowired
    private MailService mailService;

    @Test
    public void Run(){

        System.out.println(DateUtils.getDaysInterval(new Date(1625134110l),null));
    }

    @Test
    void testSimpleMail() throws Exception {

        String checkCode = String.valueOf(new Random().nextInt(899999) + 100000);
        String message = " 【跨平台人才管理组织】验证码:"+checkCode+"，该验证码5分钟内有效，请勿泄露于他人！";
        System.out.println(checkCode);
        mailService.sendSimpleMail("825256547@qq.com","跨平台人才管理平台验证",message);
    }

    @Test
    public void testSend(){


        mailService.sendVerifyEmail("825256547@qq.com","验证码","123445453","username");
    }
}
