package com.foe.talentmanagementback.mapper;

import com.foe.talentmanagementback.entity.T_talent;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

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
