package com.joy.learn_spring.game;

public class GameRunner {

    private Mariogame game;
    public GameRunner(Mariogame game) {
        this.game = game;
    }
    public void run() {
         System.out.println("Game is running"); 
       game.up();
       game.down();
       game.left();
       game.right();
    }

}
