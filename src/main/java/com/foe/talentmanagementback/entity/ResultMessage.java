package com.foe.talentmanagementback.entity;

import lombok.Data;

/**
 * @author: Matt
 * @date: 2021/7/9/15:00
 * @description:
 */

@Data
public class ResultMessage {

    private Integer code;
    private String message;

    public ResultMessage(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
