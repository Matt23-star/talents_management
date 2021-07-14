package com.foe.talentmanagementback.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.pojo.V_evaluator;

/**
 * @author: Matt
 * @date: 2021/7/13/9:27
 * @description:
 */
public interface IV_evaluatorService extends IService<V_evaluator> {

    public Result<V_evaluator> getEvaluatorByEvaluationId(Integer evaluationId);

}
