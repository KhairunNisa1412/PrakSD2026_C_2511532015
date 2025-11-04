package pekan6_2511532015;
import java.util.Scanner;
import java.util.Random;
public class GamePenjumlahan_2511532015 {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		Random rand = new Random ();
		//play util user gets 3 wrong
		int points = 0;
		int wrong = 0;
		while (wrong < 3) {
			int result = play(console, rand); //play once game
			if (result > 0) {
				points++;
			} else {
				wrong++;
				
			}
		}
		System.out.println ("You earned " + points + " total points.");
		
	}
	//membuat soal penjumlahan dan ditampilkan ke user
	public static int play (Scanner console, Random rand) {
		//print the operands being added, and sum them
		int operands = rand.nextInt (4) + 2;
		int sum = rand.nextInt (10) + 1;
		System.out.print(sum);
		for (int i =2; i <= operands; i++) {
			int n = rand.nextInt (10) +1;
			sum += n;
			System.out.print(" + " + n);
		}
		System.out.print (" = ");
		
		//rend user's guess and report wheter it was correct
		int guess = console.nextInt ();
		if (guess == sum) {
			return 1;
		} else {
			System.out.println ("Wrong! The answer was "+ sum);
			return 0;
		}
	}

}
