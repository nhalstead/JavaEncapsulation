package com.sjrobotics.velocity.encapsulation;

public class Game1 extends Game {
	
	private int range = 10;
	
	public Game1() {
		this.answer = generateAnswer();
	}
	
	public Game1(int inHighGuess) {
		super(inHighGuess);
		range = inHighGuess/3;
	}
	
	public String getHint(int guess) {
		if(answer+range > guess && answer-range < guess) {
			return "Ehh, You are warm.";
		}
		else {
			return "NORTH POLE COLD!!!!";
		}
	}
	
	
}
