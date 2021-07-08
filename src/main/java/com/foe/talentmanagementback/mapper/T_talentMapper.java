package com.foe.talentmanagementback.mapper;

import com.foe.talentmanagementback.entity.T_talent;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */

@Component
public interface T_talentMapper extends BaseMapper<T_talent> {

}
