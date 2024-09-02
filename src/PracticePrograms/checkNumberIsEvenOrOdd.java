package PracticePrograms;

import java.util.Scanner;

public class checkNumberIsEvenOrOdd {

	public static void main(String[] args) {

		// Create a Scanner object to get input from the user
		Scanner sc = new Scanner(System.in);

		// Ask the user to enter a number
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		// Check if the number is even or odd
		if (num % 2 == 0) {

			// If the number is divisible by 2 with no remainder, it is even
			System.out.println("The given number is even");
		} else {
			// If the number is not divisible by 2 with no remainder, it is odd
			System.out.println("The given number is odd");
		}

		// Close the scanner to free up resources
		sc.close();
	}

}
