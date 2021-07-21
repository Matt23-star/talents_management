package com.foe.talentmanagementback.controller;


import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.dto.TalentSquareDTO;
import com.foe.talentmanagementback.entity.pojo.R_ConditionReceiver;
import com.foe.talentmanagementback.entity.pojo.T_talent;
import com.foe.talentmanagementback.service.impl.T_talentServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/09/23:11
 * @Description:
 */
@RestController
@Api(tags = "系统人才接口")
@RequestMapping("/api/talents")
public class T_talentController {

    @Autowired
    private T_talentServiceImpl talentService;

    /**
     * @Description: 高级搜索功能，通过各类条件组合查询
     * @Param:
     * @return:
     * @Author: 张越
     * @Date: 2021/7/14
     */
    @PostMapping("/square")
    @ApiOperation(value = "搜索条件，返回T_talent数据")
    public Result<List<TalentSquareDTO>> getTalentInSquare(@RequestBody R_ConditionReceiver receiver){

        return  talentService.getTalentInSquare(receiver);
    }


    @GetMapping("")
    @ApiOperation(value = "无需参数，返回所有T_tanlent数据")
    public Result<List<T_talent>> getTalents(){
        return talentService.getTalents();
    }
    /**
     * @Description:
     * @Param:
     * @return:
     * @Author: 张越
     * @Date: 2021/7/12
     */
    @GetMapping("/{name}")
    @ApiOperation(value = "输入人才姓名，返回所有同名的T_tanlent数据")
    public Result<List<T_talent>> getTalentByName(@PathVariable("name") String name){
        return talentService.getTalentByName(name);
    }
    /**
     * @Description:
     * @Param:
     * @return:
     * @Author: 张越
     * @Date: 2021/7/12
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "输入人才id，返回该id对应的T_tanlent数据")
    public Result<T_talent> getTalentById(@PathVariable("id")int  id){
        return talentService.getTalentById(id);
    }
    /**
     * @Description:
     * @Param:
     * @return:
     * @Author: 张越
     * @Date: 2021/7/12
     */
    @PostMapping("")
    @ApiOperation(value = "接受post请求")
    public Result addTalent(@RequestBody T_talent talent){
        T_talent newTalent =talent;
        return talentService.addTalent(newTalent);
    } /**
     * @Description:
     * @Param:
     * @return:
     * @Author: 张越
     * @Date: 2021/7/12
     */
    @PutMapping("")
    @ApiOperation(value = "接受put请求，T_tanlent中id为必填字段")
    public Result<T_talent> updateTalent(@RequestBody T_talent talent){
        T_talent updateTalent =talent;
        return talentService.updateTalent(updateTalent);
    }
}

