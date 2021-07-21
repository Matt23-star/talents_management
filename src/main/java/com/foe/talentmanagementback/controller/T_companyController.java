package com.foe.talentmanagementback.controller;


import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.dto.CompanyDTO;
import com.foe.talentmanagementback.entity.pojo.T_talent;
import com.foe.talentmanagementback.service.impl.T_companyServiceImpl;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
@RestController
@RequestMapping("/api/companies")
@Api(tags = "公司接口")
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
    @Autowired
    private T_companyServiceImpl companyService;
    /**
     * @Description:
     * @Param:
     * @return:
     * @Author: 张越
     * @Date: 2021/7/12
     */
    @PostMapping("/talents")
    @ApiOperation(value = "输入company的id，返回该hr公司下的所有T_tanlent数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "当前页数", dataType = "int", paramType = "query", required = true),
            @ApiImplicitParam(name = "companyId", value = "公司id", dataType = "int", paramType = "query", required = true)
    })
    public Result<List<T_talent>> getWorkersByHrId(@RequestBody Map receiver){
        return companyService.getTalentByCompanyId(receiver);
    }

    @GetMapping("")
    @ApiOperation(value = "获取所有公司名称和id")
    public  Result<List<CompanyDTO>> getCompanies(){
        return companyService.getCompanies();
    }
}

