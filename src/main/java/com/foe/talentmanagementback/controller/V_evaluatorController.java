package com.foe.talentmanagementback.controller;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.pojo.V_evaluator;
import com.foe.talentmanagementback.service.impl.V_evaluatorServiceImpl;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/evaluators")
public class V_evaluatorController {

    @Autowired
    private V_evaluatorServiceImpl evaluatorService;

    @GetMapping("/evaluations/{evaluationId}")
    @ApiOperation(value = "通过evaluationId查询评价人，成功返回评价人，失败返回错误信息")
    @ApiImplicitParam(name = "evaluationId", value = "档案id", dataType = "Integer", paramType = "path", required = true)
    @ApiResponses(@ApiResponse(code = 200,message = "成功",response = V_evaluator.class))
    public Result<V_evaluator> getEvaluatorByTalentId(@PathVariable("evaluationId") Integer evaluationId){
        return evaluatorService.getEvaluatorByEvaluationId(evaluationId);
    }
}
