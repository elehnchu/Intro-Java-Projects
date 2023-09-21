

El Chu
hc3294
Programming Project 4

Card

The card class has the methods getSuit, getRank, toString, assignSuit,
and assignRank. The getSuit and getRank methods are just simply used to
return the basic suit and rank of an initialized card in the form of A
single character or number. the assignRank and assignSuit methods give 
the corresponding number or letter their phrase that is commpnly known
within a deck. (ex rank 11 is turned into Jack). The toString method is 
used return both the rank and suit of the card in common card form. The
assignSuit and assignRank methods compare the values of what the card is
to expected values. If these values are equal, then the index location
of the corresponding array is set and the object at the arrays value is 
returned. These
methods are useful to be called in the other classes to see a specific
card's suit and rank. The string methods are also useful to convert the 
specific card's suit and rank in a readable format that can be printed out.

Deck

This Deck class has the Deck, deal, canDeal, shuffle, and toString method.
The Deck method first creates a new array for the new deck of cards and 
uses an interated for loop that first loops through the four suit
possibilties and then loops through the card number possibilities (1-13).
It then assigns the different suits and ranks to individual cards created
52 cards like a normal deck. The deal method acts as a pile that can of 
cards that can be distributed to the player or computer. It keeps a counter
of where the top of the deck is to make sure the cards in the deck are only
played once. It uses an if else loop calling the canDeal method to see if 
0nly one of each 52 cards is played. The canDeal method returns true if
there are still cards (amount less than 52) that can be dealt. Shuffle
method uses two math.randoms to call two random cards within the deck and
then it swaps them. The for loop is used to do this 10,000 times. The
toString method is just used to output all 52 cards. 

Player

The player class has the addCard, playsTurn, draw, displayHand, getHand, 
and handToString methods. The addCard method just adds the inputted card
to the players own card pile. PlaysTurn first calls the draw and 
handtoString methods to initially print out the players cards and 
instructions on what to do next. Is takes the users input, and while the
player keeps typing draw, and the deck still has cards to deal, then A
card is added into the players card pile and is prompted once again what
they want, hence the while and if else loops. It returns null if there are
no more cards to deal which is dealt with in the game class. If the player 
does play a card down, then the card is returned and removed from the users
hand pile. The draw method just makes printing out the string easier.
displayHand and handtoString are both large strings that use a for loop to
move through the cards within the users hand and prints them out as a giant
string. getHand just returns the players array of cards. 

Game

The Game class has the Game, play, intro, checkplaySuit, checkcompSuit, 
isValid, endGame, and computerTurn methods. The Game method first
initializes all the instant variables, and then gets the first faceup card
from the deck class and gets the suit of that card using the card class. It
then also uses a for loop to add 7 cards into both the computer and players
hand using the deal method in the Deck class. The play method uses a large
while true loop checking if there are still cards to deal, if player still
has cards, and if computer still has cards. If all of these are true, then
it will continue to allow the player to keep playing cards, and thecomputer
to keep playing. It then assigns the card each player played as the faceup
card. After each player goes, it uses an if statement to see if either 
player won by putting down all their cards or if there are no more cards in
the deck(hence the faceup == null statement). If either of these are true
then the endGame method is called. If not true, then the card is then
checked if is an 8. For the player, the checkplaySuit is called, and for 
the computer, the checkcompSuit is called. These methods just use an ifelse
statement to see if the card is an 8 and changes the current suit
accordingly. Ex, for the computer method, is gets the suit of the first
card in the computers hand as the character to be returned to be assigned
as the current suit. For the player check method, it simply asks the user
what they want. 
    As mentioned above, the play method calls the endGame method. The 
endGame method essentially just figures out why the game ended and prints
out the according responses/ determines the winner(hence the if, else if,
else if statement) The first if checks if the player has 0 cards, second
checks if computer has 0 cards (user loses), and then if its null, meaning
the deck ran out of cards. If the deck ran out, then we have to check which
player has the least amount of cards hence the if else statement within\
that. After it prints out the reason for the ending, it asks the player if
they want to play again. This response is what keeps the while loop running
within the CrazyEights class. 
    The last major method is the computerTurn method which first creates a
temporary new card, and then uses a for loop to loop through the computer's
cards to see if any of the cards are valid cards (calls the isValid method)
to be played. If they are valid, then that card is returned as the comps 
turn. If there are no cards within the computers hand, then a new card is
called from the deck and is then individually checked as a valid play, if
its not, (hence the while loop) that card is added to the computers had and
a new card is drawn until there is a valid play. That card is then returned
as the computers turn and deleted from the computers hand. The isValid 
method that's used just checks if the card's suit matches the current suit
(the suit the game is at), if the card's rank matches the rank of the
current rank of the faceup card, and if the card is an 8. If any of these
conditions are met, then true is returned and the card isValid. False is
returned is otherwise. 

