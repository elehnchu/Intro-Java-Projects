/**
 * This class should run simulations to determine
 * whether or not the Odd-Even game is fair and if
 * not who has the advantage and what is a strategy
 * that will realize that adavantage.
 * 
 *  El Chu
 *  hc3294
 *  Simulation.java
 *  The overall point of this class is to loop through both p1 and p2thresholds
 *  using a nested for loop to determine the optimal threshold. The optimal 
 *  threshold that's the highest of the worst outcomes will only have higher 
 *  values after that therefore we find the highest of the worst values. 
 */

import java.util.Scanner;
public class Simulation{
    /* Uses a nested for loop to first loop through the possible values for p1
     * and within that, loop through the possible threshold values forp2.Within
     * the first loop, it spits out the lowest/ smallest amount. Within the 2nd 
     * loop the highest of the minimum amount is returned. The system then 
     * prints out the required materials needed. 
     * 
    */
    public static void main(String[] args){
        double maxmin = -40000;
        double threshold = 0;
        //for loop that changes the threshold for p1
        for (double i= 0.0; i<1; i+= .02){
            int min = 40000;
            //for loop that changes the threshold for p2
            for (double j = 0.0; j<1; j+= .02){
                Game gameSim = new Game (i, j);
                gameSim.play(100000);
                int tokens = gameSim.getP1Score();
                if (tokens < min){
                    min = tokens; 
                }
            }// end  for loop

            /* if statement to determine the highest of the mins within the
             * p1 threshold possibilites. 
             */
            if (maxmin <min ){
                maxmin = min;
                threshold = i;
            }
            
        } // end for loop
        double average = maxmin/100000;
        System.out.println("The average is " + average);
        System.out.println("The maximum min is " + maxmin);
        System.out.println("The optimal threshold is " + threshold);

    }
}// end class