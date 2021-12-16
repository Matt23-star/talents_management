package com.foe.talentmanagementback.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;



@Data
public class T_job_seeker implements Serializable {

    private Integer id;

    private String company1_id;

    private String company2_id;

    private String company3_id;

    private String interview_time;

}
