package PracticePrograms;

import java.util.Scanner;

public class areaOfCircle {

	// The formula to find the area of a circle is π * r * r
	// π (pi) is about 3.14159
	// 'r' represents the radius of the circle

	public static void main(String[] args) {

		// Define the value of pi
		final double pi = 3.14159;

		// Create a Scanner object to get input from the user
		Scanner sc = new Scanner(System.in);

		// Ask the user to enter the radius of the circle
		System.out.println("Enter value of radius: ");
		double radius = sc.nextDouble(); // Read the radius input from the user

		// Calculate the area of the circle using the formula
		double Area = pi * radius * radius;

		// Show the result to the user
		System.out.println("Area of circle based on given radius is: " + Area);

		// Close the scanner to free up resources
		sc.close();

	}

}
