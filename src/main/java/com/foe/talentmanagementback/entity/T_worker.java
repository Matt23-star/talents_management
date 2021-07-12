package com.foe.talentmanagementback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/09/23:11
 * @Description:
 */

@Data
//@ApiModel(value = "com.foe.talentmanagementback.entity.T_worker",description = "新增职员参数")
public class T_worker implements Serializable {

    private Integer id;

    private Integer workingYears;

    private Integer salary;

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
