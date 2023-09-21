/** Card.java
*   Author: El Chu hc3294
*   
*   
*   Models a typical playing card
*   The point of this class is to be able to create specific cards that mimic
*   a normal card like the Jack of Hearts. It takes in a character(s, d, c,& h)
*   for the suit and a number(1-13) to determine the rank. After a card is
*   created, it puts it in a known form so number 11 turns in Jack. 
*/

class Card{
    
    private char suit;
    private int rank;

    // Initializes a card instance
    public Card(char suit, int rank){
        this.suit=suit;
        this.rank=rank;
    }

    // Accessor for suit
    public char getSuit(){
        return suit;
    }
    
    // Accessor for rank
    public int getRank(){
        return rank;
    }

    String [] Ranks={"Ace","2","3","4","5","6","7","8","9","10","Jack",
    "Queen","King"};
    String [] Suits={"Clubs", "Diamonds", "Spades", "Hearts"};

    // Returns a human readable form of the card (eg. King of Diamonds)
    public String toString(){
        //calls the assign Rank and Suit methods to be used in a string form
        String cdhs = assignRank() +" Of "+ assignSuit();
        return cdhs; 
    }
    //Assigns the C, D, H, and S of a user's input to an actual suit
    public String assignSuit(){
        int suites = 0;
        if (getSuit()== 'c' ){
            suites = 0;
        }
        else if (getSuit()=='d'){
            suites = 1;
        }
        else if (getSuit()=='h'){
            suites = 3;
        }
        else if (getSuit()== 's'){
            suites = 2;
        }
        return Suits[suites];
    }//end method 

    //Assigns the special ranks to their corresponding name
    public String assignRank(){
        int ranks = 0;
        if (getRank()==1){
            ranks = 0;
        }
        else if (getRank()==11){
            ranks = 10;
        }
        else if (getRank()==12){
            ranks = 11;
        }
        else if (getRank()==13){
            ranks = 12;
        }
        else{
            ranks =(getRank()-1);
            
        }
        return Ranks[ranks];
    }// end method

}//end class