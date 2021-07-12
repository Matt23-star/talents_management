package com.foe.talentmanagementback.controller;


import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.T_archive_detail;
import com.foe.talentmanagementback.entity.dto.WorkExperienceDTO;
import com.foe.talentmanagementback.service.impl.T_archive_detailServiceImpl;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */

@RestController
@RequestMapping("/archiveDetail")
@Api(tags = {"档案接口"})
public class T_archive_detailController {

    @Autowired
    private T_archive_detailServiceImpl archive_detailService;

    @GetMapping("/talentArchives/{talentId}")
    @ApiOperation(value = "通过talentId查询工作经历，成功返回工作经历链表，失败返回错误信息")
    @ApiImplicitParam(name = "talentId", value = "档案中系统人才id", dataType = "int", paramType = "path", required = true)
    public Result<List<WorkExperienceDTO>> getExperiencesOfTalent(@PathVariable("talentId") int talentId) {
        return archive_detailService.getArchivesByTalentId(talentId);
    }

    @GetMapping("/talentInCompany/{talentId}/{companyId}")
    @ApiOperation(value = "通过talentId和companyId查询特定人才特定公司工作经历，成功返回工作经历，失败返回错误信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "talentId", value = "档案中系统人才id", dataType = "int", paramType = "path", required = true),
            @ApiImplicitParam(name = "companyId", value = "档案中公司id", dataType = "int", paramType = "path", required = true)
    })
    public Result<T_archive_detail> getAtchiveOfOneTalentInCo(@PathVariable("talentId") int talentId,
                                                              @PathVariable("companyId") int companyId) {
        return archive_detailService.getArchiveBytIdWcId(talentId, companyId);
    }
}