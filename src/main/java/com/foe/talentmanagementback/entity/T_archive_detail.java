package com.foe.talentmanagementback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */

@Data
//@ApiModel(value = "com.foe.talentmanagementback.entity.T_archive_detail",description = "新增档案记录参数")
public class T_archive_detail implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "档案ID")
    private Integer id;

    @ApiModelProperty(value = "公司ID")
    private Integer companyId;

    private Integer talentId;
    /**
     * 工号
     */
    private Integer jobNumber;
    /**
     * 入职时间
     */
    private Date entryTime;
    /**
     * 离职时间
     */
    private Date quitTime;

    /**
     * 合同类型
     */
    private String contract;

    private Date contractBeginDate;

    private Date contractDeadline;

    private Integer absenceTimes;

    private Integer lateTimes;

    private Integer earlyLeaveTimes;

    private Integer leaveTimes;

    private Integer awardTimes;

    private Integer punishmentTimes;

    private Integer departmentLast;

    private String positionLast;
}
