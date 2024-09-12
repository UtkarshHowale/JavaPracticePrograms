package PracticePrograms;

public class ReverseString {

	// Original string to be reversed
	String actualString = "ABCD";

	// Variable to hold the reversed string
	String reverseString = "";

	public static void main(String[] args) {

		ReverseString reverseLogics = new ReverseString();

		// Execute reverse string using string concatenation method
		reverseLogics.reverseStringUsingConcatenation();
		
		// Execute reverse string using character array
		reverseLogics.reverseStringUsingCharacterArray();
		
		// Execute reverse string using string buffer method
		reverseLogics.reverseStringUsingStringBufferMethod();
	}

	// 1) Reverse string using string concatenation method
	public void reverseStringUsingConcatenation() {

		// Step 1: Get the length of the original string
		int stringLength = actualString.length();

		// Step 2: Loop through the string in reverse order
		// Start from the last character (index stringLength - 1) and go backwards until
		// the first character (index 0)
		for (int i = stringLength - 1; i >= 0; i--) {

			// Step 3: Concatenate each character to build the reversed string
			// The 'charAt(i)' method gets the character at the current index 'i'
			// We keep adding each character from the end to the 'reverseString' variable
			reverseString = reverseString + actualString.charAt(i);
		}

		// Print the reversed string
		System.out.println("Reversed string using string concatination method: " + reverseString);
	}

	// 2) Reverse string using character array
	public void reverseStringUsingCharacterArray() {

		// Step 1: Convert the string into a character array
		// We use the 'toCharArray()' method which converts the string into an array of
		// characters
		// Each character from the string will be stored in the 'array[]' array
		char arry[] = actualString.toCharArray();

		// Step 2: Get the length of the original string using array
		int stringLength = arry.length;

		// Step 3: Loop through the string backwards
		// We start from the last character of the string (index stringLength - 1)
		// The loop runs until we reach the first character (index 0)
		// Each iteration picks one character from the end and appends it to
		// 'reverseString'
		for (int i = stringLength - 1; i >= 0; i--) {

			reverseString = reverseString + arry[i];
		}

		// Print the reversed string
		System.out.println("Reversed string using character array method: " + reverseString);
	}

	// 3) Reverse string using string buffer method
	public void reverseStringUsingStringBufferMethod() {

		// Step 1: Create a StringBuffer object with the original string
	    // StringBuffer allows us to change the string easily.
		StringBuffer stringBuffer = new StringBuffer(actualString);
		
		// Step 2: Use the reverse() method to reverse the string
	    // The reverse() method reverses the characters in one step.
		System.out.println("Reversed string using string buffer method: " + stringBuffer.reverse());
	}

}
