package com.foe.talentmanagementback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.ResultMessage;
import com.foe.talentmanagementback.entity.dto.CompanyDTO;
import com.foe.talentmanagementback.entity.dto.TalentDTO;
import com.foe.talentmanagementback.entity.pojo.T_company;
import com.foe.talentmanagementback.entity.pojo.T_talent;
import com.foe.talentmanagementback.mapper.T_companyMapper;
import com.foe.talentmanagementback.mapper.T_talentMapper;
import com.foe.talentmanagementback.service.IT_companyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.foe.talentmanagementback.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class T_companyServiceImpl extends ServiceImpl<T_companyMapper, T_company> implements IT_companyService {

    @Autowired
    private T_companyMapper companyMapper;
    @Override
    public T_company getCompanyById(Integer id) {
        return companyMapper.selectById(id);
    }


    @Override
    public Result<List<TalentDTO>> getTalentByCompanyId(int companyId) {

        List<TalentDTO> talents = companyMapper.getTalentByCompanyId(companyId);
        return ResultUtils.success(talents);
    }

    @Override
    public Result<List<CompanyDTO>> getCompanies() {
        QueryWrapper queryWrapper =new QueryWrapper();
        List<CompanyDTO> companies = companyMapper.selectList(queryWrapper);
        return ResultUtils.success(new ResultMessage(200,"成功"),companies);
    }
}
