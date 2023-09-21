/**
 * This class represents the Odd-Even game
 * 
 *  El Chu
 *  hc3294
 *  Game.java
 *  The overall point of this class is to actually create the games being 
 *  played. For OddEven, the code interacts with the user to determine what 
 *  player they want to be, what number they want to throw, and if they want 
 *  to continue, calling the necessary methods to assist in calculating 
 *  the numbers being displayed. 
 */
import java.util.Scanner;
public class Game{
    private ComputerPlayer p1; //human
    private ComputerPlayer p2; //computer
    public Scanner scan = new Scanner(System.in);


/* this version of the game constructor is for Part 1
 * it takes no parameters */
    public Game(){
        p1 = new ComputerPlayer();
        p2 = new ComputerPlayer();
    }// end method
    
/* this version of the game constructor is for Part 2
 * It requires two doubles as parameters. You will use 
 * these to set the initial thresholds for you computer players */
    public Game (double t1, double t2){
        // your code here
        p1 = new ComputerPlayer(t1);
        p2 = new ComputerPlayer(t2);
    }// end method
    
/* this version of the play method is for Part 1
 * It takes no parameters and should play the interactive
 * version of the game */

    /*method called to ask whether the user wants to be odd or even. 
     *Plays the playOdd or playEven depending on the answer.
    */
    public void play(){
        System.out.println("Do you want to be Odd(type 1) or Even(type 2)?");
        int playerNum = scan.nextInt();
        //if statement choosing to play playOdd else playEven
        if (playerNum == 1){
            playOdd();
        }
        else {
            playEven();
        } 
    }// end method
    /*Determines whether the player wins or loses based off of the sum of 
     *the two players answers. Prints out the round total.
    */
    public void playOdd(){
        int continuee = 1; 
        int runningTotal = 0;

        while(continuee==1){
        System.out.println("Do you want to throw in a 1 or 2 this round?");
        int pturn = scan.nextInt();
        int sum = pturn + p2.random();
        if (sum % 2 == 0){
            System.out.println("Sum this round is "+sum+".You lost:(");
            runningTotal -= sum;
	        System.out.println("Your round total is now " + runningTotal);
            System.out.println("Computer total is now " +(-1 * runningTotal));
            p1.add (sum);
        }
        else {
            System.out.println("Sum this round is "+sum +".You won :)");
            runningTotal += sum;
	        System.out.println("Your round total is now " + runningTotal);
            System.out.println("Computer total is now " +(-1 * runningTotal));
            p1.subtraction (sum);
        }// end if/else statement 
            //method for scores
            continuee=playAgain();
        }// end while loop
        totalScores();
    }// end method 


    /* This method does the opposite of the playOdd method in terms of what
     * it prints out when the sum is calculted. It also calculates the round 
     * total and declares it.
    */
    public void playEven(){
        int continuee = 1;
        int runningTotal = 0;

        while(continuee==1){
        System.out.println("Do you want to throw in a 1 or 2 this round?");
        int pturn = scan.nextInt();
        int sum = pturn + p2.random();
            
        if (sum % 2 == 0){
            System.out.println("Sum this round is "+sum +".You won :)");  
            runningTotal += sum;
	        System.out.println("Your round total is now " + runningTotal);  
            System.out.println("Computer total is now " +(-1 * runningTotal));        
            p1.subtraction (sum);
        }
        else {
            System.out.println("Sum this round is "+sum +".You lost :(");
            runningTotal -= sum;
	        System.out.println("Your round total is now " + runningTotal);
            System.out.println("Computer total is now " +(-1 * runningTotal));
            p1.add (sum);
        }// end if loop
            continuee=playAgain();
        } // end while loop
        totalScores();
    }// end method

    /* Called in the playEven and Odd method to prompt the user if they want 
     * to play again. A one is returned if yes which keeps the while loop in 
     * the playEven/Odd above to keep running.
    */    
    public int playAgain(){
        System.out.println("Play again? For yes type 3, for no type 4.");
        int againyn = scan.nextInt();
        if (againyn == 3){
            return 1;
        }
        else {
            return 0;
        }//end loop
    }// end method

    /* Calculates the scores of the computer and user overall after every 
     * round
    */ 
    public void totalScores(){
        System.out.println("Computer score is " + p1.Balance());
        System.out.println("Your score is "+(-1 * p1.Balance()));
    }// end method 
        
    
    
/** this version of the play method is for Part 2
 * It takes a single int as a parameter which is the
 * number of computer vs. computer games that should be played */
    public void play(int games){
        /* loops through the number of games wished to play and adds or 
         * subtracts the sum to both players depending on whether the 
         * player is odd or even.
        */
        for (int i=0; i<games; i++ ){
            int threshp1 = p1.random();
            int threshp2 = p2.random();
            int sum = threshp1 + threshp2;

            if (sum%2 == 0){
                p2.add(sum);
                p1.subtraction(sum);
            }
            else {
                p1.add(sum);
                p2.subtraction(sum);
            }// end if else loop

        }// end for loop

    }// end method

/* this method should return the current score (number of tokens)
 * that player 1 has */
    public int getP1Score(){
        // your code here
        return p1.Balance();
    }// end method
    
/* this method should return the current score (number of tokens)
 * that player 2 has */
    public int getP2Score(){
        // your code here
        return p2.Balance();
    } // end method
    
    
}