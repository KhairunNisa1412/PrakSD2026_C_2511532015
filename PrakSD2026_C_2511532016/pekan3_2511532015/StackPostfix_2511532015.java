package pekan3_2511532015;

import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2511532015 {
	public static int postfixEvaluate (String expression) {
		Stack<Integer> s_2015 = new Stack<Integer>();
		Scanner input_2015 = new Scanner(expression);
		while(input_2015.hasNext()) {
			if (input_2015.hasNextInt()) {						// an operand (integer0
				s_2015.push(input_2015.nextInt());
			} else { 											// an operator
				String operator_2015 = input_2015.next();
				int operand2_2015 = s_2015.pop();
				int operand1_2015 = s_2015.pop();
				if (operator_2015.equals ("+")) {
					s_2015.push (operand1_2015 + operand2_2015);				
				} else if (operator_2015.equals("-")) {
					s_2015.push(operand1_2015 - operand2_2015);
				} else if (operator_2015.equals("*")) {
					s_2015.push(operand1_2015 * operand2_2015);
				} else {
					s_2015.push(operand1_2015/operand2_2015);
				}
			}
			
		}
		input_2015.close();
		return s_2015.pop();
	}
	public static void main (String[] args) {
		System.out.println ("hasil postfix = "+ postfixEvaluate ("5 2 4 * + 7 -"));
	}
	
}
