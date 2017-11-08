package com.sjrobotics.velocity.encapsulation;

/**
 * Object and Encapsulation
 * @author Noah Halstead
 */
public class App 
{
    public static void main( String[] args )
    {
    	Game newGame = new Game();
        System.out.println(newGame.isSetup()?"SETUP Game 1":"AHH NOT SETUP");
        
        newGame.cheatMode();
        System.out.println(newGame.getAnswer());
        
        
        
    }
}
