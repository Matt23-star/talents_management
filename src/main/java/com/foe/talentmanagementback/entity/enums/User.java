package com.foe.talentmanagementback.entity.enums;

/**
 * @author: Matt
 * @date: 2021/7/10/11:25
 * @description:
 */
public enum User {
    NORMAL_USER(1,"normalUser"),
    MANAGER_USER(2,"deptManager"),
    HR_USER(3,"Hr");

    private Integer idCode;
    private String userIdentity;

    User(Integer idCode, String msg) {
        this.idCode = idCode;
        this.userIdentity = userIdentity;
    }
}
