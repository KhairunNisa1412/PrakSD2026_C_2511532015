package pekan7_2511532015;

import java.util.Scanner;

public class tugasAlproPekan7_2511532015 {

	public static void main(String[] args) {
		System.out.println ("===== REGISTRASI AKUN BARU =====");
		Scanner input = new Scanner (System.in);
		System.out.print("Msukkan Username: ");
		String a= input.nextLine();
		System.out.print("Masukkan Password: ");
		String b= input.nextLine();
		System.out.print ("Masukkan Email: ");
		String c= input.nextLine();
		System.out.print ("Masukkan PIN (6 digit): ");
		int d= input.nextInt();
		Akun x= new Akun();
		x.setUsername(a);
		x.setPassword(b);
		x.setEmail(c);
		
		//validasi password dan email
		if (x.isEmailValid() && x.isPasswordValid()) {
			System.out.println ("\n--- REGISTRASI BERHASIL ---");
			System.out.println ("Akun Untuk \""+ a +"\" telah berhasil dibuat.");
			System.out.println ();
			System.out.println ("--- Detail Akun ---");
			System.out.println ("Username (Lowercase): "+ a.toLowerCase());
			System.out.println ("Email (Uppercase): "+ c.toUpperCase());
			System.out.println ("ID Pengguna (Gabungan): "+ a.concat(String.valueOf(d)));
			
			//uji tipe data
			System.out.println ("\n--- Uji Tipe Data (PIN Anda: "+d+")");
			System.out.println ("PIN (int) + 10: "+ (d+10));
			System.out.println ("PIN (String) + \"10\": "+ d+ "10");
			input.close();
			
		//jika email atau password tidak sesuai
		} else {
			System.out.println ("\n--- REGISTRASI GAGAL ---");
			if (!x.isEmailValid()) {
				System.out.println ("Email anda "+c+ " tidak valid (harus mengandung '@' dan '.').");
			}
			if (!x.isPasswordValid()) {
				System.out.println("Password minimal 8 karakter.");
			}
			System.out.println ("Silahkan coba lagi.");
		
		}

	}

}
