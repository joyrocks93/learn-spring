package com.joy.learn_spring.game;

import org.springframework.stereotype.Controller;

@Controller
public class PacMan implements GamingConsole {
    public void display() {
        System.out.println("PacMan Game");
    }

    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Slide");
    }

    public void left() {
        System.out.println("Go back");
    }

    public void right() {
        System.out.println("Accelerate");
    }
}
