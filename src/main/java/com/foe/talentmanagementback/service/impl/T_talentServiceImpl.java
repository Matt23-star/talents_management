package com.foe.talentmanagementback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.foe.talentmanagementback.entity.*;
import com.foe.talentmanagementback.mapper.*;
import com.foe.talentmanagementback.service.IT_talentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.foe.talentmanagementback.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/09/23:11
 * @Description:
 */
@Service
public class T_talentServiceImpl extends ServiceImpl<T_talentMapper, T_talent> implements IT_talentService {
    @Autowired
    private T_talentMapper talentMapper;
    @Autowired
    private T_hrMapper hrMapper;
    @Autowired
    private T_workerMapper workerMapper;

    @Override
    public Result<List<T_talent>> getTalents() {
        return ResultUtils.success(talentMapper.selectList(null));
    }

    public Result<List<T_talent>> getTalentByName(String name) {
        if(name!=null&&name!=""){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("name", name);
        return ResultUtils.success(talentMapper.selectList(queryWrapper));
        }else return ResultUtils.error(new ResultMessage(500,"姓名为空"));
    }

    @Override
    public Result<T_talent> getTalentById(int id) {
        if(id<=0) {return ResultUtils.error(new ResultMessage(500,"id非法"));}
        return ResultUtils.success(talentMapper.selectById(id));
    }

    @Override
    public Result addTalent(T_talent newTalent) {
       int result = talentMapper.insert(newTalent);
       if (result>0){
           return ResultUtils.success();
       }
        else return ResultUtils.error(new ResultMessage(500,"添加失败"));
    }

    @Override
    public Result updateTalent(T_talent talent) {
       int result = talentMapper.updateById(talent);
        if (result>0){
            return ResultUtils.success();
        }
        else return ResultUtils.error(new ResultMessage(500,"更新失败"));
    }


}
