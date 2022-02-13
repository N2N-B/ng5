package mypack;

public class CallByValue {
// Method Using Wrapper Class Integer
	public Integer sum(Integer arg1, Integer arg2) {
		Integer result = arg1 + arg2;
		return result;
	}

	 void change(int data){  
		 data=data+100;//changes will be in the local variable only 
			System.out.println("Result of addition " + data);

		 }  
		     
	public static void main(String[] args) {
		AddTwoNumbers add = new AddTwoNumbers();
		int arg1 = 10;
		int arg2 = 30;
		System.out.println("Before passing the value " + arg1);
		Integer result = add.sum(arg1, arg2);
		System.out.println("After passing the value " + arg1);
		System.out.println("Result of addition " + result);
		
		CallByValue callByValue = new CallByValue();
		callByValue.change(500);

	}
}

//Call by Value and Call by Reference in Java
//Invoking a method by passing a value is known as call by value.

