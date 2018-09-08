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
public class programmingExercises223 {
    public static void main(String [] args) {
        
        double drivingDistance = 900.5;
        System.out.println("Driving distance: " + drivingDistance);
        
        double milesPerGallon = 25.5;
        System.out.println("Miles per gallon: " + milesPerGallon);
        
        double pricePerGallon = 3.55;
        System.out.println("Price per gallon: " + pricePerGallon);
        
        System.out.println("The cost of driving is $" + (drivingDistance / milesPerGallon) * pricePerGallon);
        
        
    }
}
