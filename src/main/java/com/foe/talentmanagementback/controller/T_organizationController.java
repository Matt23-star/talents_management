package com.foe.talentmanagementback.controller;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.dto.MyOrganizationDTO;
import com.foe.talentmanagementback.service.impl.T_organizationServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Api(tags = "获取公司和部门的信息")
@RequestMapping("/api/organizations")
public class T_organizationController {
    @Autowired
    private T_organizationServiceImpl organizationService;

    @GetMapping("/{companyId}/talents/{talentId}")
    public Result<MyOrganizationDTO> getMyOrganization(@PathVariable("companyId")int companyId,@PathVariable("talentId")int talentId){
        return organizationService.getMyOrganization(talentId,companyId);
    }
}
