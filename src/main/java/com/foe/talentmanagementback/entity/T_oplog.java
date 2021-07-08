package com.foe.talentmanagementback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
public class T_oplog implements Serializable {


    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 添加日期
     */
    private LocalDate addDate;

    /**
     * 操作内容
     */
    private String operate;

    /**
     * 操作员ID
     */
    private Integer adminid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getAddDate() {
        return addDate;
    }

    public void setAddDate(LocalDate addDate) {
        this.addDate = addDate;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    @Override
    public String toString() {
        return "T_oplog{" +
        "id=" + id +
        ", addDate=" + addDate +
        ", operate=" + operate +
        ", adminid=" + adminid +
        "}";
    }
}
