package com.foe.talentmanagementback.controller;


import com.foe.talentmanagementback.entity.Result;
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
 * 绩效考勤表 前端控制器
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
@RestController
@Api(value = "到勤情况接口", tags = "到勤情况接口")
@RequestMapping("/workAttendance")
public class T_work_attendanceController {

//    @Autowired
//    private T_work_attendanceServiceImpl workAttendanceService;
//
//    @GetMapping("/archiveDetailId/{archiveDetailId}")
//    @ApiOperation(value = "查询系统人才的所有档案，这些档案属于不同公司")
//    public Result<List<T_work_attendance>> getArchivesOfTalent(@ApiParam(value = "档案id",required = true)@PathVariable("archiveDetailId") int archiveDetailId){
//        return workAttendanceService.getAttendancesByADId(archiveDetailId);
//    }
}

