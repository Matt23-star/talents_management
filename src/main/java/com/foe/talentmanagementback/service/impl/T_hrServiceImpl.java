package com.foe.talentmanagementback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.foe.talentmanagementback.entity.T_hr;
import com.foe.talentmanagementback.entity.dto.HrDTO;
import com.foe.talentmanagementback.mapper.T_hrMapper;
import com.foe.talentmanagementback.service.IT_hrService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
@Service
public class T_hrServiceImpl extends ServiceImpl<T_hrMapper, T_hr> implements IT_hrService {

    @Autowired
    private T_hrMapper hrMapper;


    @Override
    public HrDTO getHrByTalentId(int talentId) {
        ModelMapper modelMapper = new ModelMapper();

        QueryWrapper<T_hr> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("hr_talent_id",talentId);
        HrDTO hrDTO = modelMapper.map(hrMapper.selectOne(queryWrapper),HrDTO.class);
        return hrDTO;
    }
}
