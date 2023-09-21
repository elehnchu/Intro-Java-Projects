// El Chu hc3294

import java.util.Scanner;
public class E63a{

    public static void main(String[] args){
        
         //get strring from user
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter an input word: ");
            String input = in.nextLine();

         //loop and find what is asked for
            for(int i=0;i<input.length();i++){

                //compare values to ascii numbers chart 
                int asciiOfChar = (int)input.charAt(i);

                if(asciiOfChar>=65 && asciiOfChar<=90) {
                  System.out.println("Uppercase letter(s): " + input.charAt(i));
                }

            }

        }

    }
 