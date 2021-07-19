package com.foe.talentmanagementback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.ResultMessage;
import com.foe.talentmanagementback.entity.pojo.T_login;
import com.foe.talentmanagementback.entity.pojo.T_talent;
import com.foe.talentmanagementback.entity.dto.UserDTO;
import com.foe.talentmanagementback.entity.enums.UserRight;
import com.foe.talentmanagementback.mapper.T_loginMapper;
import com.foe.talentmanagementback.mapper.T_talentMapper;
import com.foe.talentmanagementback.service.IT_registerService;
import com.foe.talentmanagementback.utils.ResultUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/11/16:11
 * @Description:
 */
@Service
public class T_registerServiceImpl implements IT_registerService {

    @Autowired
    private T_loginMapper loginMapper;
    @Autowired
    private T_talentMapper talentMapper;

    public Result register(String account, String passWord) {
        if (account != null && account != "" && passWord != null && passWord != "") {
            QueryWrapper<T_login> queryWrapperLogin = new QueryWrapper();
            queryWrapperLogin.eq("account_number", account);
            if (loginMapper.selectOne(queryWrapperLogin) != null) {
                return ResultUtils.error(new ResultMessage(500, "注册失败,该账号已注册"));
            } else {
                T_login login = new T_login();
                login.setAccountNumber(account);
                login.setPassword(passWord);
                int loginInsert = loginMapper.insert(login);
                T_talent talent = new T_talent();
                talent.setAccountNumber(account);
                int talentInsert = talentMapper.insert(talent);

                if (loginInsert == 1 && talentInsert == 1) {
                    QueryWrapper<T_talent> queryWrapperTalent = new QueryWrapper();
                    queryWrapperTalent.eq("account_number", account);
                    T_talent talentToDTO = talentMapper.selectOne(queryWrapperTalent);
                    ModelMapper modelMapper = new ModelMapper();
                    UserDTO userDTO = modelMapper.map(talentToDTO, UserDTO.class);
                    userDTO.setUserRight(UserRight.NORMAL_USER);
                    return ResultUtils.success(new ResultMessage(200, "注册成功"), userDTO);
                } else return ResultUtils.error(new ResultMessage(500, "注册失败，插入数据库异常"));
            }
        }
        return ResultUtils.error(new ResultMessage(500, "注册失败，参数为空"));
    }
}
