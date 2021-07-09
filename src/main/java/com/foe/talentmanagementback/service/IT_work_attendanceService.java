package com.foe.talentmanagementback.service;

import com.foe.talentmanagementback.entity.T_evaluation_details;
import com.foe.talentmanagementback.entity.T_work_attendance;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 绩效考勤表 服务类
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
public interface IT_work_attendanceService extends IService<T_work_attendance> {

    //通过archiveDetailId获得考勤记录链表
    public List<T_work_attendance> getAttendancesByADId(int archiveDetailId);
}
