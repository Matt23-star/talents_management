package com.foe.talentmanagementback.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;



@Data
public class T_hr implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 公司id
     */
    private Integer companyId;

    private Integer hrTalentId;

}
