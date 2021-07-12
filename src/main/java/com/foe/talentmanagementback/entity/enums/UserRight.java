package com.foe.talentmanagementback.entity.enums;

import lombok.Data;

/**
 * @author: Matt
 * @date: 2021/7/10/11:25
 * @description:
 */

public enum UserRight {
    NORMAL_USER(1,"normalUser"),
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
