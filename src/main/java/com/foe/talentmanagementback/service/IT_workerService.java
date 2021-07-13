package com.foe.talentmanagementback.service;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.dto.WorkExperienceListDTO;
import com.foe.talentmanagementback.entity.pojo.T_worker;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/09/23:11
 * @Description:
 */
public interface IT_workerService extends IService<T_worker> {

    public Result<WorkExperienceListDTO> getWorkerByArchiveId(Integer archiveId);
}
