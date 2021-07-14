package com.foe.talentmanagementback.entity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/12/9:31
 * @Description:
 */
@Data
@ApiModel(value = "MyOrganizationDTO",description = "包含了我的组织页面的全部信息")
public class MyOrganizationDTO {

    @ApiModelProperty(value = "公司ID")
    private Integer companyId;

    @ApiModelProperty(value = "公司名称")
    private String name;

    @ApiModelProperty(value = "公司简介")
    private String certification;

    @ApiModelProperty(value = "部门ID")
    private Integer departmentLast;

    @ApiModelProperty(value = "部门名称")
    private String departmentName;

    @ApiModelProperty(value = "部门简介")
    private String departmentFunction;
}
