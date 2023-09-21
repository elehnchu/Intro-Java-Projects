import java.util.Scanner;
public class E63b{
    
    public static void main(String[] args){
        
            //get strring from user

            Scanner in = new Scanner(System.in);
            System.out.println("Please enter an input word: ");
            String input = in.nextLine();

            //loop and output the character every +2 of string
            System.out.println("Every second letter of the string are: ");
        
            for(int i=0; i<input.length(); i+=2){

                System.out.print(input.charAt(i) + " ");
            }

        }

    }
 