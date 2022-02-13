package packet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterIO {
	public static void main(String[] args) throws IOException {
		FileWriterIO fileWriterIO = new FileWriterIO();
		File hobbiesinfo = new File("C:\\NarenIO\\hobbiesinfo.txt");
		fileWriterIO.filetowrite(hobbiesinfo);

	}

	private void filetowrite(File writetofile) throws IOException {
		FileWriter hobbiesinfowriter = new FileWriter(writetofile);
		hobbiesinfowriter.write("He has been playing football at weekends");
		hobbiesinfowriter.flush();
		hobbiesinfowriter.close();
	}

}
//FileWriterIO is a stream-based IO.It's a character oriented file, which means it has 2 bytes.
//Unlike FileOutputStream class, 
//you don't need to convert string into byte array because it provides method to write string directly.
//FileWriterIO is a class found in java.io.FileWriter package.