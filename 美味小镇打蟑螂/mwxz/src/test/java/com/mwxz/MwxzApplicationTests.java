package com.mwxz;

import com.mwxz.service.MwxzService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MwxzApplicationTests {

    @Autowired
    private MwxzService mwxz;
    @Test
    void contextLoads() {
        mwxz.Saveoil();
    }

}
