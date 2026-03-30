package tugas_2511532015;

import java.util.Scanner;

public class PenjumlahanBilanganGanjil {

	public static int jumlahbilganjil (int n) {
		int jumlah = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				jumlah += i;
			}
		}
		return jumlah;

	}
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print ("Masukkan nilai n: ");
		int n = input.nextInt();
		int hasil= jumlahbilganjil(n);
		System.out.println ("Jumlah bilangan ganjil dari 1 hingga "+ n +" adalah: "+ hasil);
		input.close ();
	}

}
