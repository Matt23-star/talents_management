package com.foe.talentmanagementback.entity.dto;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.foe.talentmanagementback.entity.T_talent;
import com.foe.talentmanagementback.entity.enums.JobStatus;
import com.foe.talentmanagementback.entity.enums.UserRight;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author: Matt
 * @date: 2021/7/11/11:12
 * @description:
 */

@Data
public class UserDTO {

    /**
     * 员工编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 员工姓名
     */
    @ApiModelProperty(value = "姓名")
    private String name;

    /**
     * 性别
     */
    @ApiModelProperty(value = "性别")
    private String sex;

    /**
     * 出生日期
     */
    @ApiModelProperty(value = "生日")
    private String birthday;

    /**
     * 身份证号
     */
    @ApiModelProperty(value = "身份证号")
    private String idCard;
    /**
     * 年龄
     */
    @ApiModelProperty(value = "年龄")
    private Integer age;

    /**
     * 籍贯
     */
    @ApiModelProperty(value = "籍贯")
    private String nativePlace;

    /**
     * 最高学历
     */
    @ApiModelProperty(value = "最高学历")
    private String degree;

    /**
     * 毕业院校
     */
    @ApiModelProperty(value = "毕业院校")
    private String school;

    /**
     * 民族
     */
    @ApiModelProperty(value = "民族")
    private Integer nationId;

    /**
     * 政治面貌
     */
    @ApiModelProperty(value = "政治面貌")
    private Integer politicId;

    /**
     * 电话号码
     */
    @ApiModelProperty(value = "电话号码")
    private String phoneNum;

    /**
     * 联系地址
     */
    @ApiModelProperty(value = "联系地址")
    private String address;

    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    private String email;

    /**
     * 所属专业
     */
    @ApiModelProperty(value = "所属专业")
    private String major;

    /**
     * 婚姻状况
     */
    @ApiModelProperty(value = "婚姻状况")
    private String maritalStatus;

    @TableField(fill = FieldFill.INSERT)     // 时间特有的注解
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    private T_talent talent;

    private String jobStatusEnum;

    private String companyName;

    private String departmentName;

    private String position;

    private String nation;

    private UserRight userRight;

    private String headPortrait;
}
