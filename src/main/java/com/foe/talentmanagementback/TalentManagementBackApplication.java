package com.foe.talentmanagementback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.foe.talentmanagementback.mapper")
public class TalentManagementBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(TalentManagementBackApplication.class, args);
    }

}
