/*
 * This program prompts the user to enter a value of distance in meters and
 * converts it into feet.
 */

import java.util.*;

public class ConvertDistance {

    public static void main(String[] args) {
		
	Scanner myObj = new Scanner(System.in);
	
	System.out.println("Enter the value of distance in meters you want to convert");

        double distanceMeters = myObj.nextDouble();

        double distanceFeet;
         
        final double metersToFeet = 0.3048;

        distanceFeet = distanceMeters * metersToFeet;

        System.out.println( distanceMeters + " meters equals " + distanceFeet + " feet");
    }

}
