El Chu
hc3294
Programming Project 2


E6.3a
I first just created a scanner and println section to get input from the user 
for the word they wanted to get the uppercase letters for. I then used a for loop
to loop through the string checking with the ascii chart if any of the characters in the
string matched the uppercase letters which is conviently between 65 & 90. 
If a match was found, the letters would be printed out as shown online 20.

E6.3b
I started the beginning the same as part a for the scanner in terms of user input,
however, instead the for loop being i++, I changed it to i+=2 because it needs to skip
every two letter within the string. The results would then be printed out.

E6.3c
This one was a little harder to figure out or I guess more time consuming because I had to list all
the ascii numbered vowels both lower and uppercase. I used the website pasted below 
to figure out what ascii code correlates with the correct vowel symbols. 
https://www.ascii-code.com/
I included a for loop to loop through the user input string as demonstrated on 
line 15 then declared and set the integer asciiOfChar to equal the string character. 
If the string chracter matched the ascii code, it would be replaced with an underscore.
other character that didn't match the ascii code would be printed as is as 
demonstrated by the else statement on line 24.

E6.3d
Everything is pretty much the same as I did in part c in terms of a scanner, 
the for loop, the integer statement, and the if statement for a character 
matching to the ascii code chart. The only difference really is that instead of the 
system only printing out an underscore, a found match will add to a counter as 
demonstrated in line 26, and then the number of vowels would be printed.

E6.3e
This one was slightly different from the rest because I first tried using an 
array/list and if a watch were to be found using the same for loop and if statement
I used for part c and d, the position would be added to the list, however 
I couldn't get it to work so I just created chars for all the vowels and if a match was found
between the inputted string characters and the declared char characters, then the 
position would be returned as demonstrated on line 30.

CreditCard
I first declared the variables necessary, card number being self explainatory, 
validCard being a boolean expression to return to the CreditCard tester if simply 
valid or not, and then the error code to return as what type of error. I then created the
six credit card checks using if statements doing the opposite of what was asked by the checks.
If the if statements were true, then validCard = false and gave errorCode an integer depending
on where the error was for the check. I then returned the results of the valid card and error code
so the tester knows whether to output valid or invalid number.