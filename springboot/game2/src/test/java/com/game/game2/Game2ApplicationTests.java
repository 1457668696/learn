package com.game.game2;

import com.game.game2.service.GameQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Game2ApplicationTests {


    @Autowired
    private GameQuery gameQuery;
    @Test
    void contextLoads() {

//        gameQuery.queryAllGame();
    }

}
