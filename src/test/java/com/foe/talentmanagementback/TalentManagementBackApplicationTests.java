package com.foe.talentmanagementback;

import com.foe.talentmanagementback.utils.RightUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TalentManagementBackApplicationTests {

    @Autowired
    RightUtils rightUtils;
    @Test
    public void Run(){

        rightUtils.confirmRight(1);
    }
}
