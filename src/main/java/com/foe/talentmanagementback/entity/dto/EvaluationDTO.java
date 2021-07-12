package com.foe.talentmanagementback.entity.dto;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/12/17:23
 * @Description:
 */
@Data
public class EvaluationDTO {
    private  String talentId;
    private int professionalKnowledge;
    private int opinionValue;
    private int ability;
    private int performance;
    private String comment;
    private String evaluator;
}
