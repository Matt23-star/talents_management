package com.foe.talentmanagementback.entity;

import lombok.Data;

@Data
public class ResultMessage {

    private Integer code;
    private String message;

    public ResultMessage(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
