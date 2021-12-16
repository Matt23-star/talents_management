package com.foe.talentmanagementback.entity;

import lombok.Data;

import java.io.Serializable;


@Data
public class Result<T> implements Serializable {

    private Integer code;
    private String message;
    private T data;

}
