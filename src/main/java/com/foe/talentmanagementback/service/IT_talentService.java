package com.foe.talentmanagementback.service;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.T_talent;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/09/23:11
 * @Description:
 */
public interface IT_talentService extends IService<T_talent> {

    Result<List<T_talent>> getTalents();
    Result<List<T_talent>> getTalentByName(String name);
    Result<T_talent> getTalentById(int id);
    Result<List<T_talent>> getWorkersByHrId(int talentId);

}
