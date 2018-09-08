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
public class opgavea2 {
    public static void main(String [] args) {
        // Declaring variables
        double radiusOfCircleOne, radiusOfCircleTwo, radiusOfCircleThree, radiusOfCircleFour, circuitOne, circuitTwo, sum, pi;
        pi = 3.14159;
        
        // Declaring the radius of 3 for both circles
        radiusOfCircleOne = 3;
        radiusOfCircleTwo = 3;
        
        // applying the rule of circuit calculation of a circle
        
        circuitOne = 2 * radiusOfCircleOne * pi;
        circuitTwo = 2 * radiusOfCircleTwo * pi;
        sum = circuitOne + circuitTwo;
        System.out.println("The circuit of one of the circles is " + circuitOne + " therefore the sum of both circles are " + sum);
        
        // Declaring the radius of 7 for both circles
        radiusOfCircleThree = 7;
        radiusOfCircleFour = 7;
        
        // applying the rule of circuit calculation of a circle
        
        circuitOne = 2 * radiusOfCircleThree * pi;
        circuitTwo = 2 * radiusOfCircleFour * pi;
        sum = circuitOne + circuitTwo;
        System.out.println("The circuit of one of the circles is " + circuitOne + " therefore the sum of both circles are " + sum);
    }
}
