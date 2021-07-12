package com.foe.talentmanagementback.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
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
@ApiModel(value = "T_talent",description = "新增系统人才参数")
public class T_talent implements Serializable {


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

    @ApiModelProperty(value = "账户")
    private String accountNumber;

    @ApiModelProperty(value = "工作状态")
    private Integer jobStatus;

    @ApiModelProperty(value = "公司Id")
    private Integer companyId;
}
