package com.foe.talentmanagementback.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Matt
 * @date: 2021/7/9/14:46
 * @description:
 */

@Data
public class Result<T> implements Serializable {

    private Integer code;
    private String message;
    private T data;

}
