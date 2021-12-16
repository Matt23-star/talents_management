package com.foe.talentmanagementback.entity.pojo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.foe.talentmanagementback.utils.FloatConvert;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
//@ApiModel(value = "com.foe.talentmanagementback.entity.pojo.T_worker",description = "新增职员参数")
public class T_worker implements Serializable {

    private Integer id;

    private Integer workingYears;

    @JsonSerialize(using = FloatConvert.class)
    private Float salary;

    private String jobType;
    /**
     * 部门主管
     */
    private Integer departmentManagerId;

    private Integer archiveDetailId;

    @ApiModelProperty(value = "重大事件记录")
    private String detailRecord;

    @ApiModelProperty(value = "记录时间")
    private Date date;
    /**
     * 职位
     */
    private String position;
}
