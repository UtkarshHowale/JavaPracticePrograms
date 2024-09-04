package PracticePrograms;

import java.util.Scanner;

public class areaOfRectAngle {

	public static void main(String[] args) {

		// Create a Scanner object to read input from the user
		Scanner sc = new Scanner(System.in);

		// Ask the user to enter the value of length
		System.out.println("Enter the value of length: ");
		double lenght = sc.nextDouble();

		// Ask the user to enter the value of width
		System.out.println("Enter the value of width: ");
		double width = sc.nextDouble();

		// Calculate the area of the rectangle (right angle)
		double areaOfRectAngle = lenght * width;

		// Display the calculated area to the use
		System.out.println("Area of rigth angle is: " + areaOfRectAngle);

		// Close the scanner to free up resources
		sc.close();
	}
}
