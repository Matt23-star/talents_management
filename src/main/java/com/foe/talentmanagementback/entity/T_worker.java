package com.foe.talentmanagementback.entity;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * <p>
 * 工作表
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */

@ApiModel(value = "职员对象")
public class T_worker implements Serializable {


    private Integer id;

    /**
     * 工号
     */
    private Integer jobNumber;

    /**
     * 合同类型
     */
    private String contract;

    private String contractBeginDate;

    private String contractDeadline;

    private Integer workingYears;

    private Integer salary;

    private Integer companyId;

    /**
     * 入职时间
     */
    private String entry_time;

    private String job_type;

    /**
     * 部门主管
     */
    private Integer department_manager_id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(Integer jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getContractBeginDate() {
        return contractBeginDate;
    }

    public void setContractBeginDate(String contractBeginDate) {
        this.contractBeginDate = contractBeginDate;
    }

    public String getContractDeadline() {
        return contractDeadline;
    }

    public void setContractDeadline(String contractDeadline) {
        this.contractDeadline = contractDeadline;
    }

    public Integer getWorkingYears() {
        return workingYears;
    }

    public void setWorkingYears(Integer workingYears) {
        this.workingYears = workingYears;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getEntry_time() {
        return entry_time;
    }

    public void setEntry_time(String entry_time) {
        this.entry_time = entry_time;
    }

    public String getJob_type() {
        return job_type;
    }

    public void setJob_type(String job_type) {
        this.job_type = job_type;
    }

    public Integer getDepartment_manager_id() {
        return department_manager_id;
    }

    public void setDepartment_manager_id(Integer department_manager_id) {
        this.department_manager_id = department_manager_id;
    }

    @Override
    public String toString() {
        return "T_worker{" +
        "id=" + id +
        ", job_number=" + jobNumber +
        ", contract=" + contract +
        ", contract_begin_date=" + contractBeginDate +
        ", contract_deadline=" + contractDeadline +
        ", working_years=" + workingYears +
        ", salary=" + salary +
        ", company_id=" + companyId +
        ", entry_time=" + entry_time +
        ", job_type=" + job_type +
        ", department_manager_id=" + department_manager_id +
        "}";
    }
}
