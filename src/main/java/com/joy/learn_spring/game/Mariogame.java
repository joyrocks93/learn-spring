package com.joy.learn_spring.game;



public class Mariogame implements GamingConsole {
    public void display() {
        System.out.println("Mario Game");  
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
