package com.foe.talentmanagementback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.foe.talentmanagementback.entity.T_evaluation_details;
import com.foe.talentmanagementback.mapper.T_evaluation_detailsMapper;
import com.foe.talentmanagementback.service.IT_evaluation_detailsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 评价详情表 服务实现类
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
@Service
public class T_evaluation_detailsServiceImpl extends ServiceImpl<T_evaluation_detailsMapper, T_evaluation_details> implements IT_evaluation_detailsService {

    @Autowired
    private T_evaluation_detailsMapper evaluationDetailsMapper;

    @Override
    public List<T_evaluation_details> getEvaluationsByADId(int archiveDetailId) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("archive_detail_id",archiveDetailId);
        return evaluationDetailsMapper.selectList(queryWrapper);
    }
}

