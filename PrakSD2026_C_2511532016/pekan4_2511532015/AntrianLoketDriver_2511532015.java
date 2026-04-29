package pekan4_2511532015;

import java.util.Scanner;

public class AntrianLoketDriver_2511532015 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		AntrianLoket_2511532015 antrian = new AntrianLoket_2511532015(100);
		int pilih;
		
		do {
			System.out.println ("\n=== PROGRAM ANTRIAN LOKET ===");
			System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            input.nextLine(); 
            
            switch (pilih) {
            case 1:
                System.out.print("Masukkan nama pelanggan: ");
                antrian.enqueue_2015(input.nextLine());
                System.out.println ("Data berhasil ditambahkan ke antrian");
                break;
            case 2:
                String terlayani = antrian.dequeue_2015();
                if (terlayani != null) System.out.println(terlayani + " telah dilayani");
                break;
            case 3:
                System.out.println ("Isi antrian:");
                antrian.display_2015();
                break;
            case 4:
            	System.out.println ("Isi antrian:");
                antrian.reverse_2015();
                antrian.display_2015(); 
                break;
            case 5:
                System.out.println("Program selesai. Terima kasih!");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
		}
	} while (pilih != 5);
		input.close();
		
}
}
