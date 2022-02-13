package mypack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionBoundaryCheck {
	public static void main(String[] args) {

		String stringtocheck1 = "All is well that ends well.";

		// Match all the words "well"
		Pattern compilepattern1 = Pattern.compile("\\bwell\\b"); //This pattern is used to search the word "well" in the given String(To verify any character is present at word boundary or not) 
		Matcher matchercheckagainststring1 = compilepattern1.matcher(stringtocheck1);
		while (matchercheckagainststring1.find()) {
			System.out.println("Pattern matches: " + matchercheckagainststring1.group() + " " + "at" + " "
					+ matchercheckagainststring1.start());

		}
	}

}
