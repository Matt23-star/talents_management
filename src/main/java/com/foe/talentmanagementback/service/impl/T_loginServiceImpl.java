package com.foe.talentmanagementback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.ResultMessage;
import com.foe.talentmanagementback.entity.T_login;
import com.foe.talentmanagementback.entity.T_talent;
import com.foe.talentmanagementback.mapper.T_loginMapper;
import com.foe.talentmanagementback.mapper.T_talentMapper;
import com.foe.talentmanagementback.service.IT_loginService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.foe.talentmanagementback.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/09/23:11
 * @Description:
 */
@Service
public class T_loginServiceImpl extends ServiceImpl<T_loginMapper, T_login> implements IT_loginService {

    @Autowired
    private T_loginMapper loginMapper;

    @Autowired
    private T_talentMapper talentMapper;

    @Override
    public Result<T_talent> login(String account, String password) {
        QueryWrapper<T_login> queryWrapperLogin = new QueryWrapper<>();
        queryWrapperLogin.eq("account_number", account);
        queryWrapperLogin.eq("password",password);
        T_login login = loginMapper.selectOne(queryWrapperLogin);
        if(login==null){
            return ResultUtils.error(new ResultMessage(1,"该用户不存在！"));
        }
        return ResultUtils.success(new ResultMessage(11,"登陆成功"), talentMapper.selectById(login.getId()));
    }
}
