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
    TALENT_ARCHIVE_NOT_EXIST(404,"该系统人才无档案"),
    ARCHIVE_NOT_EXIST(404,"该档案不存在"),
    EVALUATION_NOT_EXIST(404,"该档案中没有评价"),
    ENTRYTIME_IS_NULL(404,"入职时间为空");


    private Integer code;
    private String message;


    ResultMsg(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResultMsg{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
