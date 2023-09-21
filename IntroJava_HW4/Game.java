/** Game.java
*   Author: El Chu hc3294
*   
*   
*   Game class for playing crazy eights in commandline
*   To be used with Player, Card, Deck classes
*
*   The main body of the Crazy Eights game. It calls the player class to
*   interact with the user and determine if the card outputted is valid
*   within the parameters of the game rules. If the player's card is 
*   valid, the computer method within the game class is called to output
*   a card. After each turn, the game class uses methods to check if either
*   the computer or player ran out of cards, the deck ran out of cards, or
*   if either played an 8 card. If either of those conditions are met, so
*   say the player played all their cards, the correlated endings is outputted
*   . So, for the player, the system would say they won. 
*/


import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

class Game{

    private char currentSuit; // need in case an 8 is played
    private Card faceup; 
    private Scanner input;
    private Player p1;
    private ArrayList<Card> compHand;
    private Deck cards;
    
    // sets up the Game object for play
    public Game(){
        input = new Scanner(System.in);
        p1 = new Player();
        cards = new Deck();
        compHand = new ArrayList<Card>();
        cards.shuffle();
        //returning top card 
        faceup = cards.deal();
        currentSuit = faceup.getSuit();
        //gives computer and human player 7 cards form top of deck
        for (int i=0; i<7; i++){
            compHand.add(cards.deal());
            p1.addCard(cards.deal());
            
        }
    }//end method

    // Plays a game of crazy eights. 
    // Returns true to continue playing and false to stop playing
    public boolean play(){
        // Game introduction string
        System.out.println(intro());
        //While loop that runs if there are still cards in the deck and both
        //players have cards in their hands
        while(cards.canDeal() && p1.getHand().size()>0 && compHand.size()>0) {
            System.out.println("The up card is the "+faceup);
            System.out.println("The current suit is "+currentSuit+"\n");

            //player plays a card & assigns it as new up card and rank
            Card turn = p1.playsTurn(cards);
            faceup = turn;
            //if player doesn't have cards or deck runs out, the game ends
            if ( p1.getHand().size() == 0 || faceup == null) {
               return endGame();
            }
            //method is called to check if the card the player played 
            //is an 8, if not just the suit of the card is returned
            currentSuit = checkplaySuit();

            //computer puts down a card & assigns new up card and rank
            Card turnC = computerTurn();
            faceup = turnC;
            if ( compHand.size() == 0 || faceup == null) {
               return endGame();
            }
            //method is called to check if the card the computer just played 
            //is an 8, if not just the suit of the card is returned
            currentSuit = checkcompSuit();
        }
        return endGame();
    }//end method

    //intro of Crazy Eight game
    private String intro(){
        String introString ="    Welcome to Crazy Eights! You have 7 cards.\n";
            introString +="Your job is to match a card in your hand with the\n";
            introString +="up card. You can match it by suit or rank. If\n";
            introString +="you play an 8, you can switch the active suit.\n";
            introString +="If you run out of cards, you win! If you make it\n";
            introString +="through the whole deck then whoever has the \n";
            introString +="fewest cards left wins! Good luck!\n";
        return introString;
    }//end method

    //checks if player card is special, if so returns new suit 
    private char checkplaySuit(){
        char s;
        if (faceup.getRank()==8){
            //asks user what suit they want to play and returns new suit
            System.out.println("You played an 8! What suit do you want?");
            System.out.println("Type c,d,h, or s");
            String tempSuit = input.nextLine();
            s = tempSuit.charAt(0);
            return s;
        }
        else{
            //returns regular suit
            s = faceup.getSuit();
            return s;
        }
    }//end method

    //checks if computer card is special, if so returns new suit
    private char checkcompSuit(){
        char s;
        if (faceup.getRank()==8){
            //assigns new suit as the suit of the computer's first card
            s = compHand.get(1).getSuit();
            System.out.println("Computer just played an 8!");
            System.out.println("The new suit is "+ s);
            return s;
        }
        else {
            //returns regular suit
            s = faceup.getSuit();
            return s;
        }
    }//end method

    //returns boolean to see if card inputted is a valid response
    private boolean isValid(Card cardCheck){
        //checks if card is able to be played
        if (cardCheck.getSuit()== currentSuit || cardCheck.getRank()== 8
            ||cardCheck.getRank()==faceup.getRank()){
            return true;
        }
        else {
            //if not valid, will return false
            return false;
        }
    }//end method

    //figures out why the game ended and declares the winner
    private boolean endGame(){
        //for if the player played all their cards
        if (p1.getHand().size() == 0){
            System.out.println("You played all your cards! You win :)");
        }
        //for if the computer played all their cards
        else if (compHand.size() == 0){
            System.out.println("Computer just played all of their cards!" + 
            "\n You lose :(");
        }
        //for if the deck ran out of cards
        else if (faceup == null){
            //checks who has the least amount of cards and declares winner
            System.out.println("There are no more cards in the deck!");
            if(p1.getHand().size() > compHand.size()){
                System.out.println("You have the most amount of cards!"+ 
                "\n You lose :(");
            }
            else{
                System.out.println("You have the least amount of cards!" + 
                "\n You win!");
            }
        }
        //returns true or false depending on if the player wants to play again
        System.out.println("Do you want to play again? Type yes or no.");
        String userResponse = input.nextLine();
        //returns true or false, if true, plays the game again.
        if (userResponse.equals("yes")){
            return true;
        }
        else {
            return false;
        }
    }//end method

    //returns a playable card by the computer
    private Card computerTurn(){
        //creates a temp card to be filled later
        Card comp = new Card('x', 100); 
        //for loop to loop through computer's cards 
        for (int i= 0; i< compHand.size(); i++){
            //if the card meets to conditions of being able to be played, 
            //the card is returned 
            if (isValid(compHand.get(i))){
                comp = compHand.get(i);
                System.out.println("The computer played: "+ comp.toString());
                compHand.remove(comp);
                return comp;
            }
        }
        //gets the top card of the deck for the computer
        comp = cards.deal();
        //checks if new card is valid, if not keeps drawing cards
        while(!isValid(comp)){
            //adds card into deck
            compHand.add(comp);
            comp = cards.deal();
        }
        //if is valid, the card is returned to be played
        System.out.println("The computer played: "+ comp.toString());
        compHand.remove(comp);
        return comp;
    }//end method


}//end class