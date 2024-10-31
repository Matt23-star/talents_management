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

    Result<String> sendVerifyEmail(String account, String email);

    Result<Boolean> sendEmailToTalent(Integer toId, String title, String content);


}
