package com.foe.talentmanagementback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/09/23:11
 * @Description:
 */

@Data
@ApiModel(value = "com.foe.talentmanagementback.entity.T_worker",description = "新增职员参数")
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
