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

@ApiModel(value = "档案详情对象")
public class T_archive_detail implements Serializable {


    private Integer id;

    private Integer companyId;

    private String detailRecord;

    private String date;


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

    public String getDetailRecord() {
        return detailRecord;
    }

    public void setDetailRecord(String detailRecord) {
        this.detailRecord = detailRecord;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "T_archive_detail{" +
        "id=" + id +
        ", company_id=" + companyId +
        ", detail_record=" + detailRecord +
        ", date=" + date +
        "}";
    }
}
