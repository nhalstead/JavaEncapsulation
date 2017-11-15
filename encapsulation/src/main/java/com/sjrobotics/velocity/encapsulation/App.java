package com.sjrobotics.velocity.encapsulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Objects and Encapsulation
 * @author Noah Halstead
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	Game newGame = new Game();
    	
    	System.out.println("Please set a High Guess");
    	newGame.setHigh(Integer.parseInt(in.readLine()));
    	
        //System.out.println(newGame.isSetup()?"SETUP Game":"AHH NOT SETUP");
        //newGame.cheatMode();
        //System.out.println(newGame.getAnswer());
        
        int guess = -1;
        for(int i = 0; i<3; i++) {
        	System.out.println("Please make a guess!");
        	String userInput = in.readLine();
        	guess = Integer.parseInt(userInput);
        	
        	if(newGame.isGuessCorrect(guess)) {
        		break;
        	}
        	else {
        		System.out.println(newGame.getHint(guess));
        	}
        }
        
        if(newGame.isGuessCorrect(guess)) {
        	System.out.println("You got it!!");
        }else {
        	System.out.println("No more guesses, you lose!!!");
        }
    }
    
    public static void plnB(String in) {
    	if(in != "") {
    		System.out.println(in);
    	}
    }

}

