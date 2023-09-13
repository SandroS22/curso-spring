package com.github.sandros22.cursospring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.github.sandros22.cursospring.game.GameRunner;
import com.github.sandros22.cursospring.game.GamingConsole;

@Configuration
@ComponentScan("com.github.sandros22.cursospring.game")
public class GamingAppLauncherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}

}
