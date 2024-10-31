package com.foe.talentmanagementback.service;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.dto.TalentSquareDTO;
import com.foe.talentmanagementback.entity.pojo.R_ConditionReceiver;
import com.foe.talentmanagementback.entity.pojo.T_talent;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

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
    Result addTalent(T_talent newTalent);
    Result updateTalent(T_talent talent);
    Result<List<TalentSquareDTO>> getTalentInSquare(R_ConditionReceiver receiver);
}
