/*
 * This program prompts the user to enter a value of Canadian dollars and
 * converts it to United States dollars and Euros.
 */

import java.util.*;
  
public class ConvertMoney {

    public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
	
		System.out.println("Enter the value of Canadian dollars you want to convert");
	
		double valueCAD = myObj.nextDouble();

        double valueUSD, valueEUR;
         
        valueUSD = valueCAD * 0.76;
        valueEUR = valueCAD * 0.68;

        System.out.println(+ valueCAD + " Canadian dollars convert to "+ valueUSD + " United State dollars");
        System.out.println(+ valueCAD + " Canadian dollars convert to "+ valueEUR + " Euros");
    }

}
