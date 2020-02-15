/*
 * This program prompts the user for a name in the format lastname, firstname and outputs
 * the name in the format Firstname Lastname.
 */

import java.util.*;
  
public class Name {

    public static void main(String[] args) {
		
	Scanner myObj = new Scanner(System.in);
	
	System.out.println("Enter a name in the format lastname, firstname");
		
	String lastNameIn = myObj.next();
	String firstNameIn = myObj.nextLine();
		
	String lastName = lastNameIn.replaceAll("[\\W]", "");
	String firstName = firstNameIn.replaceAll("[\\W]", "");
	
	String lastNameCap = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
	String firstNameCap = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
		
	System.out.println("The name you have entered is: " + firstNameCap + " " + lastNameCap);
    }

}
