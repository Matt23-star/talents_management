package com.foe.talentmanagementback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.foe.talentmanagementback.entity.T_archive_detail;
import com.foe.talentmanagementback.mapper.T_archive_detailMapper;
import com.foe.talentmanagementback.service.IT_archive_detailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */


@Service
public class T_archive_detailServiceImpl extends ServiceImpl<T_archive_detailMapper, T_archive_detail> implements IT_archive_detailService {

    @Autowired
    private T_archive_detailMapper archive_detailMapper;

    @Override
    public List<T_archive_detail> getArchivesByTalentId(int talentId) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("talent_id",talentId);
        return archive_detailMapper.selectList(queryWrapper);
    }

    @Override
    public T_archive_detail getArchiveBytIdWcId(int talentId, int companyId) {
        QueryWrapper<T_archive_detail> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("talent_id",talentId);
        queryWrapper.eq("company_id",companyId);
        return archive_detailMapper.selectOne(queryWrapper);
    }
}
