package com.foe.talentmanagementback.entity.dto;

import lombok.Data;

/**
 * @author: Matt
 * @date: 2021/7/13/10:16
 * @description:
 */

@Data
public class ArchiveDTO {

    private Integer workingDays;

    private Integer absenceTimes;

    private Integer lateTimes;

    private Integer earlyLeaveTimes;

    private Integer leaveTimes;

    private Integer awardTimes;

    private Integer punishmentTimes;
}
