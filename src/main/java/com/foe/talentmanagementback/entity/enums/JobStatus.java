package com.foe.talentmanagementback.entity.enums;

/**
 * @author: Matt
 * @date: 2021/7/12/9:03
 * @description:
 */

public enum JobStatus {

    UNEMPLOYED(0,"未就业"),
    EMPLOYED(1,"已就业");

    private Integer code;
    private String jobStatus;

    JobStatus(Integer code,String jobStatus){
        this.code = code;
        this.jobStatus = jobStatus;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    @Override
    public String toString() {
        return "JobStatus{" +
                "code=" + code +
                ", jobStatus='" + jobStatus + '\'' +
                '}';
    }
}
