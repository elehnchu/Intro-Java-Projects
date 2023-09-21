import java.util.Scanner;
public class E63c{
    
    public static void main(String[] args){
        
            //get string from user

            Scanner in = new Scanner(System.in);
            System.out.println("Please enter an input word: ");
            String input = in.nextLine();
            
            System.out.println("Every vowel replaced by an underscore: ");
            //loop for vowels
            for (int i=0; i<input.length(); i++){
                int asciiOfChar = (int) input.charAt(i);

                if(asciiOfChar==65 || asciiOfChar==69 || asciiOfChar==73 ||asciiOfChar==79 ||asciiOfChar==85
                   ||asciiOfChar==65+32 || asciiOfChar==69+32 || asciiOfChar==73+32 ||asciiOfChar==79+32 ||asciiOfChar==85+32 ){
                    //replace with underscore

                    System.out.print("_");
                   }
                //else past normal text
                else {
                    System.out.print(input.charAt(i));
                }
            }
  
        }

        
        
    }