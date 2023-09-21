/** Deck.java
*   Author: El Chu hc3294
*   
*   Models a typical deck of playing cards
*   To be used with Card class
*   The point of this class is to be able to create an object in the game class
*   that functions as a deck of cards. It calls the card class to create the
*   52 cards. This class is able to shuffle, deal out, and create a giant
*   string of the cards in the deck.
*/

class Deck{

    private Card[] deck; // contains the cards to play with
    private int top; // controls the "top" of the deck to deal from
    //creates the different suits 
    char [] suits= new char[] {'c','d','h','s'};

    // constructs a default Deck
    public Deck(){
        int top = 0;
        deck = new Card[52];
        int p = 0;
        //for loop to move through suits array
        for (int i=0; i<suits.length;i++){
            //for lop to move through 1-13 for card rank 
            for (int j=1; j<14; j++){
                deck[p] = new Card(suits[i], j);
                p++;
            }
        }
    }//end method

    // Deals the top card off the deck
    public Card deal(){
        //if can deal, will deal the card else will return null
        if (this.canDeal()){
            Card todeal = deck[top];
            top++;
            return todeal;
        }
        else{
            return null;
        }
        
    }//end method

    //Determines if the facedown pile still has cards to deal out
    public boolean canDeal(){
        // if the top isn't the last index then there are still cards to deal
        if (top < 52){
            return true;
        }
        else{
            return false;
        }
    }//end method
    

    //Shuffles the deck
    public void shuffle(){
        // loop to swap the cards in the deck 1000 times
        for (int i=0; i<10000; i++){
            //generate random number to find two random cards to swap
            int first = (int)(Math.random() * 52);
            int second = (int)(Math.random() * 52);
            Card tempC = deck[first];
            //swaps two values 
            deck[first] = deck[second];
            deck[second] = tempC;
        }
           
                
    }//end method

    // Returns a string representation of the whole deck
    public String toString(){
       //creates a giant string that posts all 52 cards
       String BIGSTRING = "All cards in the deck: \n";
       BIGSTRING += "Number \t Card \n";

        // lists all numbers 1-52 and all 52 cards
        for (int h = 0; h <52; h++){
            BIGSTRING += h+1 + "\t";
            BIGSTRING += deck[h].toString()+ " \n";

        }
        return BIGSTRING;
    }//end method

}//end class