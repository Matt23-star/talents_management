package com.foe.talentmanagementback.entity.pojo;

import lombok.Data;

@Data
public class R_ConditionReceiver {
    private String page;
    private String field;
    private String major;
    private int[] age;
    private int[] professionalKnowledge;
    private int[] opinionValue;
    private int[] ability;
    private int[] performance;
    private int[] executiveAbility;
    private String degree;
    private String nativePlace;
    private String address;
}
