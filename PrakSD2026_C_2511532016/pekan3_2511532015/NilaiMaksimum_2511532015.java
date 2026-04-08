package pekan3_2511532015;

import java.util.Stack;

public class NilaiMaksimum_2511532015 {
	public static int max (Stack<Integer> s_2015) {
		Stack<Integer> backup_2015 = new Stack<Integer>();
		int maxValue_2015 = s_2015.pop();
		backup_2015.push(maxValue_2015);
		while (!s_2015.isEmpty()) {
			int next_2015 = s_2015.pop();
			backup_2015.push(next_2015);
			maxValue_2015 = Math.max(maxValue_2015, next_2015);
		}
		while (!backup_2015.isEmpty()) {
			s_2015.push(backup_2015.pop());
		}
		return maxValue_2015;
	}
	public static void main (String[] args) {
		Stack<Integer> s_2015 = new Stack<Integer>();
		s_2015.push(70);
		s_2015.push(12);
		s_2015.push(20);
		System.out.println ("Isi stack "+ s_2015);
		System.out.println ("Stack Teratas "+ s_2015.peek());
		System.out.println ("Nilai Maksimum "+max(s_2015));
	}

}
