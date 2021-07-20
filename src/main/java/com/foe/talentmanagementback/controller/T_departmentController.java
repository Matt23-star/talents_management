package com.foe.talentmanagementback.controller;


import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.pojo.T_department;
import com.foe.talentmanagementback.entity.enums.ResultMsg;
import com.foe.talentmanagementback.service.impl.T_departmentServiceImpl;
import com.foe.talentmanagementback.utils.ResultUtils;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@Api(tags = "部门接口")
@RequestMapping("/api/department")
public class T_departmentController {

    @Autowired
    private T_departmentServiceImpl departmentService;

    /**
     * @author: Matt
     * @date: 2021-07-09 17:15
     * @description:
     */
    @GetMapping("/talentId/{talentId}")
    @ApiOperation(value = "通过部门经理talentId查询部门信息，成功返回T_department，失败返回错误信息")
    @ApiImplicitParam(name = "talentId", value = "部门经理id", dataType = "Integer", paramType = "path", required = true)
    @ApiResponses(@ApiResponse(code = 200,message = "成功",response = T_department.class))
    public Result<T_department> getDepartmentByManager(@PathVariable("talentId") Integer talentId) {
        return ResultUtils.success(ResultMsg.SUCCESS, departmentService.getDepartmentByTalentId(talentId));
    }

    @GetMapping("/{departmentId}")
    @ApiOperation(value = "通过部门departmentId查询部门信息，成功返回")
    @ApiImplicitParam(name = "departmentId", value = "部门id", dataType = "Integer", paramType = "path", required = true)
    @ApiResponses(@ApiResponse(code = 200,message = "成功",response = T_department.class))
    public Result<T_department> getDepartmentById(@PathVariable("departmentId") Integer departmentId) {
        return ResultUtils.success(ResultMsg.SUCCESS, departmentService.getDepartmentById(departmentId));
    }

    @GetMapping("/companies/{companyId}")
    @ApiOperation(value = "通过部门companyId查询部门信息，成功返回")
    @ApiImplicitParam(name = "companyId", value = "公司id", dataType = "Integer", paramType = "path", required = true)
    @ApiResponses(@ApiResponse(code = 200,message = "成功",response = T_department.class))
    public Result<List<T_department>> getDepartmentsByCoId(@PathVariable("companyId") Integer companyId){
        return departmentService.getDepartmentsByCoId(companyId);
    }
}

