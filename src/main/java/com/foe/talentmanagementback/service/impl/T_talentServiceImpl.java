package com.foe.talentmanagementback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foe.talentmanagementback.entity.*;
import com.foe.talentmanagementback.entity.dto.TalentSquareDTO;
import com.foe.talentmanagementback.entity.pojo.R_ConditionReceiver;
import com.foe.talentmanagementback.entity.pojo.T_talent;
import com.foe.talentmanagementback.mapper.*;
import com.foe.talentmanagementback.service.IT_talentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.foe.talentmanagementback.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class T_talentServiceImpl extends ServiceImpl<T_talentMapper, T_talent> implements IT_talentService {
    @Autowired
    private T_talentMapper talentMapper;

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

            return ResultUtils.success(new ResultMessage(200,"更新成功"), talentMapper.selectById(talent.getId()));
        }
        else return ResultUtils.error(new ResultMessage(500,"更新失败"));
    }

    @Override
    public Result<List<TalentSquareDTO>> getTalentInSquare(R_ConditionReceiver receiver) {
        Page<T_talent> talentPage = new Page<>(Integer.parseInt(receiver.getPage()), 10);
        IPage<TalentSquareDTO> result =  talentMapper.getTalentInSquare(talentPage,receiver);
        return ResultUtils.success(result);
    }


}
