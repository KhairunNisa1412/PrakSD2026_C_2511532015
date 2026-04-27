package pekan4_2511532015;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511532015 {

	public static void main(String[] args) {
		Queue<Integer> q_2015 = new LinkedList<Integer>();
		q_2015.add(1);
		q_2015.add(2);
		q_2015.add(3); // [1, 2, 3]
		System.out.println ("Sebelum reverse = " + q_2015);
		Stack<Integer> s = new Stack<Integer>();
		while (!q_2015.isEmpty()){ // Q -> S
			s.push (q_2015.remove());
		}
		while (!s.isEmpty()) { // S -> Q
			q_2015.add(s.pop());
		}
		System.out.println ("Sesudah reverse = " + q_2015); // [3, 2, 1]

	}

}
