package com.foe.talentmanagementback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 绩效考勤表
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */

@Data
public class T_work_attendance implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer archiveDetailId;

    /**
     * 绩效完成情况
     */
    private String achievements;

    private String attendance;
}
