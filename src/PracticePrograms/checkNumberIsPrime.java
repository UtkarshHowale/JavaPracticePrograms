package PracticePrograms;

import java.util.Scanner;

public class checkNumberIsPrime {

	public static void main(String[] args) {

		// Create a Scanner object to get input from the user
		Scanner sc = new Scanner(System.in);

		// Ask the user to enter a number
		System.out.println("Enter a number: ");
		double num = sc.nextDouble();

		// Calculate the square root of the number using Math.sqrt method
		double squareRoot = Math.sqrt(num);

		// Display the result
		System.out.println("The square root of " + num + "is: " + squareRoot);

		// Close the scanner to free up resources
		sc.close();

	}
}
