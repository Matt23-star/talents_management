package com.foe.talentmanagementback.entity.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.foe.talentmanagementback.utils.FloatConvert;
import lombok.Data;

/**
 * @author: Matt
 * @date: 2021/7/13/10:21
 * @description:
 */

@Data
public class EvaluationStatisticDTO {

    @JsonSerialize(using = FloatConvert.class)
    private Float professionKAvg;

    @JsonSerialize(using = FloatConvert.class)
    private Float opinionValueAvg;

    @JsonSerialize(using = FloatConvert.class)
    private Float abilityAvg;

    @JsonSerialize(using = FloatConvert.class)
    private Float performanceAvg;

    @JsonSerialize(using = FloatConvert.class)
    private Float executiveAbilityAvg;
}
