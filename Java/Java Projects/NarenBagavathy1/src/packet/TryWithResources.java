package packet;

import java.io.FileOutputStream;

public class TryWithResources {
	public static void main(String args[]) {
		// Using try-with-resources
		try (FileOutputStream fileOutputStream = new FileOutputStream("C:\\NarenIO\\abc.txt")) {
			String msg = "Welcome to javaTpoint!";
			byte byteArray[] = msg.getBytes(); // converting string into byte array
			fileOutputStream.write(byteArray);
			System.out.println("Message written to file successfuly!");
		}

		catch (Exception exception) {
			System.out.println(exception);
		}
		finally {
			System.out.println("Finally block executed");
			
		}
	}
}


//The try-with-resources statement
//In Java, the try-with-resources statement is a try statement that declares one or more resources. 
//The resource is as an object that must be closed after finishing the program.
//The try-with-resources statement ensures that each resource is closed at the end of the statement execution.

//The above example writes a string into a file. It uses an instance of FileOutputStream to write data into the file. 
//FileOutputStream is a resource that must be closed after the program is finished with it. 
//So, in this example, closing of resource is done by try itself.