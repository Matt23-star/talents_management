package com.foe.talentmanagementback.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;

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
@RequestMapping("/company")
@Api(value = "公司接口",tags = "公司接口")
public class T_companyController {

//    @Autowired
//    private T_archiveServiceImpl t_archiveService;
//
//    @ApiOperation(value = "获取人才档案", notes = "通过系统人才id")
//    @RequestMapping("/getById/{talentId}")
//    @ResponseBody
//    public T_archive getArchiveByTalentId(@ApiParam(value = "系统人才id", required = true) @PathVariable("talentId") Integer talentId) {
//        System.out.println(talentId);
//        return t_archiveService.getArchiveByTalentId(talentId);
//    }

}

