package com.foe.talentmanagementback.service;

import com.foe.talentmanagementback.entity.T_archive_detail;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
public interface IT_archive_detailService extends IService<T_archive_detail> {

    public List<T_archive_detail> getArchivesByTalentId(int talentId);

}
