package com.foe.talentmanagementback.controller;


import com.foe.talentmanagementback.entity.T_archive_detail;
import com.foe.talentmanagementback.entity.T_talent;
import com.foe.talentmanagementback.service.impl.T_archive_detailServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
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
@RequestMapping("/archiveDetail")
@Api(value="档案接口",tags={"档案接口"})
public class T_archive_detailController {

    @Autowired
    T_archive_detailServiceImpl archive_detailService;

    @RequestMapping("/hello")
    public String hello(){

        return "talentName";
    }

    @RequestMapping("/login")
    public String login(String talentName){
        return talentName;
    }

    @GetMapping("/archives/{talentId}")
    @ApiOperation(value = "查询所有人才")
    public List<T_archive_detail> getTalents(@ApiParam(value = "系统人才ID",required = true)@PathVariable("talentId") int talentId){
        return archive_detailService.getArchivesByTalentId(talentId);
    }
}

