//
//  WordTest.java
//
//  Class to test WordLists
//  Programming Project 5, COMS W1004
//
//
//  Your Name: EL CHU
//  Your Uni: Hc3294
//This class is primarily used to test all the methods within the WordList
//class by inputted a word list and outputting the filtered word list in
//another file. It also trys to catch user errors such as a file not being
//found 
//**************************************

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class WordTest{

    public static void main(String[] args) {
        //try catch method used to catch exceptions
        try {
            File inFile = new File("wordlist.txt");
            Scanner input = new Scanner(inFile);
            String word;
            ArrayList<String> master = new ArrayList<String>();
            //adds words from new file into master arraylist
            while(input.hasNext()){

              word=input.nextLine();
              master.add(word);

            }
            //makes the dictionary words to a max length of 4
            ArrayList<String> myList= WordLists.lengthN(master,4);
            //calls methods in WordLists to filter master arraylist
            myList=WordLists.letterAt(myList,'j',0);
            myList=WordLists.notAt(myList,'v',1);
            myList=WordLists.notIn(myList,'e');
            myList=WordLists.notIn(myList,'i');
            
            //prints out the words of new filtered list in new file
            PrintWriter output = new PrintWriter("out.txt");
            for (int i = 0; i <myList.size(); i++){
                output.println(myList.get(i));
            }
            
            output.close();
        }// end try
        //catches incorrect file name or wrong file input
        catch(IOException e){
            System.out.println("Please try with correct input file name");

        }
        //primarily used to catch an illegal argument exception when user
        //tries to pass an illegal argument through a method
        catch(Exception e){
            System.out.println(e);
        }
        
    }

}// end class