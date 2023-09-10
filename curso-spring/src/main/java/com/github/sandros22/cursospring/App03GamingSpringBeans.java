package com.github.sandros22.cursospring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.github.sandros22.cursospring.game.GameRunner;
import com.github.sandros22.cursospring.game.GamingConsole;
import com.github.sandros22.cursospring.game.MarioGame;
import com.github.sandros22.cursospring.game.PacmanGame;
import com.github.sandros22.cursospring.game.SuperContraGame;

@SuppressWarnings("unused")
public class App03GamingSpringBeans {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}

}
