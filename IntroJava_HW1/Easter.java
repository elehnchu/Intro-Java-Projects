/**
 * This program implements the algorithm created by Fredrich Gauss 
 * for determining the date of Easter
 * 
 * @author: <your name here>
 * @date: <the date here>
 */

import java.util.Scanner;

public class Easter{
  
    public static void main(String[] args){

        //Ask user for input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int y = input.nextInt();

        //step 2
        int a = y%19;

        //step 3
        int b = y/100;
        int c = y%100;

        //step 4
        int d = b/4;
        int e = b%4;
        
        //step 5
        int g = (8* b + 13)/25;

        //step 6
        int h = (19* a+b-d-g+15)%30;

        //step 7
        int j = c/4;
        int k = c%4;

        //step 8
        int m = (a+11* h)/319;

        //step 9
        int r = (2* e+2* j-k-h+m+32)%7;

        //step 10
        int n = (h-m+r+90)/25;

        //step 11
        int p = (h-m+r+n+19)%32;

        // output
        System.out.println("Easter in "+y+" is/was on "+n+" (the month)/ "+p+" (the day)");


    }





}	
