package com.foe.talentmanagementback.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.dto.MyOrganizationDTO;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/12/9:51
 * @Description:
 */
@Component
public interface T_organizationMapper extends BaseMapper<MyOrganizationDTO> {
    @Select("select ad.company_id,c.name,c.certification,ad.department_last,d.department_name,d.department_function " +
            " from t_archive_detail ad,t_company c,t_department d " +
            " where ad.company_id = c.id and ad.company_id = d.company_id and ad.department_last = d.id and ad.talent_id = #{arg0} and ad.company_id = #{arg1}")
    MyOrganizationDTO getMyOrganization(int talentId,int companyId);
}
