package com.foe.talentmanagementback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.ResultMessage;
import com.foe.talentmanagementback.entity.dto.EvaluationSendDTO;
import com.foe.talentmanagementback.entity.dto.EvaluationStatisticDTO;
import com.foe.talentmanagementback.entity.enums.ResultMsg;
import com.foe.talentmanagementback.entity.pojo.T_archive_detail;
import com.foe.talentmanagementback.entity.pojo.T_evaluation_details;
import com.foe.talentmanagementback.entity.pojo.V_evaluator;
import com.foe.talentmanagementback.mapper.T_archive_detailMapper;
import com.foe.talentmanagementback.mapper.T_evaluation_detailsMapper;
import com.foe.talentmanagementback.service.IT_evaluation_detailsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.foe.talentmanagementback.utils.ResultUtils;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 评价详情表 服务实现类
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
@Service
public class T_evaluation_detailsServiceImpl extends ServiceImpl<T_evaluation_detailsMapper, T_evaluation_details> implements IT_evaluation_detailsService {

    @Autowired
    private T_evaluation_detailsMapper evaluationDetailsMapper;

    @Autowired
    private T_archive_detailMapper archiveDetailMapper;

    @Autowired
    private V_evaluatorServiceImpl evaluatorService;

    /**
     * @author: Matt
     * @date: 2021-07-13 11:29
     * @description: 获得评价
     * @return
     */
    @Override
    public Result<List<EvaluationSendDTO>> getEvaluationsByArchiveId(Integer archiveId) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("archive_detail_id",archiveId);
        List<T_evaluation_details> evaluationDetails = evaluationDetailsMapper.selectList(queryWrapper);
        if (evaluationDetails.isEmpty()){
            return ResultUtils.error(ResultMsg.EVALUATION_NOT_EXIST);
        }
        ModelMapper modelMapper = new ModelMapper();
        List<EvaluationSendDTO> evaluationSendDTOS = modelMapper
                .map(evaluationDetails, new TypeToken<List<EvaluationSendDTO>>(){}.getType());
        for (EvaluationSendDTO evaluationSendDTO :
                evaluationSendDTOS) {
            V_evaluator evaluator = evaluatorService
                    .getEvaluatorByArchiveId(evaluationSendDTO
                            .getEvaluationId())
                    .getData();
            if (evaluator != null) {
                evaluationSendDTO.setEvaluatorName(evaluator.getEvaluatorName());
            }
        }
        return ResultUtils.success(ResultMsg.SUCCESS,evaluationSendDTOS);
    }

    /**
     * @author: Matt
     * @date: 2021-07-13 14:36
     * @description: 获得评价统计
     */

    public Result<EvaluationStatisticDTO> getEvaluationStatisticByArchiveId(Integer archiveId) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("archive_detail_id", archiveId);
        List<T_evaluation_details> evaluationDetails = this.evaluationDetailsMapper.selectList(queryWrapper);
        if (evaluationDetails.isEmpty()) {
            return ResultUtils.error(ResultMsg.EVALUATION_NOT_EXIST);
        } else {
            EvaluationStatisticDTO evaluationStatisticDTO = new EvaluationStatisticDTO();
            evaluationStatisticDTO.setAbilityAvg((float)evaluationDetails.stream().mapToDouble((evaluationDetail) -> {
                return (double)evaluationDetail.getAbility();
            }).average().getAsDouble());
            evaluationStatisticDTO.setExecutiveAbilityAvg((float)evaluationDetails.stream().mapToDouble((evaluationDetail) -> {
                return (double)evaluationDetail.getExecutiveAbility();
            }).average().getAsDouble());
            evaluationStatisticDTO.setOpinionValueAvg((float)evaluationDetails.stream().mapToDouble((evaluationDetail) -> {
                return (double)evaluationDetail.getOpinionValue();
            }).average().getAsDouble());
            evaluationStatisticDTO.setPerformanceAvg((float)evaluationDetails.stream().mapToDouble((evaluationDetail) -> {
                return (double)evaluationDetail.getPerformance();
            }).average().getAsDouble());
            evaluationStatisticDTO.setProfessionKAvg((float)evaluationDetails.stream().mapToDouble((evaluationDetail) -> {
                return (double)evaluationDetail.getProfessionalKnowledge();
            }).average().getAsDouble());
            return ResultUtils.success(ResultMsg.SUCCESS, evaluationStatisticDTO);
        }
    }
 /**
 * @Description:
 * @Param:
 * @return:
 * @Author: 张越
 * @Date: 2021/7/13
 */
    @Override
    public Result intsertEvaluation(int talentId,int companyId,int professionalKnowledge, int opinionValue, int ability, int performance,int executiveAbility,String comment,int evaluator) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("talent_id",talentId);
        queryWrapper.eq("company_id",companyId);
        T_archive_detail archiveDetail = archiveDetailMapper.selectOne(queryWrapper);
        if(archiveDetail==null){
            return ResultUtils.error(new ResultMessage(500,"未查询到档案信息，评价失败"));
        }else {
            T_evaluation_details evaluationDetails = new T_evaluation_details();
            evaluationDetails.setArchiveDetailId(archiveDetail.getId());
            evaluationDetails.setProfessionalKnowledge(professionalKnowledge);
            evaluationDetails.setOpinionValue(opinionValue);
            evaluationDetails.setAbility(ability);
            evaluationDetails.setPerformance(performance);
            evaluationDetails.setExecutiveAbility(executiveAbility);
            evaluationDetails.setComment(comment);
            evaluationDetails.setEvaluator(evaluator);
            int resultEva = evaluationDetailsMapper.insert(evaluationDetails);
            if(resultEva>0){
                return ResultUtils.success(new ResultMessage(200,"评价成功"));
            }
        }
        return ResultUtils.error(new ResultMessage(500,"评价失败"));
    }
}

