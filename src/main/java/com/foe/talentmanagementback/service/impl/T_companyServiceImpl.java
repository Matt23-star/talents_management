package com.foe.talentmanagementback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.T_company;
import com.foe.talentmanagementback.entity.T_department;
import com.foe.talentmanagementback.entity.T_talent;
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
    @Autowired
    private T_talentMapper talentMapper;
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
    public Result<List<T_talent>> getTalentByCompanyId(int companyId) {
        QueryWrapper queryWrapper =new QueryWrapper();
        queryWrapper.eq("company_id",companyId);
        return ResultUtils.success(talentMapper.selectList(queryWrapper));
    }
}
