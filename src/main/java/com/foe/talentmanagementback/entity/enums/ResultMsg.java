package com.foe.talentmanagementback.entity.enums;

/**
 * @author: Matt
 * @date: 2021/7/11/9:48
 * @description:
 */
public enum ResultMsg {

    SUCCESS(200,"成功"),
    USER_NOT_EXIST(404,"用户名或密码错误"),
    TALENT_NOT_EXIST(404,"该系统人才不存在"),
    ARCHIVE_NOT_EXIST(404,"该档案不存在");

    private Integer code;
    private String message;

    ResultMsg(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
