package pekan6_2511532015;

import java.util.Scanner;

public class Musik_2511532015 {
	private static Lagu_2511532015 tail_2015 = null;
	//method menambahkan lagu baru di akhir playlist (insertEnd)
	public static Lagu_2511532015 tambahLagu_2015 (Lagu_2511532015 head_2015, Lagu_2511532015 laguBaru) {
		//jika list kosong, lagu baru langsung jadi head
		if (head_2015 == null) {
			head_2015 = laguBaru;
			tail_2015 = laguBaru;
		} else { //jika list ada isinya
			Lagu_2511532015 curr_2015 = head_2015;
			while (curr_2015.next_2015 != null) {
				System.out.println ("Judul: "+ curr_2015.getJudul_2015());
				System.out.println ("Penyanyi: "+ curr_2015.getPenyanyi_2015());
				System.out.println ("Lagu berhasil ditambahkan");
				curr_2015 = curr_2015.next_2015;
			}
			curr_2015.next_2015 = laguBaru; //node terakhir next ke lagu baru
			laguBaru.prev_2015 = curr_2015; //lagu baru prev ke node terakhir
			laguBaru.next_2015 = null; //next lagu baru null karena paling akhir
			tail_2015 = laguBaru;
		}
		return head_2015;
	}
	
	//method menghapus lagu pertama (head) menggunakan delHead
	public static Lagu_2511532015 hapusLaguAwal_2015 (Lagu_2511532015 head_2015) {
		if (head_2015 == null) {
			tail_2015 = null;
			return null;
		} 
		head_2015 = head_2015.next_2015;
		if (head_2015 != null) {
			head_2015.prev_2015 = null;
		}
		return head_2015;
	}
	
	//method menampilkan semua lagu dari awal ke akhir (forwardTraversal)
	public static void tampilMaju_2015 ( Lagu_2511532015 head_2015) {
		Lagu_2511532015 curr_2015 = head_2015;
		//cek kosong ga
		if (head_2015 == null) {
			System.out.println ("Playlist masih kosong");
			return;
		}
		//tampil maju (loop)
		while (curr_2015 != null) {
			System.out.print (curr_2015.getJudul_2015()+" - " + curr_2015.getPenyanyi_2015() + " <-> ");
			curr_2015 = curr_2015.next_2015;
		}
		System.out.println ();
	}
	//method menampilkan semua lagu dari awal ke akhir (backwardTraversal)
	public static void tampilMundur_2015 (Lagu_2511532015 tail_2015) {
		//mualai dari akhir
		if (tail_2015 == null) {
			System.out.println ("Playlist masih kosong");
			return;
		}
		Lagu_2511532015 curr_2015 = tail_2015;
		while (curr_2015 != null) {
			System.out.print (curr_2015.getJudul_2015()+" - " + curr_2015.getPenyanyi_2015() + " <-> ");
			curr_2015 = curr_2015.prev_2015;
		}
		System.out.println ();
	}
	//method mencari lagu berdasarkan judul (tidak case_sensitive)
	public static Lagu_2511532015 cariLagu_2015 (Lagu_2511532015 head_2015, String judulCari_2015) {
		Lagu_2511532015 curr_2015 = head_2015;
		if (head_2015 == null) {
			System.out.println ("Playlist masih kosong");
			return null;
		}
		//traversal maju dari head
		while (curr_2015 != null) {
			//bandingkan
			if (curr_2015.getJudul_2015().equalsIgnoreCase(judulCari_2015)){
				return curr_2015;
			}
			curr_2015 = curr_2015.next_2015;
		}
		return null;
	}
	//menampilkan menu
	public void tampilkanMenu_2015() {
		System.out.println ("\n=== Playlist Musik NIM: 2511532015 ===\n");
		System.out.println ("1. Tambah lagu");
		System.out.println ("2. Hapus Lagu Pertama");
		System.out.println ("3. Lihat Playlist (maju)");
		System.out.println ("4. Lihat Playlist (mundur)");
		System.out.println ("5. Cari Lagu");
		System.out.println ("6. Keluar");
	}
	//main method
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Lagu_2511532015 head_2015 = null; //nyimpan variable head playlist
		int pilih;
		do {
			Musik_2511532015 musik = new Musik_2511532015();
			musik.tampilkanMenu_2015();
			System.out.print("Pilih menu (1-6): ");
			pilih = input.nextInt();
			input.nextLine();
			System.out.println();
			
			switch (pilih) {
			case 1:
				System.out.print ("Judul: ");
				String judul_2015 = input.nextLine();
				System.out.print ("Penyanyi: ");
				String penyanyi_2015 = input.nextLine();
				
				Lagu_2511532015 laguBaru = new Lagu_2511532015 (judul_2015, penyanyi_2015);
				head_2015 = tambahLagu_2015(head_2015, laguBaru);
				tail_2015 = laguBaru;
	            System.out.println(" Lagu berhasil ditambahkan\n");
	            break;
	            
			case 2:
				head_2015 = hapusLaguAwal_2015 (head_2015);
				System.out.println ("Lagu pertama dihapus");
				break;
				
			case 3:
				System.out.print ("Playlist (maju): ");
				tampilMaju_2015(head_2015);
				System.out.println ();
				break;
				
			case 4:
				System.out.print("Playlist (Mundur): ");
                tampilMundur_2015(tail_2015);
                System.out.println();
                break;
				
			case 5: 
				System.out.print ("Cari judul lagu: ");
				String cari_2015 = input.nextLine();
				Lagu_2511532015 hasil = cariLagu_2015 (head_2015, cari_2015);
				if (hasil != null) {
					System.out.println ("Lagu ditemukan: "+ hasil.getJudul_2015()+ " - "+ hasil.getPenyanyi_2015()+"\n");
				} else {
					System.out.println ("Lagu tidak ada di playlist");
				} break;
				
			case 6:
				System.out.println ("Keluar dari program, terima kasih");
				break;
				
			default:
				System.out.println ("Pilihan tidak valid");
			}
		}
		while (pilih != 6);
		input.close();
	}
}
