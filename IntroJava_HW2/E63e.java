
import java.util.Scanner;
public class E63e{
    
    public static void main(String[] args){
      //get input from the user  
        Scanner input; 
     input = new Scanner (System.in);
     System.out.println ("Please enter a statment to locate vowels: ");
        String vowels = input.nextLine();
     System.out.println("There is a vowel at position: ");

       //set character to a vowel
        char vowel1 = 'a';
        char vowel2 = 'e';
        char vowel3 = 'i';
        char vowel4 = 'o';
        char vowel5 = 'u';
        char vowel6 = 'A';
        char vowel7 = 'E';
        char vowel8 = 'I';
        char vowel9 = 'O';
        char vowel10 = 'U';
        //set loop to match vowels with strring
      for (int i = 0; i<vowels.length(); i++) {
          char character = vowels.charAt(i);
           if (character == vowel1 ||character == vowel2 ||character == vowel3 ||character == vowel4 ||character == vowel5 
            ||character == vowel6 ||character == vowel7 ||character == vowel8 ||character == vowel9 ||character == vowel10 ){

             System.out.print (" "+ i + " ,");
            }

        }

    }
}