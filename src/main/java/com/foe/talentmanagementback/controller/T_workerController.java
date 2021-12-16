package com.foe.talentmanagementback.controller;


import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.dto.WorkExperienceListDTO;
import com.foe.talentmanagementback.service.impl.T_workerServiceImpl;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/workers")
@Api(tags = "职员接口")
public class T_workerController {

    @Autowired
    private T_workerServiceImpl workerService;

    @GetMapping("/archives/{archiveId}")
    @ApiOperation(value = "通过archiveId查询工作经历，成功返回工作经历链表，失败返回错误信息")
    @ApiImplicitParam(name = "archiveId", value = "档案id", dataType = "Integer", paramType = "path", required = true)
    @ApiResponses(@ApiResponse(code = 200,message = "成功",response = WorkExperienceListDTO.class))
    public Result<WorkExperienceListDTO> getWorkExperienceByArchiveId(@PathVariable("archiveId") Integer archiveId){
        return  workerService.getWorkerByArchiveId(archiveId);
    }

}

