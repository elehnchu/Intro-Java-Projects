/** Player.java
*   Author: El Chu hc3294
*   
*   Player class as part of Crazy Eights
*   To be used with Game, Card, Deck classes
*   The point of this class is to create a player object in the Game class
*   that has its array of cards that we can manipulate using the methods within
*   Within the game class, we can add cards to the player objects hand, play
*   a card the user wishes to play, and display the cards the user has in
*   their hand through methods within this class.
*
*/

import java.util.ArrayList;
import java.util.Scanner;

class Player{
    
    private ArrayList<Card> hand; // the player's hand
    private Scanner input;

    public Player(){
        // your code here
        hand = new ArrayList<Card>();
        input = new Scanner(System.in);
    }

    // Adds a card to the player's hand
    public void addCard(Card c){
        
	    hand.add(c);
    }
   
    // Covers all the logic regarding a human player's turn
    public Card playsTurn(Deck deck){
        //Strings used to print out user instructions and cards
        System.out.println(draw());
        System.out.println("\n" +handToString());
        String userInput = input.nextLine();
        //draws a card if a user wants one and displays new hand
        while (userInput.equals("draw")){
            if(deck.canDeal()==true){
                this.addCard(deck.deal());
                System.out.println(this.displayHand());
                System.out.println(draw());
                userInput = input.nextLine();
            }
            //if there are no more cards in the deck, will return null
            else {
                return null;
            }
        }
        //return card player wishes to discard = become faceup
        int userNum = (Integer.parseInt(userInput)) -1;
        Card temp = hand.get(userNum);
        System.out.println("You just played the "+temp.toString());
        hand.remove(temp);
        return temp;
    }
    //Method of a string so can be used multiple times
    private String draw(){
        String i = "Type 'draw' to draw a card, or type the number\n";
        i += "next to the card in your hand that you wish to play.";
        return i;
    }
    //Displays new cards in players hand as a large string
    private String displayHand(){
        String handCard = "Your cards are now: \n";
        // for loop to list and number cards in hand
        for (int h = 0; h<hand.size(); h++){
            handCard += h+1 + "\t";
            //dunno about this one
            handCard += hand.get(h).toString()+ " \n";

        }
        return handCard;
    }
    
    // Accessor for the players hand
    public ArrayList<Card> getHand(){
        return hand; 
    }

    //Returns a printable string representing the player's hand
    public String handToString(){
       String handCard = "Your cards are: \n";
        // for loop to list and number cards in hand
        for (int h = 0; h<hand.size(); h++){
            handCard += h+1 + "\t";
            //dunno about this one
            handCard += hand.get(h).toString()+ " \n";

        }
        return handCard;
    }

} // end
