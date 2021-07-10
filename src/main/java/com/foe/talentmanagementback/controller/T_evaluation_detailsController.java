package com.foe.talentmanagementback.controller;


import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.T_evaluation_details;
import com.foe.talentmanagementback.service.impl.T_evaluation_detailsServiceImpl;
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
 * 评价详情表 前端控制器
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
@RestController
@Api(value = "评价详情接口", tags = "评价详情接口")
@RequestMapping("/evaluationDetails")
public class T_evaluation_detailsController {

    @Autowired
    private T_evaluation_detailsServiceImpl evaluationDetailsService;

    @GetMapping("/archiveDetailId/{archiveDetailId}")
    @ApiOperation(value = "查询系统人才的所有档案，这些档案属于不同公司")
    public Result<List<T_evaluation_details>> getArchivesOfTalent(@ApiParam(value = "档案id",required = true)@PathVariable("archiveDetailId") int archiveDetailId){
        return evaluationDetailsService.getEvaluationsByADId(archiveDetailId);
    }


}

