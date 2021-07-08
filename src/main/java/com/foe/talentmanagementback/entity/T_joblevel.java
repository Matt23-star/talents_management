package com.foe.talentmanagementback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
public class T_joblevel implements Serializable {


    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 职称名称
     */
    private String name;

    /**
     * 职称等级
     */
    private String titleLevel;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 是否启用
     */
    private Boolean enabled;


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

    public String getTitleLevel() {
        return titleLevel;
    }

    public void setTitleLevel(String titleLevel) {
        this.titleLevel = titleLevel;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "T_joblevel{" +
        "id=" + id +
        ", name=" + name +
        ", titleLevel=" + titleLevel +
        ", createDate=" + createDate +
        ", enabled=" + enabled +
        "}";
    }
}
