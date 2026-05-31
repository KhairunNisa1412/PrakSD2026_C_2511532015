package pekan8_2511532015;

import java.util.Scanner;

public class Sorting_2511532015 {
	private Lagu_2511532015[] dataLagu_2015 = new Lagu_2511532015[20];
	private int jumlahData_2015 = 0;
	
	//method untuk input data
	public void inputData_2015() {
		Scanner input = new Scanner (System.in);
		System.out.println("=== Masukkan Data Lagu (Minimal 7) ===\n");
		for (int i_2015 = 0; i_2015 < 7; i_2015++) {
			System.out.print("Masukkan judul lagu: ");
			String judul_2015 = input.nextLine();
			System.out.print("Masukkan nama penyanyi: ");
			String penyanyi_2015 = input.nextLine();
			System.out.print("Masukkan durasi (detik): ");
			int durasi_2015 = input.nextInt();
			input.nextLine();
			System.out.println();
			dataLagu_2015[i_2015] = new Lagu_2511532015(judul_2015, penyanyi_2015, durasi_2015);
			jumlahData_2015++;
		}
	}
	//method pilih algoritma
	public void pilihAlgoritma_2015() {
		Scanner input = new Scanner (System.in);
	    System.out.println("========================================");
		System.out.print("Pilih Algortima (1=Shell, 2=Quick, 3=Merge): ");
		int pilihAlgoritma = input.nextInt();
	}
	//method algoritma (merge sort) : membagi array menjadi dua bagian)
	public void mergeSort_2015(int left, int right) {
		if (left < right) {
			int mid_2015 = left + (right - left)/2;
			mergeSort_2015(left, mid_2015);
			mergeSort_2015(mid_2015 + 1, right);
			merge_2015 (left, mid_2015, right);
		}
	}
	//penggabungan
	private void merge_2015(int left, int mid, int right) {
		int n1_2015 = mid - left + 1;
		int n2_2015 = right - mid;
		
		Lagu_2511532015[] L_2015 = new Lagu_2511532015 [n1_2015];
		Lagu_2511532015[] R_2015 = new Lagu_2511532015 [n2_2015];
		for (int i_2015 = 0; i_2015 < n1_2015; i_2015++) {
			L_2015[i_2015] = dataLagu_2015 [left + i_2015];
		}
		for (int j_2015 = 0; j_2015 < n2_2015; j_2015++){
			R_2015[j_2015] = dataLagu_2015 [mid + 1 + j_2015];
		}
		int i_2015 = 0, j_2015 = 0, k_2015 = left;
		while (i_2015 < n1_2015 && j_2015 < n2_2015) {
			if (L_2015[i_2015].getJudul_2015().compareTo(R_2015[j_2015].getJudul_2015()) <= 0) {
				dataLagu_2015[k_2015] = L_2015[i_2015];
				i_2015++;
			} else {
				dataLagu_2015[k_2015] = R_2015[j_2015];
				j_2015++;
			}
			k_2015++;
		}
		while (i_2015 < n1_2015) {
			dataLagu_2015[k_2015] = L_2015[i_2015];
			i_2015++;
			k_2015++;
		}
		while (j_2015 < n2_2015) {
			dataLagu_2015[k_2015] = R_2015[j_2015];
			j_2015++;
			k_2015++;
		}
	}
	//method tampil data
	public void tampilData_2015(String ket) {
		System.out.println(ket);
        for (int i_2015 = 0; i_2015 < jumlahData_2015; i_2015++) {
        	if (dataLagu_2015[i_2015] != null) {
        		System.out.println((i_2015 + 1) + ". " + 
                        dataLagu_2015[i_2015].getJudul_2015() + " - " + 
                        dataLagu_2015[i_2015].getDurasi_2015() + " detik");
        	}
        }
        System.out.println();
	}
	public static void main(String[] args) {
		Sorting_2511532015 go_2015 = new Sorting_2511532015();
		System.out.println("=== Sorting Playlist NIM: 2511532015 ===");
		go_2015.inputData_2015(); 
		go_2015.pilihAlgoritma_2015();
		go_2015.tampilData_2015("\nData Sebelum Sorting:");
		go_2015.mergeSort_2015(0,  go_2015.jumlahData_2015 - 1);
		go_2015.tampilData_2015("\nData Setelah Merge Sort (Judul A-Z):");
	}
}
