package pekan2_2511532015;

import java.util.Scanner;
import java.util.ArrayList;

public class Playlist_2511532015 {
	//Menampilkan menu
	public static void tampilkanMenu() {
		System.out.println ("\n"+"=== Playlist Musik NIM: 2511532015 ===");
		System.out.println ("1. Tambah Lagu");
		System.out.println ("2. Lihat Playlist ");
		System.out.println ("3. Hapus Lagu");
		System.out.println ("4. Cek Kapasitas Lagu: ");
		System.out.println ("5. Keluar");
	}
	//Method untuk menambahkan lagu (1)
	public static void tambahLagu_2511532015(ArrayList<Musik_2511532015> list, Scanner input) {
		System.out.print ("Masukkan Judul: ");
		String judulLagu_2015= input.nextLine();
		System.out.print ("Masukkan Penyanyi: ");
		String penyanyi_2015= input.nextLine();
		System.out.print ("Masukkan Durasi (detik): ");
		int durasi_2015= input.nextInt();
		list.add(new Musik_2511532015(judulLagu_2015, penyanyi_2015, durasi_2015));
		System.out.println ("Data berhasil ditambahkan");
	}
	//Method untuk lihar playlist (2)
	public static void tampilkanPlaylist_2511532015 (ArrayList<Musik_2511532015> list) {
		if (list.isEmpty()) {
			System.out.println ("Daftar playlist kosong");
		} else {
			System.out.println ("Daftar Playlist: ");
			for (Musik_2511532015 musik : list) {
				System.out.println (musik);
			}
		}
	}
	//Method untuk hapus lagu (3)
	public static void hapusLagu_2511532015 (ArrayList<Musik_2511532015> list, Scanner input) {
		System.out.print ("Masukkan judul lagu yang akan dihapus: ");
		String judulLaguHapus= input.nextLine();
		boolean removed= list.removeIf(musik -> musik.getJudulLagu_2015().equals(judulLaguHapus));
		
		if (removed) {
			System.out.println ("Data dengan judul "+ judulLaguHapus+" berhasil dihapus");
		} else {
			System.out.println ("Judul Lagu tidak ditemukan");
		}
	}
	//Method untuk cek kapasitas (4)
	public static void cekKapasitas_2511532015 (ArrayList<Musik_2511532015> list) {
		int totalLagu = list.size();
		
		if (totalLagu == 0) {
			System.out.println ("Playlist masih kosong");
		} else {
			System.out.println ("Total lagu tersimpan: "+ totalLagu+" lagu");
		}
	}
	
	public static void main (String[] args) {
		ArrayList<Musik_2511532015> musikList = new ArrayList<>();
		Scanner input = new Scanner (System.in);
		int pilihan;
		
		do {
			tampilkanMenu();
			System.out.print ("Pilihan: ");
			pilihan = input.nextInt();
			input.nextLine();
			
			switch (pilihan) {
			case 1:
				tambahLagu_2511532015(musikList, input);
				break;
			case 2:
				tampilkanPlaylist_2511532015 (musikList);
				break;
			case 3:
				hapusLagu_2511532015 (musikList, input);
				break;
			case 4:
				cekKapasitas_2511532015 (musikList);
				break;
			case 5:
				System.out.println ("Keluar dari program.");
				break;
			default:
				System.out.println ("Pilihan tidak valid.");
			}
		} while (pilihan != 5);
		input.close();
	}
	
}
