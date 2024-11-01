package com.foe.talentmanagementback.utils;

import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/09/23:11
 * @Description:
 */
public class MyBatisPlusUtils {

    public static void Generator() {
        DataSourceConfig dataSourceConfig = new DataSourceConfig.Builder("jdbc:mysql://106.14.145.85:3306/management_system?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=UTF8",
                "root",
                "123123").build();
        GlobalConfig globalConfig = new GlobalConfig.Builder()
                .openDir(false)
                .outputDir(System.getProperty("user.dir")+"/src/main/java")
                .author("Matt")
                .openDir(false)
                .build();

        PackageConfig packageConfig = new PackageConfig.Builder()
                .parent("com.foe.talentmanagementback")
                .entity("entity")
                .controller("controller")
                .mapper("mapper")
                .service("service")
                .build();
        StrategyConfig strategyConfig = new StrategyConfig.Builder()
                .build();

        AutoGenerator autoGenerator =new AutoGenerator(dataSourceConfig)
                .global(globalConfig)
                .packageInfo(packageConfig)
                .strategy(strategyConfig);
        autoGenerator.execute();
    }

}
