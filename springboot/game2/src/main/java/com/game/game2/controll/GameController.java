package com.game.game2.controll;


import com.game.game2.common.R;
import com.game.game2.dao.Game;
import com.game.game2.service.GameQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameQuery gameQuery;

    @GetMapping("/sihai")
    public R<Game> test(){

      Game game=gameQuery.queryAllGame();

        return R.success(game);
    }
}