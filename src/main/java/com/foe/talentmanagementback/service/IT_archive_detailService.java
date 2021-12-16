package com.foe.talentmanagementback.service;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.bo.ExperienceDetailBO;
import com.foe.talentmanagementback.entity.pojo.T_archive_detail;
import com.baomidou.mybatisplus.extension.service.IService;
import com.foe.talentmanagementback.entity.dto.WorkExperienceDTO;

import java.util.List;


public interface IT_archive_detailService extends IService<T_archive_detail> {

    public Result<List<WorkExperienceDTO>> getArchivesByTalentId(int talentId);

    public Result<ExperienceDetailBO> getArchiveBytIdWcId(int talentId, int companyId);

}
