/*
 * This is a comment block.
 */
 
 import java.util.*;
 
 public class Review {
	 
	 public static void main (String [] args){
		 
		 Scanner inputOne = new Scanner(System.in); //Make scanner
		 
		 System.out.println("Enter a number");
		 double firstNum = inputOne.nextDouble();
		 
		 System.out.printf("The sqaure of " +  firstNum + " is %.0f\n", (Math.pow(firstNum,2)));  //Print formatting
		 System.out.printf("The sqaure root of " + firstNum + " is %.2f\n", (Math.sqrt(firstNum))); //Mathematic operations
		 
		 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 
		 Random randomNum = new Random(); //Get random number
		 int secondNum = randomNum.nextInt(10); //Always include how many numbers there are to pick from
		 System.out.println("This is your random number: " + secondNum);
		 
		 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		 
		 Scanner inputTwo = new Scanner(System.in); //Remember to make a new scanner and number the inputs 
		 
		 System.out.println("Enter a URL");
		 String inURL = inputTwo.nextLine();
		 String url = inURL.trim(); //Trim whitespace
		 
		 int length = url.length(); //Length of a string 
		 System.out.println("Verifying an URL with " + length + " characters...");
		 
		 if (url.startsWith("https://")){ //Verify if a string starts with certain characters
			System.out.println("Is this a valid and secure URL? true.");
		} else {
			System.out.println("Is this a valid and secure URL? false.");
		}
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Scanner inputThree = new Scanner(System.in);
		
		System.out.println("Are you over the age of 18?");
		String age = inputThree.nextLine();
		
		if (age.equals("yes")) { //Verify if string corresponds to an exact answer
			System.out.println("You are not a minor");
		} else {
			System.out.println("You are a minor");
		}			
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		Scanner inputFour = new Scanner(System.in);
	
		System.out.println("Enter a name in the format lastname, firstname");
		
		String lastNameIn = inputFour.next(); //Gets next word
		String firstNameIn = inputFour.nextLine(); //Gets REST of the line
		
		String lastName = lastNameIn.replaceAll("[\\W]", ""); //Ignores symbols, in this case the comma 
		String firstName = firstNameIn.replaceAll("[\\W]", "");
		
		String lastNameCap = lastName.substring(0, 1).toUpperCase() + lastName.substring(1); //Makes the first letter capitalized 
		String firstNameCap = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
		
		System.out.println("The name you have entered is: " + firstNameCap + " " + lastNameCap);
	 }
 }