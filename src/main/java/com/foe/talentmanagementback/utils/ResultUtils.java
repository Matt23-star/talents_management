package com.foe.talentmanagementback.utils;

import com.foe.talentmanagementback.entity.Result;
import com.foe.talentmanagementback.entity.ResultMessage;
import com.foe.talentmanagementback.entity.enums.ResultMsg;

public class ResultUtils {

    //带code和参数的成功
    public static <T> Result success(ResultMsg resultMessage, T data){
        Result<T> result = new Result<>();
        result.setCode(resultMessage.getCode());
        result.setMessage(resultMessage.getMessage());
        result.setData(data);
        return result;
    }

    public static <T> Result success(ResultMessage resultMsg, T data){
        Result<T> result = new Result<>();
        result.setCode(resultMsg.getCode());
        result.setMessage(resultMsg.getMessage());
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

    public static <T> Result error(ResultMessage resultMessage){
        Result<T> result = new Result();
        result.setCode(resultMessage.getCode());
        result.setMessage(resultMessage.getMessage());
        return result;
    }

    public static <T> Result error(ResultMsg errorMsg){
        Result<T> result = new Result();
        result.setCode(errorMsg.getCode());
        result.setMessage(errorMsg.getMessage());
        return result;
    }
}
