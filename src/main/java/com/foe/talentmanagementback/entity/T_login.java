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

@ApiModel(value = "系统登录信息对象")
public class T_login implements Serializable {


    private Integer id;

    private String nikname;

    private String briefIntroduction;

    private Integer accountNumber;

    private Integer password;

    private String headPortrait;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNikname() {
        return nikname;
    }

    public void setNikname(String nikname) {
        this.nikname = nikname;
    }

    public String getBriefIntroduction() {
        return briefIntroduction;
    }

    public void setBriefIntroduction(String briefIntroduction) {
        this.briefIntroduction = briefIntroduction;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    @Override
    public String toString() {
        return "T_login{" +
        "id=" + id +
        ", nikname=" + nikname +
        ", brief_introduction=" + briefIntroduction +
        ", account_number=" + accountNumber +
        ", password=" + password +
        ", head_portrait=" + headPortrait +
        "}";
    }
}
