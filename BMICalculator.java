/*
 * This program prompts the user to enter their weight in pounds and their height in feet, 
 * converts these values to kilograms and meters respectively, and calulates their Body Mass Index
 */

import java.util.*;
  
public class BMICalculator {

    public static void main(String[] args) {
		
	Scanner myObj = new Scanner(System.in);
	
	System.out.println("Enter your weight in pounds");
	
	double weightKg = myObj.nextDouble() * 0.453592; //1 pound = 0.453592 kilograms
		
	System.out.println("Enter your height in feet");
		
        double heightMeters = myObj.nextDouble() * 0.3048; //1 foot = 0.3048 meters
		
	double bodyMassIndex = weightKg / Math.pow(heightMeters, 2);

        System.out.println("Your weight in kilograms is " + weightKg);
        System.out.println("Your height in meters is " + heightMeters);
	System.out.println("Your BMI is " + bodyMassIndex);
    }

}
