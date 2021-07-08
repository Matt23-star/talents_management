package com.foe.talentmanagementback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
public class T_department implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer companyId;

    private Integer departmentManagerId;

    private String departmentName;

    private String departmentFunction;


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

    public Integer getDepartmentManagerId() {
        return departmentManagerId;
    }

    public void setDepartmentManagerId(Integer departmentManagerId) {
        this.departmentManagerId = departmentManagerId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentFunction() {
        return departmentFunction;
    }

    public void setDepartmentFunction(String departmentFunction) {
        this.departmentFunction = departmentFunction;
    }

    @Override
    public String toString() {
        return "T_department{" +
        "id=" + id +
        ", company_id=" + companyId +
        ", department_manager_id=" + departmentManagerId +
        ", department_name=" + departmentName +
        ", department_function=" + departmentFunction +
        "}";
    }
}
