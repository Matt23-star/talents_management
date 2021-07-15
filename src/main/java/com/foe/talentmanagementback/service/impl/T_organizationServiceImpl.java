package com.foe.talentmanagementback.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.ResultMessage;
import com.foe.talentmanagementback.entity.dto.MyOrganizationDTO;
import com.foe.talentmanagementback.mapper.T_organizationMapper;
import com.foe.talentmanagementback.service.IT_organizationService;
import com.foe.talentmanagementback.utils.ResultUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/12/9:42
 * @Description:
 */
@Service
public class T_organizationServiceImpl implements IT_organizationService {
    @Autowired
    private T_organizationMapper organizationMapper;

    @Override
    public Result<MyOrganizationDTO> getMyOrganization(int talentId,int companyId) {

        return ResultUtils.success(new ResultMessage(200,"成功了呢giegie"),organizationMapper.getMyOrganization(talentId,companyId));

    }

}
