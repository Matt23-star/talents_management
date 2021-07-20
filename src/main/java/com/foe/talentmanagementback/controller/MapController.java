package com.foe.talentmanagementback.controller;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.pojo.T_location;
import com.foe.talentmanagementback.service.MapService;
import com.foe.talentmanagementback.service.T_locationService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: Matt
 * @date: 2021/7/19/19:59
 * @description:
 */

@RestController
@RequestMapping("/api/maps")
@Api(tags = "地图接口")
public class MapController {

    @Autowired
    private MapService mapService;

    @Autowired
    private T_locationService locationService;

    //根据地址获取经纬度
    @GetMapping("/getLonLat")
    public Result<List<T_location>> getLonLat() {
        return mapService.getTalentsAddress();
    }

    @GetMapping("/locations")
    public Result<List<T_location>> getLocations() {
        return locationService.getLocatons();
    }

}
