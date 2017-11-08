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
        
        Game newGame2 = new Game(24);
        System.out.println(newGame2.isSetup()?"SETUP Game 2":"AHH NOT SETUP");
        
        try {
        	Game newGame3 = new Game(-1);
        	System.out.println(newGame3.isSetup()?"SETUP Game 3":"AHH NOT SETUP");
        }
        catch ( RuntimeException e ){
        	System.out.println("YOU CAN NOT PUT LOWER THAN 1!!!!");
        }
    }
}
