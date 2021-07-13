package com.foe.talentmanagementback.service;

import com.foe.talentmanagementback.entity.pojo.T_hr;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
public interface IT_hrService extends IService<T_hr> {

    public T_hr getHrByTalentId(int id);
}
