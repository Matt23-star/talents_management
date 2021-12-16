package com.foe.talentmanagementback.service;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.dto.EvaluationSendDTO;
import com.foe.talentmanagementback.entity.dto.EvaluationStatisticDTO;
import com.foe.talentmanagementback.entity.pojo.T_evaluation_details;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface IT_evaluation_detailsService extends IService<T_evaluation_details> {

   Result<List<EvaluationSendDTO>> getEvaluationsByArchiveId(Integer archiveId);

   Result<EvaluationStatisticDTO> getEvaluationStatisticByArchiveId(Integer archiveId);

   Result<EvaluationStatisticDTO> getEvaluationStatisticsByTalentId(Integer talentId);

   Result intsertEvaluation(int talentId,int companyId,int professionalKnowledge, int opinionValue, int ability, int performance,int executiveAbility,String comment,int evaluator);

}
