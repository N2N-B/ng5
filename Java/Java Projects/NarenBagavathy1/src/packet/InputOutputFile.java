package packet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutputFile {
	public static void main(String[] args) throws FileNotFoundException {
		File nareninfo = new File("C:\\NarenIO\\narenInfo.txt");
		InputOutputFile inputOutputFile = new InputOutputFile();
		inputOutputFile.filetowrite(nareninfo);
		File narencarrerinfo = new File("C:\\NarenIO\\NarencarrerInfo.txt");
		inputOutputFile.readfile(narencarrerinfo);

	}

//Generic way or general way to code a input and output file; Code can be reused if the method is declared outside the main method. 
	public void filetowrite(File writetofile) {
		PrintWriter narenInfoWriter = null;
		try {
			narenInfoWriter = new PrintWriter(writetofile);
			narenInfoWriter.println("The name is naren bagavathy");
			narenInfoWriter.println("007");

		} catch (FileNotFoundException e) {
			System.out.println("File was not found on the local disk " + writetofile.getName());
			throw new RuntimeException(e);
		} finally {
			narenInfoWriter.close();
		}
	}

	// Generic way or general way to code a input and output file; Code can be
	// reused if the method is declared outside the main method.

	public void readfile(File readfromfile) throws FileNotFoundException {
		Scanner nareninforeader = new Scanner(readfromfile);
		while (nareninforeader.hasNext()) {
			System.out.println("Read from the input file" + " " + nareninforeader.nextLine());
		}
		nareninforeader.close();
	}
}
//The PrintWriter class of the java.io package can be used to write output data in a commonly readable form (text).
//It extends the abstract class Writer

//Scanner is a class in java. util package used for obtaining the input of the primitive types 
//such as int, double, etc. and strings.

//Java Scanner hasNext() Method
//The hasNext() is a method of Java Scanner class which returns true if this scanner has another token in its input. There are three different types of Java Scanner hasNext() method which can be differentiated depending on its parameter. These are:

//Java Scanner hasNext () Method
//Java Scanner hasNext (String pattern) Method
//Java Scanner hasNext(Pattern pattern) Method
//1.Java Scanner hasNext () Method:
//It is a Scanner class method which returns true if this scanner has another token in its input. This method may block while waiting for input to scan.

//2.Java Scanner hasNext (String pattern) Method:
//It is a Scanner class method which returns true if the next token matches the pattern constructed from the specified string.

//3.Java Scanner hasNext (Pattern pattern) Method:
//It is a Scanner class method which returns true if the next complete token matches the specified pattern.

//nextLine() Scanner
//Advances this scanner past the current line and returns the input that was skipped. 
//This method returns the rest of the current line, excluding any line separator at the end. The position is set to the beginning of the next line. 
//Since this method continues to search through the input looking for a line separator, it may buffer all of the input searching for the line to skip if no line separators are present.
//Returns:the line that was skipped Throws:NoSuchElementException - if no line was foundIllegalStateException - if this scanner is closed


//FileNotFoundException is a compile time exception or checked exception, which is handled by try and catch(checked exception passed to catch block) block,
// , which handles the exception as RuntimeException in filetowrite() method.




//getName() -> File Class
//Returns the name of the file or directory denoted by this abstract pathname. 
//This is just the last name in the pathname's name sequence. If the pathname's name sequence is empty, then the empty string is returned.
//Returns:The name of the file or directory denoted by this abstract pathname, or the empty string if this pathname's name sequence is empty

////Java File Class. The File class is an abstract representation of file and directory pathname. A pathname can be either absolute or relative.