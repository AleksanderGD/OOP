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
public class opgavea3 {
    public static void main(String [] args) {
        // Declaring variables
        double monday, tuesday, wednesday, thursday, friday, saturday, sunday;
        final String DEGREE  = "\u00b0";
        // Giving the variables values, temperature values 
        monday = 21.5;
        tuesday = 23.7;
        wednesday = 19.6;
        thursday = 22.5;
        friday = 25.3;
        saturday = 21.7;
        sunday = 18.9;
        // Showing to the user what the temperatures of the week days are
        System.out.println("The temperature of the weeks days are ");
        System.out.println("Monday: " + monday + DEGREE);
        System.out.println("Tuesday: " + tuesday + DEGREE);
        System.out.println("Wedensday: " + wednesday + DEGREE);
        System.out.println("Thursday: " + thursday + DEGREE);
        System.out.println("Friday: " + friday + DEGREE);
        System.out.println("Saturday: " + saturday + DEGREE);
        System.out.println("Sunday: " + sunday + DEGREE);
        
        //Adding spaces to seperate the two parts of the code
        System.out.println();
        System.out.println();
        
        // Temperature difference
        System.out.println("The temperature difference:");
        System.out.println("Temperature difference between Tuesday and Monday is " + (tuesday - monday) + DEGREE);
        System.out.println("Temperature difference between Wednesday and Tuesday is " + (wednesday - tuesday)+ DEGREE);
        System.out.println("Temperature difference between Thursday and Wednesday is " + (thursday - wednesday) + DEGREE);
        System.out.println("Temperature difference between Friday and Thursday is " + (friday - thursday) + DEGREE);
        System.out.println("Temperature difference between Saturday and Friday is " + (saturday - friday) + DEGREE);
        System.out.println("Temperature difference between Sunday and Saturday is " + (sunday - saturday) + DEGREE);
    }
}
