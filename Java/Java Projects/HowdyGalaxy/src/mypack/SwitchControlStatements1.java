package mypack;

public class SwitchControlStatements1 {

	public static void main(String[] args) {
		int num = 2;
		switch (num) {
		case 0:
			System.out.println("number is 0");
			break;
		case 1:
			System.out.println("number is 1");
			break;
		default:
			System.out.println(num);
		}
	}

}

////Switch Statement:
////In Java, Switch statements are similar to if-else-if statements. 
//The switch statement contains multiple blocks of code called cases and a single case is executed 
//based on the variable which is being switched. 
//The switch statement is easier to use instead of if-else-if statements. 
//It also enhances the readability of the program.

//The syntax to use the switch statement is given below.
//
//switch (expression){  
//    case value1:  
//     statement1;  
//     break;  
//    .  
//    .  
//    .  
//    case valueN:  
//     statementN;  
//     break;  
//    default:  
//     default statement;  
//}  