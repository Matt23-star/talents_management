package com.foe.talentmanagementback.entity;

import java.io.Serializable;

/**
 * <p>
 * 绩效考勤表
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
public class T_work_attendance implements Serializable {


    private Integer id;

    private Integer archiveDetailId;

    /**
     * 绩效完成情况
     */
    private String achievements;

    private String attendance;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArchiveDetailId() {
        return archiveDetailId;
    }

    public void setArchiveDetailId(Integer archiveDetailId) {
        this.archiveDetailId = archiveDetailId;
    }

    public String getAchievements() {
        return achievements;
    }

    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "T_work_attendance{" +
        "id=" + id +
        ", archive_detail_id=" + archiveDetailId +
        ", achievements=" + achievements +
        ", attendacne=" + attendance +
        "}";
    }
}
