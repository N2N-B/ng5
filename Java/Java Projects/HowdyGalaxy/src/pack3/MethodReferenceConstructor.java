package pack3;

interface Messageable {
	Message getMessage(String msg);
}

class Message {
	Message(String msg) {
		System.out.print(msg);
	}
}

public class MethodReferenceConstructor {

	public static void main(String[] args) {
		Messageable hello = Message::new;
		hello.getMessage("Hello");
	}

}

//3) Reference to a Constructor
//You can refer a constructor by using the new keyword. 
//Here, we are referring constructor with the help of functional interface.
//
//Syntax
//
//ClassName::new  
