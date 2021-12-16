package com.foe.talentmanagementback.controller;


import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.dto.TalentSquareDTO;
import com.foe.talentmanagementback.entity.pojo.R_ConditionReceiver;
import com.foe.talentmanagementback.entity.pojo.T_talent;
import com.foe.talentmanagementback.service.impl.T_talentServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "系统人才接口")
@RequestMapping("/api/talents")
public class T_talentController {

    @Autowired
    private T_talentServiceImpl talentService;

    @PostMapping("/square")
    @ApiOperation(value = "搜索条件，返回T_talent数据")
    public Result<List<TalentSquareDTO>> getTalentInSquare(@RequestBody R_ConditionReceiver receiver){
        return  talentService.getTalentInSquare(receiver);
    }


    @GetMapping("")
    @ApiOperation(value = "无需参数，返回所有T_tanlent数据")
    public Result<List<T_talent>> getTalents(){
        return talentService.getTalents();
    }

    @GetMapping("/{name}")
    @ApiOperation(value = "输入人才姓名，返回所有同名的T_tanlent数据")
    public Result<List<T_talent>> getTalentByName(@PathVariable("name") String name){
        return talentService.getTalentByName(name);
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "输入人才id，返回该id对应的T_tanlent数据")
    public Result<T_talent> getTalentById(@PathVariable("id")int  id){
        return talentService.getTalentById(id);
    }

    @PostMapping("")
    @ApiOperation(value = "接受post请求")
    public Result addTalent(@RequestBody T_talent talent){
        T_talent newTalent =talent;
        return talentService.addTalent(newTalent);
    }
    @PutMapping("")
    @ApiOperation(value = "接受put请求，T_tanlent中id为必填字段")
    public Result<T_talent> updateTalent(@RequestBody T_talent talent){
        T_talent updateTalent =talent;
        return talentService.updateTalent(updateTalent);
    }
}

