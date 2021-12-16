package com.foe.talentmanagementback.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.pojo.V_evaluator;

public interface IV_evaluatorService extends IService<V_evaluator> {

    Result<V_evaluator> getEvaluatorByEvaluationId(Integer evaluationId);

}
