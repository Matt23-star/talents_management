package com.foe.talentmanagementback.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.dto.TalentDTO;
import com.foe.talentmanagementback.entity.pojo.T_company;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.foe.talentmanagementback.entity.pojo.T_talent;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */

@Component
public interface T_companyMapper extends BaseMapper<T_company> {
    @Select("select t.*,d.department_name,d.id,ad.department_last " +
            "from t_talent t left join t_archive_detail ad on t.id = ad.talent_id left join t_department d on ad.department_last = d.id " +
            "where t.company_id = #{companyId} and " +
            "(t.id = ad.talent_id or ad.talent_id is null) and " +
            "(t.company_id = ad.company_id or ad.company_id is null) and " +
            "(ad.company_id = d.company_id or ad.company_id is null) and " +
            "(ad.department_last = d.id or ad.company_id is null)")
        List<T_talent> getTalentByCompanyId(@Param("companyId") int companyId);
}
