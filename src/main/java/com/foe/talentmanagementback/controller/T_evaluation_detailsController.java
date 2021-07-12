package com.foe.talentmanagementback.controller;


import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.T_evaluation_details;
import com.foe.talentmanagementback.service.impl.T_evaluation_detailsServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
@RequestMapping("/ed")
public class T_evaluation_detailsController {
    @Autowired
    private T_evaluation_detailsServiceImpl evaluationDetailsService;
    @PostMapping("/ied")
    public Result insertEvaluation(@RequestParam("talentId")int talentId,
                                   @RequestParam("professionalKnowledge")int professionalKnowledge,
                                   @RequestParam("opinionValue")int opinionValue,
                                   @RequestParam("ability")int ability,
                                   @RequestParam("performance")int performance,
                                   @RequestParam(value = "comment")String comment,
                                   @RequestParam(value = "evaluator")int evaluator
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

