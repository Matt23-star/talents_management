package com.foe.talentmanagementback.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.dto.TalentDTO;
import com.foe.talentmanagementback.entity.dto.TalentSquareDTO;
import com.foe.talentmanagementback.entity.pojo.R_ConditionReceiver;
import com.foe.talentmanagementback.entity.pojo.T_talent;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/09/23:11
 * @Description:
 */

@Component
public interface T_talentMapper extends BaseMapper<T_talent> {
    IPage<TalentSquareDTO> getTalentInSquare(Page<T_talent> page, @Param("r") R_ConditionReceiver r);
}
