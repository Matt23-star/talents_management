package com.foe.talentmanagementback.controller;

import com.foe.talentmanagementback.entity.pojo.T_hr;
import com.foe.talentmanagementback.service.impl.T_archive_detailServiceImpl;
import com.foe.talentmanagementback.service.impl.T_evaluation_detailsServiceImpl;
import com.foe.talentmanagementback.service.impl.T_hrServiceImpl;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
@Api(tags = "HR接口")
@RequestMapping("/api/hr")
public class T_hrController {

    @Autowired
    private T_hrServiceImpl hrService;
    @Autowired
    private T_archive_detailServiceImpl archiveDetailService;
    @Autowired
    private T_evaluation_detailsServiceImpl evaluationDetailsService;

    @GetMapping("/hrImf/{hrId}")
    @ApiOperation(value = "查询hr信息")
    @ApiImplicitParam(name = "hrId", value = "")
    @ApiResponses(@ApiResponse(code = 200,message = "成功",response = T_hr.class))
    public T_hr getHrByHrId(@PathVariable("hrId") int hrId){
        return hrService.getHrByTalentId(hrId);
    }
}

