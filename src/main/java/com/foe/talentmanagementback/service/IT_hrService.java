package com.foe.talentmanagementback.service;

import com.foe.talentmanagementback.entity.pojo.T_hr;
import com.baomidou.mybatisplus.extension.service.IService;


public interface IT_hrService extends IService<T_hr> {

     T_hr getHrByTalentId(int id);
}
