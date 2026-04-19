package pekan3_2511532015;

import java.util.Scanner;
import java.util.Stack;

public class Browser_2511532015 {
	//menampilkan menu
	public static void tampilkanMenu_2511532015() {
		System.out.println ("\n=== Browser History NIM: 2511532015 ===");
		System.out.println("1. Kunjungi Website (Push)");
        System.out.println("2. Tombol Back (Pop)");
        System.out.println("3. Lihat Halaman Aktif (Peek)");
        System.out.println("4. Cek Status History");
        System.out.println("5. Keluar");
        System.out.print("Pilihan: ");
	}
	//Method push: nambahin website ke tumpukan (1)
	public static void kunjungiWebsite_2511532015(Stack<Website_2511532015> history, Scanner input) {
        System.out.print("Masukkan Judul: ");
        String judulInput = input.nextLine();
        System.out.print("Masukkan URL: ");
        String urlInput = input.nextLine();
        
        history.push(new Website_2511532015(judulInput, urlInput));
        System.out.println("Berhasil mengunjungi halaman!");
    }
	//Method pop: hapus elemen teratas buat tombol back (2)
	public static void tombolBack_2511532015(Stack<Website_2511532015> history) {
        if (history.isEmpty()) {
            System.out.println("History kosong");
        } else {
            Website_2511532015 halamanKeluar = history.pop();
            System.out.println("Kembali dari halaman:");
            System.out.println(halamanKeluar); 
        }
    }
	//Method peek: lihat halaman yang aktif (3)
	 public static void lihatHalamanAktif_2511532015(Stack<Website_2511532015> history) {
		 if (history.isEmpty()) {
			 System.out.println("Tidak ada halaman yang sedang aktif dibuka.");
	     } else {
	    	 System.out.println("Halaman Aktif Saat Ini:");
	         System.out.println(history.peek());
	     }
	 }
	 //Method untuk cek status history
	 public static void cekStatusHistory_2511532015 (Stack<Website_2511532015> history) {
		 if (history.isEmpty()) {
			 System.out.println ("History kosong");
		 } else {
			 System.out.println ("Status history: "+ history.size()+" halaman");
		 }
	 }
	 
	 public static void main (String[] args) {
		 Stack<Website_2511532015> history = new Stack<>();
		 Scanner input = new Scanner (System.in);
		 int pilihan;
		 
		 do {
			 tampilkanMenu_2511532015();
			 pilihan = input.nextInt();
			 input.nextLine();
			 
			 switch (pilihan) {
			 case 1:
				 kunjungiWebsite_2511532015(history, input);
                 break;
			 case 2:
                 tombolBack_2511532015(history);
                 break;
             case 3:
                 lihatHalamanAktif_2511532015(history);
                 break;
             case 4:
                 cekStatusHistory_2511532015(history);
                 break;
             case 5:
                 System.out.println("\nTerima kasih telah menggunakan Browser History");
                 break;
             default:
                 System.out.println("Pilihan tidak valid, silakan coba lagi!");
			 }
		 } while (pilihan != 5);
		 input.close();
	 }
}
