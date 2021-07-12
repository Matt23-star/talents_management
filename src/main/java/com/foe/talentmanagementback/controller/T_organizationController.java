package com.foe.talentmanagementback.controller;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.dto.MyOrganizationDTO;
import com.foe.talentmanagementback.service.impl.T_organizationServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/09/23:11
 * @Description:
 */
@RestController
@Api(tags = "获取公司和部门的信息")
@RequestMapping("/api/organizations")
public class T_organizationController {
    @Autowired
    private T_organizationServiceImpl organizationService;
    /**
     * @Description:
     * @Param:
     * @return:
     * @Author: 张越
     * @Date: 2021/7/12
     */
    @GetMapping("/{id}")
    public Result<MyOrganizationDTO> getMyOrganization(@PathVariable("id")int id){
        return organizationService.getMyOrganization(id);
    }
}
