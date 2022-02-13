package mypack;

public class WhileLoopControlStatements {
	public static void main(String[] args) {
		int i = 0;
		System.out.println("Printing the list of first 10 even numbers \n");
		// Java while loop
		while (i <= 10) {
			System.out.println(i);
			i = i + 2;
		}

		// do-while loop

		int j = 0;
		System.out.println("Printing the list of first 10 even numbers \n");
		do {
			System.out.println(j);
			j = j + 2;
		} while (j <= 10);
	}

}

//Java while loop
//The while loop is also used to iterate over the number of statements multiple times.
//However, if we don't know the number of iterations in advance, it is recommended to use a while loop. 
//Unlike for loop, the initialization and increment/decrement doesn't take place inside the loop statement in while loop.
//It is also known as the entry-controlled loop since the condition is checked at the start of the loop. 
//If the condition is true, then the loop body will be executed; 
//otherwise, the statements after the loop will be executed.

//The syntax of the while loop is given below.

//while(condition){    
////looping statements    
//}    

//The do-while loop checks the condition at the end of the loop after executing the loop statements.
//When the number of iteration is not known and we have to execute the loop at least once, we can use do-while loop.

//It is also known as the exit-controlled loop since the condition is not checked in advance. 

//The syntax of the do-while loop is given below.

//do     
//{    
////statements    
//} while (condition);    