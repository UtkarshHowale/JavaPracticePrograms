package PracticePrograms;

import java.util.Scanner;

public class simpleCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Show the menu of options to the user
		System.out.println("Simple Calculator...!");
		System.out.println("Choose the opration:");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");

		// Ask the user to choose an operation
		System.out.println("Enter your choice (1-4): ");
		int choice = sc.nextInt();

		// Ask the user to enter two numbers
		System.out.println("Enter first number: ");
		double num1 = sc.nextDouble();

		System.out.println("Enter second number: ");
		double num2 = sc.nextDouble();

		// This will hold the result of the calculation
		double result = 0;

		// This will check if the input is valid
		boolean valid = true;

		// Perform the calculation based on the user's choice
		switch (choice) {

		case 1:

			result = num1 + num2;
			break;

		case 2:

			result = num1 - num2;
			break;
		case 3:

			result = num1 * num2;
			break;
		case 4:

			if (num2 != 0) {

				result = num1 / num2;

			} else {

				System.out.println("Error: Division by zero is not allowed...!");
				valid = false; // Set to false if division by zero
				break;
			}
			break;
		default:

			System.out.println("Invalid choice..!");
			valid = false; // Set to false if choice is invalid
			break;
		}

		// Show the result if the choice is valid
		if (valid) {

			System.out.println("Result: " + result);
		}

		// Close the scanner
		sc.close();

	}

}
