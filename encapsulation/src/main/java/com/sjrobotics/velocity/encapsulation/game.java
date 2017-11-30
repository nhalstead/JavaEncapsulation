package com.sjrobotics.velocity.encapsulation;

import java.util.Random;

public class Game {
	
	protected int hightGuess = 100;
	private int lowestValue = 0;
	protected int answer = -1;;
	
	private boolean isCheater = false;
	private int highestValue = 100;
	private static String[] outputC = new String[] { "You WON!", "YOU GOT IT!", "WAY TO GO! YOU WIN!", "WINNER!!!!!", "You Have got It!"};
	
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
	
	public void setHigh(int inHighGuess) {
		this.hightGuess = inHighGuess;
		this.answer = generateAnswer();
	}
	
	protected int generateAnswer() {
		int answer = -1;
		Random random = new Random();
		answer = random.nextInt()%(this.hightGuess + 1);
		answer = Math.abs(answer);
		return answer;
	}
	
	public boolean isGuessCorrect(int inGuess) {
		if(this.answer == inGuess) { return true; }
		return false;
	}
	
	public boolean isSetup() {
		if(this.answer != 0 || this.answer != -1) { return true; }
		return false;
	}
	
	public String getHint(int guess) {
		if(guess > this.answer) {
			return "Too High!";
		}
		else if(guess < this.answer) {
			return "Too Low!";
		}
		else {
			return "";
			//return "Hmm you should be Right!";
		}
	}
	
	
	public void cheatMode() {
		this.isCheater = true;
	}
	public int getAnswer() {
		if(this.isCheater == true) {
			return this.answer;
		}
		return 0;
	}
	
	public String getMessage() {
		return arrayNext(this.outputC);
	}
	
	// https://stackoverflow.com/a/8065554
    private static int arrayNext(int[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
    private static String arrayNext(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
	
}
