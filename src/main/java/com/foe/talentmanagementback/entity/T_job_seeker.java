package com.foe.talentmanagementback.entity;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */

@ApiModel(value = "求职者对象")
public class T_job_seeker implements Serializable {


    private Integer id;

    private String company1Id;

    private String company2Id;

    private String company3Id;

    private String interviewTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompany1Id() {
        return company1Id;
    }

    public void setCompany1Id(String company1Id) {
        this.company1Id = company1Id;
    }

    public String getCompany2Id() {
        return company2Id;
    }

    public void setCompany2Id(String company2Id) {
        this.company2Id = company2Id;
    }

    public String getCompany3Id() {
        return company3Id;
    }

    public void setCompany3Id(String company3Id) {
        this.company3Id = company3Id;
    }

    public String getInterviewTime() {
        return interviewTime;
    }

    public void setInterviewTime(String interviewTime) {
        this.interviewTime = interviewTime;
    }

    @Override
    public String toString() {
        return "T_job_seeker{" +
        "id=" + id +
        ", company1_id=" + company1Id +
        ", company2_id=" + company2Id +
        ", company3_id=" + company3Id +
        ", interview_time=" + interviewTime +
        "}";
    }
}
