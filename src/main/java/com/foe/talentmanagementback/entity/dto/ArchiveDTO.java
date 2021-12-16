package com.foe.talentmanagementback.entity.dto;

import lombok.Data;

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
