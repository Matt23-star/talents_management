package com.foe.talentmanagementback.controller;


import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.T_talent;
import com.foe.talentmanagementback.service.impl.T_talentServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @ApiOperation(value = "无需参数，返回所有T_tanlent数据")
    public Result<List<T_talent>> getTalents(){
        return talentService.getTalents();
    }

    @GetMapping("/name/{name}")
    @ApiOperation(value = "输入人才姓名，返回所有同名的T_tanlent数据")
    public Result<List<T_talent>> getTalentByName(@PathVariable("name") String name){ return talentService.getTalentByName(name); }
    @GetMapping("/id/{id}")
    @ApiOperation(value = "输入人才id，返回该id对应的T_tanlent数据")
    public Result<T_talent> getTalentById(@PathVariable("id")int  id){
        return talentService.getTalentById(id);
    }

    @GetMapping("/hrid/{id}")
    @ApiOperation(value = "输入hr的id，返回该hr公司下的所有T_tanlent数据")
    public Result<List<T_talent>> getWorkersByHrId(@PathVariable("id")int id){ return talentService.getWorkersByHrId(id); }

    @PostMapping("/add")
    @ApiOperation(value = "接受post请求，T_tanlent中仅name字段必填")
    public Result addTalent(@RequestBody T_talent talent){
        T_talent newTalent =talent;
        return talentService.addTalent(newTalent);
    }
    @PostMapping("/update")
    @ApiOperation(value = "接受post请求，T_tanlent中id,name均为必填字段")
    public Result updateTalent(@RequestBody T_talent talent){
        T_talent updateTalent =talent;
        return talentService.updateTalent(updateTalent);
    }
}

