package com.foe.talentmanagementback.service;

import com.foe.talentmanagementback.entity.T_talent;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
public interface IT_talentService extends IService<T_talent> {

    public List<T_talent> getTalents();
    public T_talent getTalentByName(String name);
    public T_talent getTalentById(long id);

}
