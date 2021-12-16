package com.foe.talentmanagementback.entity.enums;

import lombok.Data;
public enum UserRight {
    NORMAL_USER(0,"normalUser"),
    WORKER_USER(1,"worker"),
    MANAGER_USER(2,"deptManager"),
    HR_USER(3,"hr");

    private Integer idCode;
    private String userRight;

    UserRight(Integer idCode, String userRight) {
        this.idCode = idCode;
        this.userRight = userRight;
    }


    public Integer getIdCode() {
        return idCode;
    }

    public void setIdCode(Integer idCode) {
        this.idCode = idCode;
    }

    public String getUserRight() {
        return userRight;
    }

    public void setUserRight(String userRight) {
        this.userRight = userRight;
    }

    @Override
    public String toString() {
        return "UserRight{" +
                "idCode=" + idCode +
                ", userRight='" + userRight + '\'' +
                '}';
    }
}
