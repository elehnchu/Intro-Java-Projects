/**
 * This program accepts a series of positive intergers
 * and reports their average
 * 
 * @author: <your name here>
 * @date: <the date here>
 */
import java.util.Scanner;
public class Average{
    
    public static void main(String[] args){
        int sum = 0; 

        int totalInputs = 0; 

        //loop
        while (sum>=0 ){//get number from user
            Scanner input = new Scanner(System.in);

            System.out.println("Please enter a number to be averaged: ");

            int value = input.nextInt();

            //calculate into average
            sum = sum + value;

            totalInputs = totalInputs + 1;

            int Average = sum / totalInputs;

            System.out.println("The average is "+ Average);

            //ask user if they want to add an another number to the average



        }

        
        
    }
}
 