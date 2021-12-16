package com.foe.talentmanagementback.service;


import com.foe.talentmanagementback.entity.Result;



public interface MailService {

    Result<String> sendVerifyEmail(String account, String email);

    Result<Boolean> sendEmailToTalent(Integer toId, String title, String content);


}
