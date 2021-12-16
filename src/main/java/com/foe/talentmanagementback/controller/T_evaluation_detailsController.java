package com.foe.talentmanagementback.controller;


import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.dto.EvaluationReceiveDTO;
import com.foe.talentmanagementback.entity.dto.EvaluationSendDTO;
import com.foe.talentmanagementback.entity.dto.EvaluationStatisticDTO;
import com.foe.talentmanagementback.service.impl.T_evaluation_detailsServiceImpl;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
    @ApiResponses(@ApiResponse(code = 200,message = "成功",response = EvaluationSendDTO.class))
    public Result<List<EvaluationSendDTO>> getEvaluationByArchiveId(@PathVariable("archiveId") Integer archiveId){
        return evaluationDetailsService.getEvaluationsByArchiveId(archiveId);
    }

    /**
     * @author: Matt
     * @date: 2021-07-13 17:03
     * @description:
     */
    @GetMapping("/archives/{archiveId}/evaluation-statistics")
    @ApiOperation(value = "通过archiveId查询评价统计，成功返回评价统计，失败返回错误信息")
    @ApiImplicitParam(name = "archiveId", value = "档案id", dataType = "Integer", paramType = "path", required = true)
    @ApiResponses(@ApiResponse(code = 200,message = "成功",response = EvaluationStatisticDTO.class))
    public Result<EvaluationStatisticDTO> getEvaluationStatisticByArchiveId(@PathVariable("archiveId") Integer archiveId){
        return evaluationDetailsService.getEvaluationStatisticByArchiveId(archiveId);
    }

    /**
     *
     * @author: Matt
     * @date: 2021-07-13 17:03
     * @description:
     */
    @GetMapping("/talents/{talentId}/evaluation-statistics")
    @ApiOperation(value = "通过talentId查询评价统计，成功返回所有公司的评价统计，失败返回错误信息")
    @ApiImplicitParam(name = "talentId", value = "档案id", dataType = "Integer", paramType = "path", required = true)
    @ApiResponses(@ApiResponse(code = 200,message = "成功",response = EvaluationStatisticDTO.class))
    public Result<EvaluationStatisticDTO> getEvaluationStatisticByTalentId(@PathVariable("talentId") Integer talentId){
        return evaluationDetailsService.getEvaluationStatisticsByTalentId(talentId);
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
            @ApiImplicitParam(name = "companyId", value = "档案中系统人才当前就职的公司id", dataType = "String", paramType = "query", required = true),
            @ApiImplicitParam(name = "professionalKnowledge", value = "评价：专业知识", dataType = "int", paramType = "query", required = true),
            @ApiImplicitParam(name = "opinionValue", value = "评价：价值观", dataType = "int", paramType = "query", required = true),
            @ApiImplicitParam(name = "ability", value = "评价：能力", dataType = "int", paramType = "query", required = true),
            @ApiImplicitParam(name = "performance", value = "评价：表现", dataType = "int", paramType = "query", required = true),
            @ApiImplicitParam(name = "executiveAbility", value = "评价：执行力", dataType = "int", paramType = "query", required = true),
            @ApiImplicitParam(name = "comment", value = "评价:文字评价", dataType = "String", paramType = "query", required = true),
            @ApiImplicitParam(name = "evaluator", value = "评价人", dataType = "String", paramType = "query", required = true)
    })
    public Result addEvaluation(@RequestBody EvaluationReceiveDTO evaluationReceiveDTO){

        return evaluationDetailsService.intsertEvaluation(
                Integer.parseInt(evaluationReceiveDTO.getTalentId()),
                Integer.parseInt(evaluationReceiveDTO.getCompanyId()),
                evaluationReceiveDTO.getProfessionalKnowledge(),
                evaluationReceiveDTO.getOpinionValue(),
                evaluationReceiveDTO.getAbility(),
                evaluationReceiveDTO.getPerformance(),
                evaluationReceiveDTO.getExecutiveAbility(),
                evaluationReceiveDTO.getComment(),
                Integer.parseInt(evaluationReceiveDTO.getEvaluator()));
    }
}

