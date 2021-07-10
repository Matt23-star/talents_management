package com.foe.talentmanagementback.utils;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.ResultMessage;

/**
 * @author: Matt
 * @date: 2021/7/9/14:50
 * @description:
 */
public class ResultUtils {

    //带code和参数的成功
    public static <T> Result success(ResultMessage resultMessage, T data){
        Result<T> result = new Result<>();
        result.setCode(resultMessage.getCode());
        result.setMessage(resultMessage.getMessage());
        result.setData(data);
        return result;
    }

    //带参数成功
    public static <T> Result success(T data){
        Result<T> result = new Result();
        result.setCode(0);
        result.setMessage("成功！！！");
        result.setData(data);
        return result;
    }
    //不带参数成功
    public static <T> Result success(){
        return success(null);
    }

    public static <T> Result error(ResultMessage errorMsg){
        Result<T> result = new Result();
        result.setCode(errorMsg.getCode());
        result.setMessage(errorMsg.getMessage());
        return result;
    }
}
