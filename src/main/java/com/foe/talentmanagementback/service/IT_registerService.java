package com.foe.talentmanagementback.service;

import com.foe.talentmanagementback.entity.Result;

public interface IT_registerService {
    Result register(String account, String passWord);
}
