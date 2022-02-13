package mypack;
import java.io.*;  
public class FileNotFoundExceptionCheckedException {
	 public static void main(String args[]) {  
	        FileInputStream file_data = null;  
	        file_data = new FileInputStream("C:/Users/ajeet/OneDrive/Desktop/Hello.txt");  //FileNotFoundException that is checked exception is thrown by FileInputStream (File file ) constructor.
	        int m;  
	        while(( m = file_data.read() ) != -1) {  ////IOException that is checked exception is thrown by read() method of FileInputStream.
	            System.out.print((char)m);  
	        }  
	        file_data.close();  ////IOException that is checked exception is thrown by close() method of FileInputStream.
	    }  

}
