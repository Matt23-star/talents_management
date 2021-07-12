package com.foe.talentmanagementback.service.impl;

import com.foe.talentmanagementback.entity.T_company;
import com.foe.talentmanagementback.entity.T_department;
import com.foe.talentmanagementback.mapper.T_companyMapper;
import com.foe.talentmanagementback.service.IT_companyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class T_companyServiceImpl extends ServiceImpl<T_companyMapper, T_company> implements IT_companyService {

    @Autowired
    private T_companyMapper companyMapper;

    @Override
    public T_company getCompanyById(Integer id) {
        return companyMapper.selectById(id);
    }
}
