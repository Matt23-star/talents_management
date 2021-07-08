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
public class T_login implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String nikname;

    private String briefIntroduction;

    private Integer accountNumber;

    private Integer password;

    private String headPortrait;
}
