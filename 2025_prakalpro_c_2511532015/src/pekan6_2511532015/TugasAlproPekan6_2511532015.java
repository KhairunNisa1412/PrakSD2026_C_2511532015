package pekan6_2511532015;

import java.util.Scanner;
import java.util.Random;

public class TugasAlproPekan6_2511532015 {

	public static void main(String[] args) {
		Random rand = new Random();
		int tries = 0;
		int sum = 0;
		String jawab;
		boolean running = true;
		boolean menang = false;

		while (sum != 7 && running) {
			//roll the dice once
			int dadu1 = rand.nextInt (6) + 1;
			int dadu2 = rand.nextInt (6) + 1;
			sum = dadu1 + dadu2;
			System.out.println (dadu1 + " + " + dadu2 + " = " + sum);
			tries++;
			
			if (sum != 7) {
				System.out.println ("Tebakan Anda Salah");
				System.out.print("Apakah mau lempar dadu (ya/tidak) ");
				Scanner scan = new Scanner (System.in);
				jawab = scan.nextLine();
				if (jawab.equalsIgnoreCase ("tidak")) {
					running = false;
		        } 

		    } else {
		    	System.out.println ("Anda menang setelah " +  tries  + " percobaan!");
		    	menang = true;
    	    }

	    } if (!menang) {
	    	System.out.println ("Anda Gagal Menang");
	    }
		
    }

}
	


