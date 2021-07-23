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

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
@Service
public class T_companyServiceImpl extends ServiceImpl<T_companyMapper, T_company> implements IT_companyService {

    @Autowired
    private T_companyMapper companyMapper;
    @Override
    public T_company getCompanyById(Integer id) {
        return companyMapper.selectById(id);
    }

    /**
    * @Description: 通过公司id，查询公司下的所有员工
    * @Param: int companyId
    * @return: Result<List<T_talent>>
    * @Author: 张越
    * @Date: 2021/7/12
    */
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
