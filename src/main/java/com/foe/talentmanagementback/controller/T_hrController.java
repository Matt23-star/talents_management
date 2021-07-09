package com.foe.talentmanagementback.controller;


import com.foe.talentmanagementback.entity.Archive;
import com.foe.talentmanagementback.entity.T_archive_detail;
import com.foe.talentmanagementback.service.impl.T_archive_detailServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
@RestController
@Api(value = "HR接口")
@RequestMapping("/hr")
public class T_hrController {

    @Autowired
    private T_archive_detailServiceImpl archive_detailService;

    @GetMapping("/talentArchive/{talentId}/{companyId}")
    @ApiOperation(value = "查询特定公司特定员工档案")
    public Archive getAtchiveOfOneTalentInCo(@ApiParam(value = "系统人才id，公司id", required = true) @PathVariable("talentId") int talentId,
                                             @PathVariable("companyId") int companyId) {
        Archive archive = new Archive();
        archive.setArchiveDetail(archive_detailService.getArchiveBytIdWcId(talentId, companyId));
        return null;
    }

}

