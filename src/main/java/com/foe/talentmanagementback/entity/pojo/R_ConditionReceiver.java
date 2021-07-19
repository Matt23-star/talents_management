package com.foe.talentmanagementback.entity.pojo;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/14/18:58
 * @Description:
 */
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
}
