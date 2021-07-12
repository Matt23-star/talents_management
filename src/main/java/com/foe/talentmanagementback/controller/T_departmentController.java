package com.foe.talentmanagementback.controller;


import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.T_department;
import com.foe.talentmanagementback.entity.T_evaluation_details;
import com.foe.talentmanagementback.service.impl.T_departmentServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
@RestController
@Api(value = "部门接口",tags = "部门接口")
@RequestMapping("/department")
public class T_departmentController {

    @Autowired
    private T_departmentServiceImpl departmentService;

    @GetMapping("/talentId/{talentId}")
    @ApiOperation(value = "查询系统人才的所有档案，这些档案属于不同公司")
    public T_department getArchivesOfTalent(@ApiParam(value = "档案id",required = true)@PathVariable("talentId") int talentId){
        return departmentService.getDepartmentByTalentId(talentId);
    }
}

