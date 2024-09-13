package PracticePrograms;

import java.util.Scanner;

public class checkStringIsPalindrome {

	public static void main(String[] args) {
		
		// Create a Scanner to read input from the user
		Scanner sc = new Scanner(System.in);
		
		// Ask the user to enter a string
		System.out.println("Enter String Name:");
		
		// Get the string the user typed
		String actualString = sc.nextLine();
		
		// Create a StringBuffer with the input string
		StringBuffer stringBuffer = new StringBuffer(actualString);
		
		// Reverse the string
		StringBuffer reversedString = stringBuffer.reverse();
		
		// Check if the reversed string is the same as the original
		// Convert the reversed StringBuffer back to a String for comparison
        // StringBuffer does not override equals method, so we need to use toString() 
        // to get the string value for a proper comparison
		if(reversedString.toString().equals(actualString)) {
			
			// If they are the same, the string is a palindrome
			System.out.println("String is palindrome");
		}
		else {
			
			// If they are different, the string is not a palindrome
			System.out.println("String is not a palindrome");
		}
		
		// Close the Scanner to free up resources
		sc.close();
	}
}
