package com.foe.talentmanagementback.entity.dto;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;
@Data
public class EvaluationReceiveDTO {

    private  String talentId;

    private String companyId;

    private int professionalKnowledge;

    private int opinionValue;

    private int ability;

    private int performance;

    private int executiveAbility;

    private String comment;

    private String evaluator;

}
