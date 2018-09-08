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

public class programmingExercises26 {
    public static void main(String [] args) {
        // Multiply the digits in an interger
        // Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number between 0 and 1000: ");
        int numbers = input.nextInt();
        
        // First digit
        int firstDigit = numbers % 10; // Extract the digit less than 10
        int remainingNumber = numbers / 10; // Remove the extracted number
        
        // second digit
        int secondDigit = remainingNumber % 10; // Extract the digit between 10 - 99
        remainingNumber = remainingNumber / 10;  // Remove the extracted number
        
        // thrid digit
        int thirdDigit = remainingNumber % 10; // Extract the digit between 100 - 999
        remainingNumber = remainingNumber / 10; // Remove the extracted number
        
        // fourth digit
        //int fourthDigit = remainingNumber % 10;
        //remainingNumber = remainingNumber / 10;
        
        // sum of all the digits multiplied
        //        hundreds     tens          lessThan10
        int sum = thirdDigit * secondDigit * firstDigit;
        
        System.out.println("The multiplication of all digits in " + numbers + " is " + sum);
                
        
        
               
    }
}
