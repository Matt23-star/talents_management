package com.foe.talentmanagementback.entity;

import lombok.Data;

import java.util.List;

/**
 * @author: Matt
 * @date: 2021/7/9/10:53
 * @description:
 */

@Data
public class Archive {
    private T_archive_detail archiveDetail;

    private List<T_evaluation_details> evaluationDetails;

   // private List<T_work_attendance> workAttendances;
}
