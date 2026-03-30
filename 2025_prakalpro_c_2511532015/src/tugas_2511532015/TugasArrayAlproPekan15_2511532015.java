package tugas_2511532015;

import java.util.Scanner;

public class TugasArrayAlproPekan15_2511532015 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] suhu = new int[7];
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        
        System.out.println("Input suhu selama 7 hari:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Suhu hari " + namaHari[i]+": ");
            suhu[i] = input.nextInt();
        }
        tampilkanData(suhu, namaHari);
        double rataRata = hitungRataRata(suhu);
        System.out.println("\nRata-rata suhu: " + rataRata);
        
        int posisiTerdingin = cariHariTerdingin(suhu);
        System.out.println("Hari terdingin: " + namaHari[posisiTerdingin] + " yaitu "+ suhu[posisiTerdingin]+" derajat C");
        input.close();
    }
    
    public static void tampilkanData(int[] suhu, String[] namaHari) {
        System.out.println("\n--- DATA SUHU HARIAN ---");
        for (int i = 0; i < 7; i++) {
            System.out.println(namaHari[i] + ": " + suhu[i]);
        }
    }
    
    public static double hitungRataRata(int[] suhu) {
        int jumlah = 0;
        for (int i = 0; i < suhu.length; i++) {
            jumlah = jumlah + suhu[i];
        }
        return (double) jumlah / suhu.length;
    }
    
    public static int cariHariTerdingin(int[] suhu) {
        int posisi = 0;
        for (int i = 1; i < suhu.length; i++) {
            if (suhu[i] < suhu[posisi]) {
                posisi = i;
            }
        }
        return posisi;
    }
}