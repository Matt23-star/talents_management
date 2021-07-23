package com.foe.talentmanagementback.controller;


import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.dto.CompanyDTO;
import com.foe.talentmanagementback.entity.dto.TalentDTO;
import com.foe.talentmanagementback.entity.pojo.T_talent;
import com.foe.talentmanagementback.service.impl.T_companyServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
@RestController
@RequestMapping("/api/companies")
@Api(tags = "公司接口")
public class T_companyController {

    @Autowired
    private T_companyServiceImpl companyService;

    /**
     * @Description:
     * @Param:
     * @return:
     * @Author: 张越
     * @Date: 2021/7/12
     */
    @GetMapping("/{companyid}/talents")
    @ApiOperation(value = "输入company的id，返回该hr公司下的所有T_tanlent数据")
    public Result<List<TalentDTO>> getWorkersByHrId(@PathVariable("companyid") int companyId) {
        return companyService.getTalentByCompanyId(companyId);
    }

    @GetMapping("")
    @ApiOperation(value = "获取所有公司名称和id")
    public Result<List<CompanyDTO>> getCompanies() {
        return companyService.getCompanies();
    }
}

