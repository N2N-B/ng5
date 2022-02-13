package completejava;

public class PrintLastCharacterString {

	// Function to print the last character
	// of each word in the given string
	static void printLastChar(String string) {

		// Now, last word is also followed by a space
		string = string + " ";

		for (int i = 1; i < string.length(); i++) {

			// If current character is a space
			if (string.charAt(i) == ' ')

				// Then previous character must be
				// the last character of some word
				System.out.print(string.charAt(i - 1) + " ");

		}
	}

	public static void main(String[] args) {
		String string = "I wanna be in a different league";
		printLastChar(string);
	}
}
