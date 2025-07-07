package com.joy.learn_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.joy.learn_spring.game.GameRunner;
import com.joy.learn_spring.game.GamingConsole;
import com.joy.learn_spring.game.Mariogame;
import com.joy.learn_spring.game.PacMan;
import com.joy.learn_spring.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringApplication.class, args);
		// Mariogame game = new Mariogame();
		// SuperContraGame game = new SuperContraGame();
		// GamingConsole game = new PacMan();
		// GameRunner runner= new GameRunner(game);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
	}

}
