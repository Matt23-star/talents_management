package com.foe.talentmanagementback.controller;


import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.dto.WorkExperienceListDTO;
import com.foe.talentmanagementback.service.impl.T_workerServiceImpl;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Matt
 * @Date: 2021/07/09/23:11
 * @Description:
 */
@RestController
@RequestMapping("/api/workers")
@Api(value = "职员接口")
public class T_workerController {

    @Autowired
    private T_workerServiceImpl workerService;

    @GetMapping("/archives/{archiveId}")
    @ApiOperation(value = "通过archiveId查询工作经历，成功返回工作经历链表，失败返回错误信息")
    @ApiImplicitParam(name = "archiveId", value = "档案id", dataType = "Integer", paramType = "path", required = true)
    public Result<WorkExperienceListDTO> getWorkExperienceByArchiveId(@PathVariable("archiveId") Integer archiveId){
        return  workerService.getWorkerByArchiveId(archiveId);
    }

}

