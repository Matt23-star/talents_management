package com.foe.talentmanagementback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.pojo.V_evaluator;
import com.foe.talentmanagementback.entity.enums.ResultMsg;
import com.foe.talentmanagementback.mapper.V_evaluatorMapper;
import com.foe.talentmanagementback.service.IV_evaluatorService;
import com.foe.talentmanagementback.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class V_evaluatorServiceImpl extends ServiceImpl<V_evaluatorMapper, V_evaluator> implements IV_evaluatorService {

    @Autowired
    private V_evaluatorMapper evaluatorMapper;

    @Override
    public Result<V_evaluator> getEvaluatorByEvaluationId(Integer evaluationId) {
        QueryWrapper<V_evaluator> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("evaluation_id",evaluationId);
        V_evaluator evaluator = evaluatorMapper.selectOne(queryWrapper);
        if(evaluator == null)
            return ResultUtils.error(ResultMsg.EVALUATOR_NOT_EXIST);
        return ResultUtils.success(ResultMsg.SUCCESS,evaluator);
    }
}
