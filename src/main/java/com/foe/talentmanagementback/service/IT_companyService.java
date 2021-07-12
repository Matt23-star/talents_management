package com.foe.talentmanagementback.service;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.T_company;
import com.baomidou.mybatisplus.extension.service.IService;
import com.foe.talentmanagementback.entity.T_department;
import com.foe.talentmanagementback.entity.T_talent;

import java.util.List;

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
    /**
     * @Description: 通过公司id，查询公司下的所有员工
     * @Param: int companyId
     * @return: Result<List<T_talent>>
     * @Author: 张越
     * @Date: 2021/7/12
     */
    Result<List<T_talent>> getTalentByCompanyId(int companyId);
}
