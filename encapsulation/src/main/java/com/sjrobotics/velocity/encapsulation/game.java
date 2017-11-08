package com.sjrobotics.velocity.encapsulation;

import java.util.Random;

public class Game {
	
	private int hightGuess = 100;
	private int lowestValue = 0;
	private int answer = -1;;
	
	private int highestValue = 100;
	private String[] outputC = new String[] { "You WON!", "YOU GOT IT!", "WAY TO GO! YOU WIN!", "WINNER!!!!!", "You Have got It!"};
	
	public Game() {
		this.answer = generateAnswer();
	}
	
	public Game(int inHighGuess) {
		if(inHighGuess < 1) {
			throw new IllegalArgumentException();
		}
		this.hightGuess = inHighGuess;
		this.answer = generateAnswer();
	}
	
	private int generateAnswer() {
		int answer = -1;
		Random random = new Random();
		answer = random.nextInt()%(this.hightGuess + 1);
		answer = Math.abs(answer);
		return answer;
	}
	
	public boolean isSetup() {
		if(this.answer != 0 || this.answer != -1) { return true; }
		return false;
	}
	
	
	
}
