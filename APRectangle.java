/*
 * This program prompts the user to enter the dimensions of a rectangle and
 * calculates its perimeter and area.
 */

import java.util.*;

public class APRectangle {

    public static void main(String[] args) {
		
	Scanner myObj = new Scanner(System.in);
	
	System.out.println("Enter the length of the rectangle");

        double length = myObj.nextDouble();
		
	System.out.println("Enter the width of the rectangle");
		
        double width = myObj.nextDouble();

        double area, perimeter;

        area = length * width;
        perimeter = (2*length) + (2*width);

        System.out.println("The area of this rectangle is " + area);
        System.out.println("The perimeter of this rectangle is " + perimeter);
    }

}
