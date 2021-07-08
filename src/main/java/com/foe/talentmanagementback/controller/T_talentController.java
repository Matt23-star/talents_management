package com.foe.talentmanagementback.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.foe.talentmanagementback.entity.T_talent;
import com.foe.talentmanagementback.mapper.T_talentMapper;
import com.foe.talentmanagementback.service.impl.T_talentServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
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
@Api(value = "系统人才接口")
@RequestMapping("/t_talent")
public class T_talentController {
    @Autowired
    private T_talentServiceImpl talentService;

    @GetMapping("/all")
    @ApiOperation(value = "查询所有人才")
    public List<T_talent> getTalents(){
        return talentService.getTalents();
    }

    @GetMapping("/name/{name}")
    @ApiOperation(value = "通过姓名查询人才")
    public T_talent getTalentByName(@PathVariable("name") String name){
        return talentService.getTalentByName(name);
    }

    @GetMapping("/id/{id}")
    @ApiOperation(value = "通过id查询人才")
    public T_talent getTalentByName(@PathVariable("id") long id){
        return talentService.getTalentById(id);
    }
}

