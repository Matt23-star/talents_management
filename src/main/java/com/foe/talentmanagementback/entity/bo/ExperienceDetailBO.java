package com.foe.talentmanagementback.entity.bo;

import com.foe.talentmanagementback.entity.dto.ArchiveDTO;
import com.foe.talentmanagementback.entity.dto.EvaluationSendDTO;
import com.foe.talentmanagementback.entity.dto.EvaluationStatisticDTO;
import com.foe.talentmanagementback.entity.dto.WorkExperienceListDTO;
import lombok.Data;

import java.util.List;

/**
 * @author: Matt
 * @date: 2021/7/13/10:10
 * @description:
 */

@Data
public class ExperienceDetailBO {

    private ArchiveDTO archive;

    private WorkExperienceListDTO workExperienceList;

    private List<EvaluationSendDTO> evaluationSends;

    private EvaluationStatisticDTO evaluationStatistic;
}
