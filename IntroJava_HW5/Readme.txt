

El Chu
hc3294
Programming Project 5

WordList 

    lengthN
This method first checks to see if the index the user inputted for int n is out
of bounds (a negative value). If it is, then an empty array is returned. If
index is in bounds, a for loop is used to loop through the parameter array
list that the user wants loop through. If the word length matches the 
parameter int n, then the word is added into a filtered list. Afer all the
words are sorted through, the filtered list is returned.
    letterAt
This method first checks to see if the index the user inputted for int n is out
of bounds (a negative value).If it is, then an empty array is returned. If not,
then a for loop is used to look through the parameter array list. If the word's
character at the specified index matches the character the user wants (char
included), then that word is added to the filtered array list. The list is then
returned. 
    notAt
This method uses an if else statement like the previous two methods to checking
if the index is out of bounds. If it's not, then an iterated for loop is used
to first loop through each word in the array list, and then each character in
the word. If the character in the word matches the requested character (char
included), and the requested character is not at the specified index(int index)
then the word is added to the new filtered array list and returned. 
    notIn
This method has to loop through each character within a word to see if the
requested character (char included) is not in the word. I used an iterated for
loop like in the notAt method to loop through each word and character. I then 
use an if statement to check if the a character does not match the requested
character (char included), and then increase the counter. I included a counter
because the code has to loop through the entire word to see if the character
and requested charcter do not match before the word is added to the list. After
the entire word is looped through (which is done by words.get(i).length()==
counter) then the word is added to the filtered array list. 

WordTest

This class is primarily used to set up and tests the methods within the
WordLists class and try and catch user errors. Within try, I create a new file
and scan it. The while loop goes through the words within the scanned file and
while it has a next value, that value (word in this instance) is added into the
master array list which is going to be passed as the array list parameter for
the methods in WordLists. The array list myList is used as a temporary filtered
list that is used by the PrintWriter to paste the words into a new file (called
out.txt in this instance). The for loop in line 45 prints all the words in the
array list in the new file. The two catches at the end are used to catch errors
in inputted files (IOException), as well as any potential larger 
exceptions (Exception) such as RunTime exceptions, Illegal argument exceptions,
Index out bounds exceptions, along with many more. It's honestly just like a 
safety net to catch anything just in case.
