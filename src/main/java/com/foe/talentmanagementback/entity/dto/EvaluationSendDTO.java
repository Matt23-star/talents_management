package com.foe.talentmanagementback.entity.dto;

import lombok.Data;

import java.util.Date;



@Data
public class EvaluationSendDTO {

    private Integer id;

    private String comment;

    private Integer evaluator;

    private Date date;

    private String evaluatorName;
}
