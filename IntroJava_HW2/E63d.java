import java.util.Scanner;
public class E63d{
    
    public static void main(String[] args){
        
            //get string from user

            Scanner in = new Scanner(System.in);

            System.out.println("Please enter an input word: ");

            String input = in.nextLine();
            

            //vowel counter 
            int vowelCounter = 0;
            //loop for vowels
            for (int i=0; i<input.length(); i++){

                int asciiOfChar = (int) input.charAt(i);

                if(asciiOfChar==65 || asciiOfChar==69 || asciiOfChar==73 ||asciiOfChar==79 ||asciiOfChar==85
                   ||asciiOfChar==65+32 || asciiOfChar==69+32 || asciiOfChar==73+32 ||asciiOfChar==79+32 ||asciiOfChar==85+32 ){
                       
                    //add to vowel counter
                    vowelCounter++;
                   }
              
            }
            System.out.println("Number of vowels: " + vowelCounter);


        }

        
        
    }