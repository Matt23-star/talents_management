package com.foe.talentmanagementback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
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
@ApiModel(value = "com.foe.talentmanagementback.entity.T_company",description = "新增公司参数")
public class T_company implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private String type;

    private String certification;

    private String foundingTime;

    private String address;

    private String legalRepresentative;

    private Integer legalRepresentativeCertificate;

}
