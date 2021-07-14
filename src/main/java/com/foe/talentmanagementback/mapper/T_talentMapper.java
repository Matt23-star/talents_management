package com.foe.talentmanagementback.mapper;

import com.foe.talentmanagementback.entity.dto.TalentDTO;
import com.foe.talentmanagementback.entity.pojo.T_talent;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/09/23:11
 * @Description:
 */

@Component
public interface T_talentMapper extends BaseMapper<T_talent> {

}
