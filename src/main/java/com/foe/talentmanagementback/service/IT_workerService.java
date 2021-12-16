package com.foe.talentmanagementback.service;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.dto.WorkExperienceListDTO;
import com.foe.talentmanagementback.entity.pojo.T_worker;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface IT_workerService extends IService<T_worker> {

    Result<WorkExperienceListDTO> getWorkerByArchiveId(Integer archiveId);
}
