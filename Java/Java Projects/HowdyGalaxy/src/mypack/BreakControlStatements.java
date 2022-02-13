package mypack;

public class BreakControlStatements {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			if (i == 6) {
				break;
			}
		}

		// continue statement example with labeled for loop
			a: for (int k = 0; k <= 1; k++) {
				b: for (int l = 0; l <= 1; l++) {
					System.out.println(k);
					if (l == 1) {
						continue a;
					}
				}
			

		}
	}
}

//Jump Statements
//Jump statements transfer the execution control to the other part of the program. 
//  There are two types of jump statements in Java, i.e., break and continue.

//Java break statement
//As the name suggests, the break statement is used to break the current flow of the program 
//and transfer the control to the next statement outside a loop or switch statement.
//However, it breaks only the inner loop in the case of the nested loop.

//The continue statement is used in loop control structure when you need to jump to the next iteration of the loop 
//immediately. It can be used with for loop or while loop.
