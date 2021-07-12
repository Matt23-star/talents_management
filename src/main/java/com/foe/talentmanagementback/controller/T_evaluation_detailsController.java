package com.foe.talentmanagementback.controller;


import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.T_evaluation_details;
import com.foe.talentmanagementback.service.impl.T_evaluation_detailsServiceImpl;
import io.swagger.annotations.*;
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
@Api(value = "评价详情接口", tags = "评价详情接口")
@RequestMapping("/evaluation")
public class T_evaluation_detailsController {
    @Autowired
    private T_evaluation_detailsServiceImpl evaluationDetailsService;

    @PostMapping("/ied")
    @ApiOperation(value = "插入评价")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "talentId", value = "档案中系统人才id", dataType = "int", paramType = "query", required = true),
            @ApiImplicitParam(name = "professionalKnowledge", value = "评价：专业知识", dataType = "int", paramType = "query", required = true),
            @ApiImplicitParam(name = "opinionValue", value = "评价：价值观", dataType = "int", paramType = "query", required = true),
            @ApiImplicitParam(name = "ability", value = "评价：能力", dataType = "int", paramType = "query", required = true),
            @ApiImplicitParam(name = "performance", value = "评价：表现", dataType = "int", paramType = "query", required = true),
            @ApiImplicitParam(name = "comment", value = "评价:文字评价", dataType = "String", paramType = "query", required = true),
            @ApiImplicitParam(name = "evaluator", value = "评价人", dataType = "int", paramType = "query", required = true)
    })
    public Result insertEvaluation(@RequestParam("talentId")int talentId,
                                   @RequestParam("professionalKnowledge")int professionalKnowledge,
                                   @RequestParam("opinionValue")int opinionValue,
                                   @RequestParam("ability")int ability,
                                   @RequestParam("performance")int performance,
                                   @RequestParam("comment")String comment,
                                   @RequestParam("evaluator")int evaluator
                                   ){
        return evaluationDetailsService.intsertEvaluation(talentId,
                professionalKnowledge,
                opinionValue,
                ability,
                performance,
                comment,
                evaluator);

    }
}

