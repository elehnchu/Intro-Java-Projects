//*************************************
//
//  WordLists.java
//
//  Class to aid with Wordle
//  Programming Project 5, COMS W1004
//
//
//  Your Name: EL CHU
//  Your Uni: Hc3294
//This class has four different methods which are used to filter an arraylist
//depending on the type of words a user wants. lengthN returns a list withwords
//that match the requested length. letterAt returns an list that has a specific
//character at a specific location. notAt returns a list that has a character 
//but not a specific location. notIn returns a list of words that do not have a
//character anywhere in the word. 
//**************************************

import java.util.ArrayList;


public class WordLists{

   //returns words at new array list with length n
    public static ArrayList<String> lengthN(ArrayList<String> words, int n){
      //temporary filtered array to be returned 
      ArrayList<String> lengthN = new ArrayList<String>();
      //catches index out of bounds 
      if (n<0){
         return lengthN;
      }
      //adds word from master array list that equals length of parameter n
      else{
         for (int i=0; i<words.size(); i++){
            //if word in list = inputted user length parameter, word is added
            //to the filtered list
            if (words.get(i).length()==n){
               lengthN.add(words.get(i));
            }
         }
         //new filtered list is returned
         return lengthN;
      }
      
   }//end of method 

   //returns words that have the same letter at a specific position within the 
   //list.
    public static ArrayList<String> letterAt(ArrayList<String> words, 
      char included, int index){
         //temporary filtered array to be returned 
         ArrayList<String> letterAt = new ArrayList<String>();
         //catches index out of bounds 
         if (index < 0){
            return letterAt;
         }
         // loops through each word from the parametrized array list
         for (int i=0; i<words.size(); i++){
            //if the character at the index matches the requested character,
            //then the word is added to the filtered list
            if (words.get(i).charAt(index)==included){
               letterAt.add(words.get(i));
            }
            
         }
         // new filtered list is returned
         return letterAt;
      }//end of method 

   //returns words that have the same requested letter but not at same position
    public static ArrayList<String> notAt(ArrayList<String> words,
      char included, int index){
         //temporary filtered array to be returned 
         ArrayList<String> notAt = new ArrayList<String>();
         //catches index out of bounds 
         if (index < 0){
            return notAt;
         }

         else{
            // loops through each word in the parametrized array list
            for (int i=0; i<words.size(); i++){
               //loops through each character of the words in the arraylist
               for (int j=0; j<words.get(i).length(); j++){
                  //determins if there is the same character requested in the word
                  //but not at the given index
                  if (words.get(i).charAt(j)==included &&
                     words.get(i).charAt(index)!=included){
                     //if yes, then the word is added to the list
                     notAt.add(words.get(i));
                  }
               }
            }
            // new filtered list is returned
            return notAt;
         }
      }//end of method 

 
    public static ArrayList<String> notIn(ArrayList<String> words,
      char included){
         //temporary filtered array to be returned 
         ArrayList<String> notIn = new ArrayList<String>();
         int counter = 0;

         // loops through each word in the array list
         for (int i=0; i<words.size(); i++){
         
            //loops through each character of the words in the arraylist
            for (int j=0; j<words.get(i).length(); j++){

               //determins if there is the included character in the word
               if (words.get(i).charAt(j)!=included){
                  //if not, counter is then incremented to first loop through
                  //the entire word before it is added into the filtered array
                  //list
                  counter ++;
                  //if the length of the word matches the counter then word is
                  //added into the filtered list
                  if (words.get(i).length()==counter){
                     notIn.add(words.get(i));
                  }
               }
            }
            //counter is reset for each new word looped through
            counter = 0;
         }
         // new filtered list is returned
         return notIn;
      }//end of method 

} // end of class








