package com.foe.talentmanagementback.service.impl;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.pojo.T_location;
import com.foe.talentmanagementback.entity.enums.ResultMsg;
import com.foe.talentmanagementback.entity.pojo.T_talent;
import com.foe.talentmanagementback.service.MapService;
import com.foe.talentmanagementback.service.T_locationService;
import com.foe.talentmanagementback.utils.MapUtils;
import com.foe.talentmanagementback.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Matt
 * @date: 2021/7/19/20:01
 * @description:
 */

@Service
public class MapServiceImpl implements MapService {

    @Autowired
    private T_talentServiceImpl talentService;

    @Autowired
    private T_locationServiceImpl locationService;

    @Override
    public Result<List<T_location>> getTalentsAddress() {
        List<T_talent> talents = talentService.getTalents().getData();
        List<T_location> tlocations = new ArrayList<>();

        MapUtils mapUtils = new MapUtils();
        String location = new String();
        String field = new String();
        Integer talentId;
        if (!talents.isEmpty()) {
            for (T_talent talent :
                    talents) {
                T_location tLocation = new T_location();
                if (talent.getAddress() != null)
                    location = mapUtils.getLonLat(talent.getAddress());
                field = talent.getField();
                talentId = talent.getId();
                if (location != null && field != null && talentId != null) {
                    tLocation.setLocation(location);
                    tLocation.setField(field);
                    tLocation.setTalentId(talentId);
                    System.out.println(tLocation);
                    locationService.addLocation(tLocation);
                    tlocations.add(tLocation);
                }
            }
        }
        return ResultUtils.success(ResultMsg.SUCCESS, tlocations);
    }
}
