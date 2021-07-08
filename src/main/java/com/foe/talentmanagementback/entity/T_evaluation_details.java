package com.foe.talentmanagementback.entity;

import java.io.Serializable;

/**
 * <p>
 * 评价详情表
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
public class T_evaluation_details implements Serializable {


    private Integer id;

    private Integer archiveDetailId;

    private String workingAttitude;

    /**
     * 评价
     */
    private String comment;

    /**
     * 评价人
     */
    private Integer evaluator;


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

    public String getWorkingAttitude() {
        return workingAttitude;
    }

    public void setWorkingAttitude(String workingAttitude) {
        this.workingAttitude = workingAttitude;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getEvaluator() {
        return evaluator;
    }

    public void setEvaluator(Integer evaluator) {
        this.evaluator = evaluator;
    }

    @Override
    public String toString() {
        return "T_evaluation_details{" +
        "id=" + id +
        ", archive_detail_id=" + archiveDetailId +
        ", working_attitude=" + workingAttitude +
        ", comment=" + comment +
        ", evaluator=" + evaluator +
        "}";
    }
}
