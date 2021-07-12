package com.foe.talentmanagementback.service;

import com.foe.talentmanagementback.entity.T_company;
import com.baomidou.mybatisplus.extension.service.IService;
import com.foe.talentmanagementback.entity.T_department;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
public interface IT_companyService extends IService<T_company> {

    public T_company getCompanyById(Integer id);
}
