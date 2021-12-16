package com.foe.talentmanagementback.service;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.dto.CompanyDTO;
import com.foe.talentmanagementback.entity.dto.TalentDTO;
import com.foe.talentmanagementback.entity.pojo.T_company;
import com.baomidou.mybatisplus.extension.service.IService;
import com.foe.talentmanagementback.entity.pojo.T_talent;

import java.util.List;


public interface IT_companyService extends IService<T_company> {

    T_company getCompanyById(Integer id);

    Result<List<TalentDTO>> getTalentByCompanyId(int companyId);
    Result<List<CompanyDTO>> getCompanies();
}
