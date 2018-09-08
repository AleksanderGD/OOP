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
import java.util.Scanner; // Imports scanner, which is the java.util.package

public class opgavea1otherway {
    public static void main(String [] args) {
        // Declaring variables
        double radius, area;
        // final double is a constant value as this might be used more than one time
        final double PI = 3.14159;
        
        // Creating scanner object
        Scanner input = new Scanner(System.in);
        
        //Prompts the user to enter a variable
        System.out.print("Enter a number for radius: ");
        radius = input.nextDouble();
        
        // Applying the rule for finding the area of a circle
        area = radius * radius * PI;
        System.out.println("The area of the circle is: " + area);
        
    }
}
