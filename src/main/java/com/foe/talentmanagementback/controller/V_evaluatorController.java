package com.foe.talentmanagementback.controller;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.pojo.V_evaluator;
import com.foe.talentmanagementback.service.impl.V_evaluatorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Matt
 * @date: 2021/7/13/9:24
 * @description:
 */

@RestController
@RequestMapping("/api/evaluators")
public class V_evaluatorController {

    @Autowired
    private V_evaluatorServiceImpl evaluatorService;

    @GetMapping("/archives/{archiveId}")
    public Result<V_evaluator> getEvaluatorByTalentId(@PathVariable("archiveId") Integer archiveId){
        return evaluatorService.getEvaluatorByEvaluationId(archiveId);
    }
}
