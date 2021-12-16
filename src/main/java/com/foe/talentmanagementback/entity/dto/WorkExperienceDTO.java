package com.foe.talentmanagementback.entity.dto;

import lombok.Data;

import java.util.Date;

@Data
public class WorkExperienceDTO {

    private Integer companyId;

    private String companyName;

    private String departmentNameLast;

    private String positionLast;

    private Date entryTime;

    private Date quitTime;

    private Integer jobNumber;
}
