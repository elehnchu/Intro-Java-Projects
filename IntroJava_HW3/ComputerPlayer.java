/**
 * This class represents a computer
 * player in the Odd-Even game
 * 
 *  El Chu
 *  hc3294
 *  ComputerPlayer.java
 *  Allows individual player objects to be created so certain actions can 
 *  be called such as add and subtraction, yet only specific to that object. 
 *  Also is used to return the random computer value after the threshold has 
 *  been determined. 
 */

import java.util.Scanner;
public class ComputerPlayer{
    private double t;
    private int tokenBalance;
    public int c;

    //when called, assignes the desired threshold into t
    public ComputerPlayer(double threshold){
        t=threshold;
        tokenBalance=0;
    } //end method
    
    //used for OddEven to just declare an arbitrary threshold 
    public ComputerPlayer() {
        t=0.5;
    }
    
    /* Determines randomly whether 1 or 2 is returned based off of a certain
       declared threshold.
    */ 
    public int random (){
        double computerinput = (double)(Math.random());
        if (computerinput > t) {
            c= 2;
        }
        else {
            c = 1;
        }
        return c;
    }//end method 

    //adds a certain amount to the objects specific tokenBalance
    public void add (int addition) {
        tokenBalance += addition;
    }// end method

    //subtracts a certain amount to the objects specific tokenBalance
    public void subtraction (int subtraction){
        tokenBalance -= subtraction;
    }// end method

    //returns the overall token balance of the object
    public int Balance(){
        return tokenBalance;
    }// end method
    
    
}// end class