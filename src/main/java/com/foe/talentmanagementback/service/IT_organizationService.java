package com.foe.talentmanagementback.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.dto.MyOrganizationDTO;
import org.apache.ibatis.annotations.Select;


public interface IT_organizationService  {

   Result<MyOrganizationDTO> getMyOrganization(int talentId,int companyId);
}
