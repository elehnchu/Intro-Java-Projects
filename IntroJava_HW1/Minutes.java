/**
 * This program converts a number of days and weeks into the
 * equivalent number of minutes
 * //asks a user for a number of days and weeks and computes the equivalent number of minutes.
 * @author: <El Chu>
 * @date: <2/6/2022>
 */

import java.util.Scanner;
public class Minutes{
    
    public static void main(String[] args){
        //get input from user
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number of days: ");
        int days = input.nextInt();
        System.out.println("Please enter number of weeks: ");
        int weeks = input.nextInt();

        //do calculations 
        int Minutes; 
        Minutes=(days*1440)+(weeks*10080);
        
        //print out 
        System.out.println("This is the number of minutes: "+ Minutes);
    }
}
 