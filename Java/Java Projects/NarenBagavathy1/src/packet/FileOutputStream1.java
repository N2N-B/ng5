package packet;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream1 fileOutputStream1 = new FileOutputStream1();
		fileOutputStream1.filetowrite(new File("C:\\NarenIO\\messages.txt"));

	}

	private void filetowrite(File file) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		fileOutputStream.write("Happy Diwali Folks" .getBytes());
		fileOutputStream.close();

}
}

//A file output stream is an output stream for writing data to a File.
//FileOutputStream is meant for writing streams of raw bytes such as image data.
//For writing streams of characters, consider using FileWriter.
//A file output stream is a class found in java.io package.


//Java File Class. The File class is an abstract representation of file and directory pathname. A pathname can be either absolute or relative.