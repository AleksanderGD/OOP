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

import java.util.Scanner;

public class opgavea2otherway {
    public static void main(String [] args) {
        // Declaring variables
        double radius, circuit;
        final double PI = 3.14159;
        // Scanner declared
        Scanner input = new Scanner(System.in);
        // Radius prompt for user
        System.out.print("Enter the radius to calculate the circuit of the circle: ");
        radius = input.nextDouble();
        
        //Circuit rule 
        circuit = 2 * radius * PI;
        
        System.out.println("The circuit of the circle is " + circuit + " when the radius is " + radius);
    }
}
