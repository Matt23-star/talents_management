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
@ApiModel(value = "com.foe.talentmanagementback.entity.T_talent",description = "新增系统人才参数")
public class T_talent implements Serializable {


    /**
     * 员工编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 员工姓名
     */

    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 出生日期
     */
    private String birthday;

    /**
     * 身份证号
     */
    private String idCard;

    private Integer age;

    /**
     * 籍贯
     */
    private String nativePlace;

    /**
     * 最高学历
     */
    private String degree;

    /**
     * 毕业院校
     */
    private String school;

    /**
     * 民族
     */
    private Integer nationId;

    /**
     * 政治面貌
     */
    private Integer politicId;

    /**
     * 电话号码
     */
    private String phoneNum;

    /**
     * 联系地址
     */
    private String address;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 所属专业
     */
    private String major;

    private Integer maritalStatus;

}
