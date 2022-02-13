package pack3;
import javax.script.*;  
import java.io.*;  
public class Nashorn {
	  public static void main(String[] args) throws Exception{  
	        // Creating script engine  
		       ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("Nashorn");  
	        // Reading Nashorn file  
	        scriptEngine.eval(new FileReader("C:\\Users\\NAREN BAGAVATHY\\eclipse-workspace\\HowdyGalaxy\\src\\pack3\\hello.js"));  
	    }  

}


//Java Nashorn
//Nashorn is a JavaScript engine. It is used to execute JavaScript code dynamically at JVM (Java Virtual Machine).
//Java provides a command-line tool jjs which is used to execute JavaScript code.
//
//You can execute JavaScript code by using jjs command-line tool and by embedding into Java source code.
//
//Example: Executing by Using Terminal
//Following is the step by step process to execute JavaScript code at the JVM.
//
//1) Create a file hello.js.
//
//2) Write and save the following code into the file.
//
//var hello = function(){  
//    print("Hello Nashorn");  
//};  
//hello();  
//3) Open terminal
//
//4) Write command jjs hello.js and press enter.
//
//After executing command, you will see the below output.
//
//Example: Executing JavaScript file in Java Code
//You can execute JavaScript file directly from your Java file. In the following code, we are reading a file hello.js with the help of FileReader class.