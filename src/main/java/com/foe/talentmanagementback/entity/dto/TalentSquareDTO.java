package com.foe.talentmanagementback.entity.dto;

import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
public class TalentSquareDTO {

    private Integer id;

    private Integer companyId;

    private String name;

    private Integer age;

    private String sex;

    private String school;

    private String degree;

    private String major;

    private String companyName;

}
