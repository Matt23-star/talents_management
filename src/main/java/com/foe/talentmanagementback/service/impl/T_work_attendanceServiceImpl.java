package com.foe.talentmanagementback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.foe.talentmanagementback.entity.T_evaluation_details;
import com.foe.talentmanagementback.entity.T_work_attendance;
import com.foe.talentmanagementback.mapper.T_work_attendanceMapper;
import com.foe.talentmanagementback.service.IT_work_attendanceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 绩效考勤表 服务实现类
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
@Service
public class T_work_attendanceServiceImpl extends ServiceImpl<T_work_attendanceMapper, T_work_attendance> implements IT_work_attendanceService {

    @Autowired
    private T_work_attendanceMapper workAttendanceMapper;

    @Override
    public List<T_work_attendance> getAttendancesByADId(int archiveDetailId) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("archive_detail_id",archiveDetailId);
        return workAttendanceMapper.selectList(queryWrapper);
    }
}
