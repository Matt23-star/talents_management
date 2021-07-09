package com.foe.talentmanagementback.controller;


import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.T_talent;
import com.foe.talentmanagementback.service.impl.T_talentServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/09/23:11
 * @Description:
 */
@RestController
@Api(tags = "系统人才接口")
@RequestMapping("/talent")
public class T_talentController {
    @Autowired
    private T_talentServiceImpl talentService;

    @GetMapping("/all")
    @ApiOperation(value = "查询所有人才")
    public Result<List<T_talent>> getTalents(){
        return talentService.getTalents();
    }

    @GetMapping("/name/{name}")
    @ApiOperation(value = "通过姓名查询人才")
    public Result<T_talent> getTalentByName(@PathVariable("name") String name){
        return talentService.getTalentByName(name);
    }

    @GetMapping("/id/{id}")
    @ApiOperation(value = "通过id查询人才")
    public Result<T_talent> getTalentByName(@PathVariable("id") long id){
        return talentService.getTalentById(id);
    }

    @GetMapping("/hrid/{id}")
    @ApiOperation(value = "通过hr的系统id查询所管理人才数据")
    public Result<List<T_talent>> getWorkersByHrId(@PathVariable("id")int id){
        return talentService.getWorkersByHrId(id);

    }
}

