package mypack;

import java.util.regex.*;

public class RegularExpressions {

	public static void main(String[] args) {
		// Pattern
		String pattern = "[a-z]+"; //[a-z] means any character from a to z. + means one or more.
		// String to check
		String stringtocheck = "There is always a room for improvement";
		// Compile the pattern
		Pattern compilepattern = Pattern.compile(pattern);
		// Match the pattern.Matcher would check against string
		Matcher matchercheckagainststring = compilepattern.matcher(stringtocheck);
		while (matchercheckagainststring.find()) {
			System.out.println("Regular Expression Mattching Pattern is: " + " "
					+ stringtocheck.substring(matchercheckagainststring.start(), matchercheckagainststring.end()));

		}
	}
}

//Regex  is a pattern used for searching and manipulating strings.
//Regex matches the text or fails to match.

//java.util.regex.Pattern
//A compiled representation of a regular expression. 
//A regular expression, specified as a string, must first be compiled into an instance of this class. 
//The resulting pattern can then be used to create a Matcher object that can match arbitrary character sequences against the regular expression.

//Pattern java.util.regex.Pattern.compile(String regex)
//Compiles the given regular expression into a pattern.
//Parameters:regex The expression to be compiled
//Returns:the given regular expression compiled into a pattern
//Throws:PatternSyntaxException - If the expression's syntax is invalid


//String java.lang.String.substring(int beginIndex, int endIndex)

//Returns a string that is a substring of this string. 
//The substring begins at the specified beginIndex and extends to the character at index endIndex - 1. 
//Thus the length of the substring is endIndex-beginIndex. 

//Examples: 

// "hamburger".substring(4, 8) returns "urge"
// "smiles".substring(1, 5) returns "mile"
 
//Parameters:beginIndex the beginning index, inclusive.
//endIndex the ending index, exclusive.
//Returns:the specified substring.
//Throws:IndexOutOfBoundsException - if the beginIndex is negative, or
//endIndex is larger than the length of this String object, or beginIndex is larger than endIndex.