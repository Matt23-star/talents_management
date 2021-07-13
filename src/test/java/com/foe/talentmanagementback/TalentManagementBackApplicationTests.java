package com.foe.talentmanagementback;

import com.foe.talentmanagementback.utils.DateUtils;
import com.foe.talentmanagementback.utils.RightUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class TalentManagementBackApplicationTests {

    @Autowired
    RightUtils rightUtils;
    @Test
    public void Run(){

        System.out.println(DateUtils.getDaysInterval(new Date(1625134110l),null));
    }
}
