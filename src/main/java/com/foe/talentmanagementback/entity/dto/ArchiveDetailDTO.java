package com.foe.talentmanagementback.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author: Matt
 * @date: 2021/7/10/9:01
 * @description:
 */

@Data
@ApiModel(value = "ArchiveDetailDTO",description = "获取档案记录参数")
public class ArchiveDetailDTO {

    @ApiModelProperty(value = "公司ID")
    private Integer companyId;

    @ApiModelProperty(value = "重大事件记录")
    private String detailRecord;

    @ApiModelProperty(value = "记录时间")
    private String date;
}
