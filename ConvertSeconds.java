/*
 * This program prompts the user for an amount of seconds and displays the time in the format
 * minutes:seconds.
 */

import java.util.*;
  
public class ConvertSeconds {

    public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
	
		System.out.println("Enter an amount of seconds");
		
		int secondsInput = myObj.nextInt();
		
		int minutesOutput = secondsInput / 60;
		int secondsOutput = secondsInput % 60;
		
		System.out.println(secondsInput + " seconds in minutes:seconds format is " + minutesOutput + ":" + secondsOutput );
	}

}
