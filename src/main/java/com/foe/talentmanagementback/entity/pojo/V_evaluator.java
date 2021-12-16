package com.foe.talentmanagementback.entity.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class V_evaluator {

    private Integer evaluationId;

    private Integer evaluator;

    private Date date;

    private String evaluatorName;
}
