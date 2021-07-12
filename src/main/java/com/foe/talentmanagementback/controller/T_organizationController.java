package com.foe.talentmanagementback.controller;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.dto.MyOrganizationDTO;
import com.foe.talentmanagementback.service.impl.T_organizationServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/12/9:18
 * @Description:
 */
@RestController
@Api(tags = "获取公司和部门的信息")
@RequestMapping("/mo")
public class T_organizationController {
    @Autowired
    private T_organizationServiceImpl organizationService;
    @GetMapping("/{id}")
    public Result<MyOrganizationDTO> getMyOrganization(@PathVariable("id")int id){
        return organizationService.getMyOrganization(id);
    }
}
