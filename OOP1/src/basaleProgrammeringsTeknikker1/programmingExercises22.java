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
//area = ((Math.sqrt(3)) / 4) * Math.pow(leagthOfSides, 2);
import java.util.Scanner;

public class programmingExercises22 {
    public static void main(String [] args) {
        // Compute the volume of a triangle
        // declaring variables
        double area, volume, lengthOfSides;
        
        Scanner input = new Scanner(System.in);
        // input of lenght
        System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
        lengthOfSides = input.nextDouble();
        
        // calculate the area and print out
        area = ((Math.sqrt(3)) / 4) * Math.pow(lengthOfSides, 2);
        
        System.out.println("The area is " + area);
        
        // Calculate the volume and print out
        volume = area * lengthOfSides;
        System.out.println("The volume of the Triangular prism is " + volume);
    }
}
