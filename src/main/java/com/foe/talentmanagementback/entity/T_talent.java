package com.foe.talentmanagementback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */

@ApiModel(value = "系统人才对象")
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
    private String id_card;

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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Integer getNationId() {
        return nationId;
    }

    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }

    public Integer getPoliticId() {
        return politicId;
    }

    public void setPoliticId(Integer politicId) {
        this.politicId = politicId;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public String toString() {
        return "T_talent{" +
        "id=" + id +
        ", name=" + name +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", id_card=" + id_card +
        ", age=" + age +
        ", native_place=" + nativePlace +
        ", degree=" + degree +
        ", school=" + school +
        ", nation_id=" + nationId +
        ", politic_id=" + politicId +
        ", phone_num=" + phoneNum +
        ", address=" + address +
        ", email=" + email +
        ", major=" + major +
        ", marital_status=" + maritalStatus +
        "}";
    }
}
