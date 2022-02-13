package packet;

//import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
	public static void main(String[] args) throws IOException {
		FileInputStreamExample fileInputStreamExample = new FileInputStreamExample();
		fileInputStreamExample.filetoread("C:\\NarenIO\\hobbiesinfo.txt");
	}

	private void filetoread(String readfile) throws IOException {
		FileInputStream fileinputStream = new FileInputStream(readfile);
		int integerreadfromfile;
		while ((integerreadfromfile = fileinputStream.read())!= -1) {
			System.out.println("Character read from the file: " +(char)integerreadfromfile);
		}
		fileinputStream.close();
	}
}

//A FileInputStream obtains input bytes from a file in a file system. 
//What files are available depends on the host environment. 

//FileInputStream is meant for reading streams of raw bytes such as image data. 
//For reading streams of characters, consider using FileReader.
////A file input stream is a class found in java.io package.


//Java File Class. The File class is an abstract representation of file and directory pathname. A pathname can be either absolute or relative.