package com.foe.talentmanagementback.entity.dto;

import com.foe.talentmanagementback.entity.enums.UserRight;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/14/13:53
 * @Description:
 */
@Data
public class TalentDTO {
    /**
     * 员工编号
     */
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
    private String nation;

    /**
     * 政治面貌
     */
    private String politic;

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

    private String maritalStatus;

    private String accountNumber;

    private String jobStatusEnum;

    private Integer companyId;

    private String companyName;

    private String departmentName;

    private String position;

    private UserRight userRight;

    private String headPortrait;


}
