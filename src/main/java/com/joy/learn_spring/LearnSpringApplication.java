package com.joy.learn_spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.joy.learn_spring.game.GameRunner;
import com.joy.learn_spring.game.Mariogame;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LearnSpringApplication.class, args);
		Mariogame game = new Mariogame();
		GameRunner runner= new GameRunner(game);
		runner.run();
	}

}
