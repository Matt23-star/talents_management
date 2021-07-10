package com.foe.talentmanagementback.controller;


import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.T_archive_detail;
import com.foe.talentmanagementback.entity.dto.ArchiveDetailDTO;
import com.foe.talentmanagementback.service.impl.T_archive_detailServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @Autowired
    private T_archive_detailServiceImpl archive_detailService;

    @GetMapping("/talentArchives/{talentId}")
    @ApiOperation(value = "查询系统人才的所有档案，这些档案属于不同公司")
    public Result<List<ArchiveDetailDTO>> getArchivesOfTalent(@ApiParam(value = "系统人才id",required = true)@PathVariable("talentId") int talentId){
        return archive_detailService.getArchivesByTalentId(talentId);
    }

    @GetMapping("/talentInCompany/{talentId}/{companyId}")
    @ApiOperation(value = "查询特定公司特定员工档案")
    public Result<T_archive_detail> getAtchiveOfOneTalentInCo(@ApiParam(value = "系统人才id，公司id",required = true)@PathVariable("talentId") int talentId,
                                                              @PathVariable("companyId") int companyId){
        return archive_detailService.getArchiveBytIdWcId(talentId,companyId);
    }
}

