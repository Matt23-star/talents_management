package com.foe.talentmanagementback.entity.dto;

import com.foe.talentmanagementback.entity.enums.JobStatus;
import com.foe.talentmanagementback.entity.enums.UserRight;
import lombok.Data;

/**
 * @author: Matt
 * @date: 2021/7/11/11:12
 * @description:
 */

@Data
public class UserDTO {

    private JobStatus jobStatus;

    private String companyName;

    private String departmentName;

    private String position;

    private String nation;

    private UserRight userRight;

    private String headPortrait;
}
