package com.foe.talentmanagementback.service;

import com.foe.talentmanagementback.entity.pojo.T_department;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
public interface IT_departmentService extends IService<T_department> {

    public T_department getDepartmentByTalentId(Integer talentId);

    public T_department getDepartmentById(Integer departmentId);
}
