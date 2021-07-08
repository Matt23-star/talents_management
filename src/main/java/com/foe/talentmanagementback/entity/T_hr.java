package com.foe.talentmanagementback.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
public class T_hr implements Serializable {


    private Integer id;

    /**
     * 公司id
     */
    private Integer companyId;

    private Integer hrTalentId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getHrTalentId() {
        return hrTalentId;
    }

    public void setHrTalentId(Integer hrTalentId) {
        this.hrTalentId = hrTalentId;
    }

    @Override
    public String toString() {
        return "T_hr{" +
        "id=" + id +
        ", company_id=" + companyId +
        ", hr_talent_id=" + hrTalentId +
        "}";
    }
}
