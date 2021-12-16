package com.foe.talentmanagementback.controller;


import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.bo.ExperienceDetailBO;
import com.foe.talentmanagementback.entity.dto.WorkExperienceDTO;
import com.foe.talentmanagementback.service.impl.T_archive_detailServiceImpl;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/archive-details")
@Api(tags = {"档案接口"})
public class T_archive_detailController {

    @Autowired
    private T_archive_detailServiceImpl archive_detailService;

    @GetMapping("/talents/{talentId}")
    @ApiOperation(value = "通过talentId查询工作经历，成功返回工作经历链表，失败返回错误信息")
    @ApiImplicitParam(name = "talentId", value = "档案中系统人才id", dataType = "Integer", paramType = "path", required = true)
    @ApiResponses(@ApiResponse(code = 200,message = "成功",response = WorkExperienceDTO.class))
    public Result<List<WorkExperienceDTO>> getExperiencesOfTalent(@PathVariable("talentId") Integer talentId) {
        return archive_detailService.getArchivesByTalentId(talentId);
    }

    @GetMapping("/talents/{talentId}/companies/{companyId}")
    @ApiOperation(value = "通过talentId和companyId查询特定人才特定公司工作经历，成功返回工作经历，失败返回错误信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "talentId", value = "档案中系统人才id", dataType = "Integer", paramType = "path", required = true),
            @ApiImplicitParam(name = "companyId", value = "档案中公司id", dataType = "Integer", paramType = "path", required = true)
    })
    @ApiResponses(@ApiResponse(code = 200,message = "成功",response = ExperienceDetailBO.class))
    public Result<ExperienceDetailBO> getAtchiveOfOneTalentInCo(@PathVariable("talentId") Integer talentId,
                                                                @PathVariable("companyId") Integer companyId) {
        return archive_detailService.getArchiveBytIdWcId(talentId, companyId);
    }
}