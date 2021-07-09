package com.foe.talentmanagementback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 张越
 * @Date: 2021/07/09/23:11
 * @Description:
 */

@Data
public class T_login implements Serializable {

    private Integer id;

    private String nikname;

    private String briefIntroduction;

    private Integer accountNumber;

    private Integer password;

    private String headPortrait;
}
