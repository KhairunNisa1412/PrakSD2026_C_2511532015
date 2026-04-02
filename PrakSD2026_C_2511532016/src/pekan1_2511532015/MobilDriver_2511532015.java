package pekan1_2511532015;

import java.util.Scanner;

public class MobilDriver_2511532015 {

	public static void main(String[] args) {
		System.out.println("=== Program ADT Mobil ===");
		//tambah mobil
		Mobil_2511532015 m1 = new Mobil_2511532015 ("Civic", 2019, 1500, 250000000, "Honda");
		Mobil_2511532015 m2 = new Mobil_2511532015 ("Pajero", 2021, 2400, 500000000, "Mitsubishi");
		Mobil_2511532015 m3 = new Mobil_2511532015 ("Brio", 2022, 1200, 180000000, "Honda");
		
		System.out.println ("<<< Menambahkan mobil >>>");
		Mobil_2511532015.tambahMobil(m1);
		Mobil_2511532015.tambahMobil(m2);
		Mobil_2511532015.tambahMobil(m3);
		Mobil_2511532015.tampilkanSemuaMobil();
		
		//hapus mobil
		System.out.println ("<<< Hapus Mobil >>>");
		System.out.println ("Hapus mobil ke-2");
		Mobil_2511532015.hapusMobil("Pajero");
		Mobil_2511532015.tampilkanSemuaMobil();
		
		
		//uji coba melalui implementasi kelas mobil sistem dealer mobil
		Scanner input = new Scanner (System.in);
		boolean jalan = true;
		while (jalan) {
			System.out.println ("\n=== Simulasi Dealer ===");
			int stok = Mobil_2511532015.getJumlahMobil();
			int max = Mobil_2511532015.getKapasitasGarasi();
			System.out.println("Stok: " + stok + "/" + max + " mobil");
			System.out.println ("1. Lihat stok mobil");
			System.out.println ("2. Mobil baru datang (tambah stok)");
			System.out.println ("3. Pelanggan membeli mobil (Hapus stok)");
			System.out.println ("4. Keluar: ");
			System.out.println ("Pilih menu: ");
			int pilih = input.nextInt();
			input.nextLine();
			
			if (pilih <1 || pilih >4) {
				System.out.println ("Piliha tidak valis");
				continue;
			}
			
			if (pilih == 1) {
				System.out.println ("Stok Mobil Tersedia");
				Mobil_2511532015.tampilkanSemuaMobil();
			} else if (pilih ==2) {
				System.out.println ("\nStok mobil baru datang");
				//minta input untuk memasukkan data mobil
				System.out.print ("Nama Mobil: ");
				String nama= input.nextLine();
				System.out.print("Tahun: ");
				int tahun= input.nextInt();
				System.out.print("CC: ");
				int cc= input.nextInt();
				System.out.print("Harga: ");
				int harga= input.nextInt();
				input.nextLine();
				System.out.print("Merek: ");
				String merek= input.nextLine();
				
				Mobil_2511532015 mobilBaru = new Mobil_2511532015(nama, tahun, cc, harga, merek);
				boolean berhasil = Mobil_2511532015.tambahMobil(mobilBaru);
			    
			    if (berhasil) {
			        System.out.println("Mobil berhasil masuk gudang!");
			    } else {
			        System.out.println("Gagal masuk gudang (mungkin penuh).");
			    }
				
			} else if (pilih == 3) {
				//pelanggan membeli mobil, hapus stok
				System.out.println ("\nHapus mobil karena dibeli");
				System.out.print("Mobil apa yang dibeli: ");
				String namaBeli= input.nextLine();
				Mobil_2511532015.hapusMobil(namaBeli);
			} else if (pilih == 4) {
				jalan = false;
				System.out.println ("Terima kasih");
			}
			
		}
	}
}
