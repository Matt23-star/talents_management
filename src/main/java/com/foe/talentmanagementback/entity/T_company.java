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

@ApiModel(value = "公司对象")
public class T_company implements Serializable {


    private Integer id;

    private String name;

    private String type;

    private String certification;

    private String foundingTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getFoundingTime() {
        return foundingTime;
    }

    public void setFoundingTime(String foundingTime) {
        this.foundingTime = foundingTime;
    }

    @Override
    public String toString() {
        return "T_company{" +
        "id=" + id +
        ", name=" + name +
        ", type=" + type +
        ", certification=" + certification +
        ", founding_time=" + foundingTime +
        "}";
    }
}
