package com.joy.learn_spring.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GameRunner {
    @Autowired
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Game is running");
        game.display();
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
