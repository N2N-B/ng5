package mypack;

public class ContinueControlStatements {
	public static void main(String[] args) {

	

			for (int j = 0; j <= 2; j++) {
				System.out.println(j);

				if (j == 1) {
					continue;
				}
			}
		
	}

}

//Java continue statement
//Unlike break statement, the continue statement doesn't break the loop, whereas, it skips the specific part of the
//loop and jumps to the next iteration of the loop immediately.