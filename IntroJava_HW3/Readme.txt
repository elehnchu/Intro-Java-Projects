
El Chu
hc3294
Programming Project 3

ComputerPlayer
The computerPlayer class has the methods random, add, subtract, Balance.
The random method first gets an number from math.random which then stores
it as a double and is then compared to with t (t varies depending on the
desired threshold). If that value is greater than t, then esentially, the
computer is going to throw a 2 for the round. The add, subtraction, balance
methods all deal with the overall token balance of the player/object being
used. add obviously adds an amount to the token balance. subtraction, the 
opposite. Balance simply returns the overall token balance. 

Simulation
the Simulation class is essentially playing the game of Odds and Evens but
comparing the token amount of two computer players at each possible threshold
value and determining which threshold value is optimal for player 1. It starts 
with a for loop and then immediately jumps into another for loop, however, the
second for loop is what sequentially goes through all the threshold values of 
p2 before p1 is increased in the other for loop. It initializes the game method
with a parameter including the number of games being played (100000). It then 
gets the score of the first player (computer 1) and determines if it's smaller 
than theprevious score from when p2 was a different threshold. If true, then 
the new score(tokens)replaces the current min. Once the for loop for the p2 
threshold changes finishes, the highest of the minimum values (maxmin) is 
determined by figuring out whether the old min is greater than the maxmin. 
If true, then the min replaces the current maxmin. Once the for loop for 
p1 threshold changes finishes, the threshold associated with the absolute 
maxmin is declared. After all the for loops, the system prints out the
average token score after one round, the maximum min value, and its 
threshold. It outputs the highest of the mins because because it is the 
highest/max at that threshold, that token amount is the lowest possible 
amount for p1 so every other game played at that threshold can and will 
be higher. 
    When running the Simulation in terminal, I got an average of 0.04899 for 
the amount of tokens added to p1 score after each round. A maximum min of 
4899.0 (which I explained is relevant above) and an optimum threshold of 
0.580. This means that for p1 to have the advantage, the threshold they 
need to play for determining whether p1 throws in a 1 or 2 is 0.58. 
Because the maximum min is a positive integer, p1 should always have 
the advantage because they are getting points (the .048 for average) 
every round.If the maximum min was negative, then p2 would have the advantage
because p1 has the chance to lose points as well.

Game
The Game class is of course, the longest of the the three classes, and due 
to the usage of many helper methods, the code is easily readable by other 
users. For the Odd Even game, it asks the user what player they want to bem
and if odd,the playOdd method will play else, the playEven method will play.
They are different in terms of how to user will will win once the round sum
is calculated, how points are added to the computer player, and then how that
affects the current and total score.After the end of each while loop for 
playOdd and playEven, the total scores is printed. It is not necessary to
calculate the users total score because the user just has the opposite in
terms of + or - of the computer balance, hence the multiplying of a -1 in
totalScores. For the Simulation, the method play with a parameter is called. 
This method takes in the number of games wished to play (ie 100000) and uses
a for loop to play each and every game, calculating the token balance for p1 
and p2. The Game class also has the methods getP1Score and getP2Score to
return the token balances ofplayer 1 and 2 to the SimTest.