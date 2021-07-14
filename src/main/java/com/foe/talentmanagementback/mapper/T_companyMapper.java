package com.foe.talentmanagementback.mapper;

import com.foe.talentmanagementback.entity.dto.TalentDTO;
import com.foe.talentmanagementback.entity.pojo.T_company;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */

@Component
public interface T_companyMapper extends BaseMapper<T_company> {
    @Select("select t.*,d.department_name,d.id,ad.department_last " +
            "from t_archive_detail ad,t_talent t,t_department d " +
            "where t.company_id = #{companyId} and t.id = ad.talent_id and " +
            "t.company_id = ad. company_id and ad.company_id = d.company_id and " +
            "ad.department_last = d.id")
    List<TalentDTO> getTalentByCompanyId(int companyId);
}
