package com.foe.talentmanagementback.service;

/**
 * @author: Matt
 * @date: 2021/7/15/10:18
 * @description:
 */

import com.foe.talentmanagementback.entity.Result;

/**
 * @author: Matt
 * @date: 2021-07-15 10:20
 * @description:
 */

public interface MailService {

    Result<String> getCheckCode(String account, String email);

    public void sendVerifyEmail(String from,String to, String title, String code, String username);

    void sendSimpleMail(String from,String to, String subject, String content);

    void sendHtmlMail(String from,String to, String subject, String content);
}
