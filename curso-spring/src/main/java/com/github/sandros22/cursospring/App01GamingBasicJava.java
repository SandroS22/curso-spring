package com.github.sandros22.cursospring;

import com.github.sandros22.cursospring.game.GameRunner;
import com.github.sandros22.cursospring.game.MarioGame;
import com.github.sandros22.cursospring.game.PacmanGame;
import com.github.sandros22.cursospring.game.SuperContraGame;

@SuppressWarnings("unused")
public class App01GamingBasicJava {

	public static void main(String[] args) {

		// var game = new MarioGame();
		var game = new PacmanGame();
		// var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
