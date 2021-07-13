package com.foe.talentmanagementback.controller;


import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.dto.EvaluationReceiveDTO;
import com.foe.talentmanagementback.entity.dto.EvaluationSendDTO;
import com.foe.talentmanagementback.service.impl.T_evaluation_detailsServiceImpl;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @Author: Matt
 * @Date: 2021/07/09
 * @Description:
 */
@RestController
@Api(value = "评价详情接口", tags = "评价详情接口")
@RequestMapping("/api/evaluations")
public class T_evaluation_detailsController {
    @Autowired
    private T_evaluation_detailsServiceImpl evaluationDetailsService;

    /**
     *
     * @author: Matt
     * @date: 2021-07-13 12:40
     * @description: 根据档案id获得评价
     */

    @GetMapping("/archives/{archiveId}")
    @ApiOperation(value = "通过archiveId查询评价，成功返回评价链表，失败返回错误信息")
    @ApiImplicitParam(name = "archiveId", value = "档案id", dataType = "Integer", paramType = "path", required = true)
    public Result<List<EvaluationSendDTO>> getEvaluationByArchiveId(@PathVariable("archiveId") Integer archiveId){
        return evaluationDetailsService.getEvaluationsByArchiveId(archiveId);
    }

    /**
    * @Description:
    * @Param:
    * @return:
    * @Author: 张越
    * @Date: 2021/7/12
    */
    @PostMapping("")
    @ApiOperation(value = "插入评价")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "talentId", value = "档案中系统人才id", dataType = "String", paramType = "query", required = true),
            @ApiImplicitParam(name = "professionalKnowledge", value = "评价：专业知识", dataType = "int", paramType = "query", required = true),
            @ApiImplicitParam(name = "opinionValue", value = "评价：价值观", dataType = "int", paramType = "query", required = true),
            @ApiImplicitParam(name = "ability", value = "评价：能力", dataType = "int", paramType = "query", required = true),
            @ApiImplicitParam(name = "performance", value = "评价：表现", dataType = "int", paramType = "query", required = true),
            @ApiImplicitParam(name = "comment", value = "评价:文字评价", dataType = "String", paramType = "query", required = true),
            @ApiImplicitParam(name = "evaluator", value = "评价人", dataType = "String", paramType = "query", required = true)
    })
    public Result addEvaluation(@RequestBody EvaluationReceiveDTO evaluationReceiveDTO){

        return evaluationDetailsService.intsertEvaluation(Integer.parseInt(evaluationReceiveDTO.getTalentId()),
                evaluationReceiveDTO.getProfessionalKnowledge(),
                evaluationReceiveDTO.getOpinionValue(),
                evaluationReceiveDTO.getAbility(),
                evaluationReceiveDTO.getPerformance(),
                evaluationReceiveDTO.getComment(),
                Integer.parseInt(evaluationReceiveDTO.getEvaluator()));

    }
}

