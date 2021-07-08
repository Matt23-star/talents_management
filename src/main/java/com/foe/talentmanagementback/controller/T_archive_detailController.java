package com.foe.talentmanagementback.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */

@RestController
@RequestMapping("/archiveDetail")
@Api(value="档案接口",tags={"档案接口"})
public class T_archive_detailController {

    @RequestMapping("/hello")
    public String hello(){

        return "talentName";
    }

    @RequestMapping("/login")
    public String login(String talentName){
        return talentName;
    }
}

