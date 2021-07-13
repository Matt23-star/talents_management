package com.foe.talentmanagementback.controller;


import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.pojo.T_department;
import com.foe.talentmanagementback.entity.enums.ResultMsg;
import com.foe.talentmanagementback.service.impl.T_departmentServiceImpl;
import com.foe.talentmanagementback.utils.ResultUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
@RestController
@Api(value = "部门接口", tags = "部门接口")
@RequestMapping("/api/department")
public class T_departmentController {

    @Autowired
    private T_departmentServiceImpl departmentService;

    @GetMapping("/talentId/{talentId}")
    @ApiOperation(value = "通过部门经理talentId查询部门信息，成功返回T_department，失败返回错误信息")
    @ApiImplicitParam(name = "talentId", value = "部门经理id", dataType = "int", paramType = "path", required = true)
    public Result<T_department> getDepartmentByManager(@PathVariable("talentId") int talentId) {
        return ResultUtils.success(ResultMsg.SUCCESS, departmentService.getDepartmentByTalentId(talentId));
    }

    @GetMapping("/{departmentId}")
    @ApiOperation(value = "通过部门departmentId查询部门信息，成功返回")
    @ApiImplicitParam(name = "departmentId", value = "部门id", dataType = "int", paramType = "path", required = true)
    public Result<T_department> getDepartmentById(@PathVariable("departmentId") int departmentId) {
        return ResultUtils.success(ResultMsg.SUCCESS, departmentService.getDepartmentById(departmentId));
    }

}

