package com.foe.talentmanagementback.entity.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author: Matt
 * @date: 2021/7/12/9:29
 * @description:
 */

@Data
public class WorkExperienceDTO {

    private String companyName;

    private String departmentNameLast;

    private String positionLast;

    private Date entryTime;

    private Date quitTime;

    private Integer jobNumber;
}
