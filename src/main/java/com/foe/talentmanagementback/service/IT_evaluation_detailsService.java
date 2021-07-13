package com.foe.talentmanagementback.service;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.dto.EvaluationSendDTO;
import com.foe.talentmanagementback.entity.dto.EvaluationStatisticDTO;
import com.foe.talentmanagementback.entity.pojo.T_evaluation_details;
import com.baomidou.mybatisplus.extension.service.IService;

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

   Result<List<EvaluationSendDTO>> getEvaluationsByArchiveId(Integer archiveId);

   Result<EvaluationStatisticDTO> getEvaluationStatisticByArchiveId(Integer archiveId);

   Result<List<EvaluationStatisticDTO>> getEvaluationStatisticsByTalentId(Integer talentId);

   Result intsertEvaluation(int talentId,int companyId,int professionalKnowledge, int opinionValue, int ability, int performance,int executiveAbility,String comment,int evaluator);

}
