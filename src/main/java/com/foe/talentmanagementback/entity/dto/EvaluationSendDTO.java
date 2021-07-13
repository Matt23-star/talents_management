package com.foe.talentmanagementback.entity.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author: Matt
 * @date: 2021/7/13/9:08
 * @description:
 */

@Data
public class EvaluationSendDTO {

    private Integer id;

    private String comment;

    private Integer evaluator;

    private Date date;

    private String evaluatorName;
}
