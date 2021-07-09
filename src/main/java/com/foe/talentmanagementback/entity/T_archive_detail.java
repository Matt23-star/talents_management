package com.foe.talentmanagementback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */

@Data
@ApiModel(value = "com.foe.talentmanagementback.entity.T_archive_detail",description = "新增档案记录参数")
public class T_archive_detail implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "档案ID")
    private Integer id;

    @ApiModelProperty(value = "公司ID")
    private Integer companyId;

    @ApiModelProperty(value = "重大事件记录")
    private String detailRecord;

    @ApiModelProperty(value = "记录时间")
    private String date;

}
