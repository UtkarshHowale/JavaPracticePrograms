package PracticePrograms;

import java.util.Scanner;

public class checkNumberIsPrime {

	// A prime number must satisfy two conditions:
	// 1. The number should be greater than 1.
	// 2. It should only be divisible by 1 and itself.

	public static void main(String[] args) {

		// Create a Scanner object to get input from the user
		Scanner sc = new Scanner(System.in);

		// Ask the user to enter the number
		System.out.println("Enter the number: ");
		int num = sc.nextInt();

		// 'count' will track how many numbers can divide 'num' without a remainder
		int count = 0;

		// Check if the number is greater than 1 (Condition 1)
		if (num > 1) {

			// Loop through numbers from 1 to 'num' to check divisibility (Condition 2)
			for (int i = 1; i <= num; i++) {

				// If 'num' is divisible by 'i' (no remainder), increase the count
				if (num % i == 0) {

					count++; // 'count' increases for every divisor of 'num'
				}
			}

			// If the number is divisible by exactly 2 numbers (1 and itself), it's prime
			if (count == 2) {

				System.out.println("Number is prime");
			} else {

				// If divisible by more than 2 numbers, it's not a prime number
				System.out.println("Not a prime number");
			}
		} else {

			// If the number is less than or equal to 1, it is not a prime number
			System.out.println("Not a prime number");
		}

		// Close the scanner to free up resources
		sc.close();
	}
}
