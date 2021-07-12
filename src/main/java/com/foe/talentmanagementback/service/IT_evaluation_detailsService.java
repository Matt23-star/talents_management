package com.foe.talentmanagementback.service;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.T_evaluation_details;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <p>
 * 评价详情表 服务类
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
public interface IT_evaluation_detailsService extends IService<T_evaluation_details> {
   Result intsertEvaluation(int talentId,int professionalKnowledge, int opinionValue, int ability, int performance,String comment,int evaluator);
}
