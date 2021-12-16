package com.foe.talentmanagementback.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class T_evaluation_details implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer archiveDetailId;

    private String workingAttitude;
    /**
     * 评价
     */
    private String comment;

    /**
     * 评价人
     */
    private Integer evaluator;

    private Date date;

    private Integer professionalKnowledge;

    private Integer opinionValue;

    private Integer ability;

    private Integer performance;

    private Integer executiveAbility;
}
