/*
 * This program prompts the user to enter their weight in pounds and their height in feet, 
 * converts these values to kilograms and meters respectively, and calulates their Body Mass Index
 */

import java.util.*;
  
public class BMICalculator {

    public static void main(String[] args) {
		
	Scanner myObj = new Scanner(System.in);
	
	System.out.println("Enter your weight in pounds");
		
	final double lbsToKg = 0.453592;
	double weightKg = myObj.nextDouble() * lbsToKg; 
		
	System.out.println("Enter your height in feet");
		
	final double ftToM = 0.3048;
       	double heightMeters = myObj.nextDouble() * ftToM; 
		
	double bodyMassIndex = weightKg / Math.pow(heightMeters, 2);

        System.out.println("Your weight converts to " + weightKg + " kilograms");
        System.out.println("Your height converts to " + heightMeters + " meters");
	System.out.println("Your BMI is " + bodyMassIndex);
    }

}
