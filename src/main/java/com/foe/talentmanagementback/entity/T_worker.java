package com.foe.talentmanagementback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 工作表
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */

@Data
public class T_worker implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
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

    private String contract_deadline;

    private Integer workingYears;

    private Integer salary;

    private Integer companyId;

    /**
     * 入职时间
     */
    private String entryTime;

    private String jobType;

    /**
     * 部门主管
     */
    private Integer departmentManagerId;
}
