/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basaleProgrammeringsTeknikker1;

/**
 *
 * @author AleksanderSTUD
 */

// Imports scanner
import java.util.Scanner;

public class programmingExercises21 {
    public static void main(String [] args) {
        //Convert mile to kilometers¨
        
        // Declaring variables
        double mile, mileToKiloMeter;
        // Constant value
        final double KILOMETER = 1.6;
        
        // Scanner 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter miles: ");
        mile = input.nextDouble();
        
        // Calcualation of miles to kilometers
        mileToKiloMeter = mile * KILOMETER;
        System.out.println(mile + " miles is " + mileToKiloMeter + " kilometers ");
       
    }
}
