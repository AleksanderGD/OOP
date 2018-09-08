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

public class programmingExercises27 {
    public static void main(String [] args) {
        // Find the number of years
        // scanner which can be used
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int min = 1000000000;
        
        int minOfYear = 365 * 24 * 60; // minutes of a year
        int year = min / minOfYear; // dividing min with 365*24*60 outputs years
        int days = min % minOfYear; // getting current days
        days /= 24 * 60; // obtaining total days
        int hours = min / days; // Getting current hours
        hours %= 24; // obtaining total hours
        
        
        System.out.println(min + " minutes is approximately " + year + " years and " + days + " days " + hours + " hours ");
    }
}
