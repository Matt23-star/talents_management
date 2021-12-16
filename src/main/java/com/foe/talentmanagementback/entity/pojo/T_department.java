package com.foe.talentmanagementback.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;


@Data
//@ApiModel(value = "com.foe.talentmanagementback.entity.pojo.T_department",description = "新增部门参数")
public class T_department implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer companyId;

    private Integer departmentManagerId;

    private String departmentName;

    private String departmentFunction;

}
