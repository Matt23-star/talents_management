package com.foe.talentmanagementback.entity.dto;

import lombok.Data;
import org.springframework.context.annotation.Bean;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/14/18:43
 * @Description:
 */
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
