package com.foe.talentmanagementback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */

@Data
public class T_job_seeker implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String company1_id;

    private String company2_id;

    private String company3_id;

    private String interview_time;

}
