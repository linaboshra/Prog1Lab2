/*
 * This program prompts the user for the temperature in Celsius in the past 3 days and output the
 * average temperature.

 */

import java.util.*;
  
public class AverageTemp {

    public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
	
		System.out.println("Enter the temperature in Celsius of the first day");
	
		double firstTemp = myObj.nextDouble();
		
		System.out.println("Enter the temperature in Celsius of the second day");
	
		double secondTemp = myObj.nextDouble();
		
		System.out.println("Enter the temperature in Celsius of the third day");
		
		double thirdTemp = myObj.nextDouble();
		
		double averageTemp = ( firstTemp + secondTemp + thirdTemp ) / 3;
		
		System.out.println("The average temperature is " + averageTemp + " degrees Celsius");
    }

}
