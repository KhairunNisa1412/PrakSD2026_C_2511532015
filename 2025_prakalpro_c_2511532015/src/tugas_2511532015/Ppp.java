package tugas_2511532015;

import java.util.Scanner;

public class Ppp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] suhu = new int[7];
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        System.out.println("=== Input Suhu Pagi (7 Hari) ===");
        for (int i = 0; i < 7; i++) {
            System.out.print("Suhu hari " + hari[i] + " (°C): ");
            suhu[i] = sc.nextInt();
        }

        tampilkanSuhu(suhu, hari); // prosedur

        double rata = hitungRataRata(suhu);
        System.out.printf("\nRata-rata suhu: %.1f°C\n", rata);

        int idxPanas = cariHariTerpanas(suhu);
        int idxDingin = cariHariTerdingin(suhu);

        System.out.println("Hari terpanas: " + hari[idxPanas] + " (" + suhu[idxPanas] + "°C)");
        System.out.println("Hari terdingin: " + hari[idxDingin] + " (" + suhu[idxDingin] + "°C)");

        sc.close();
    }

    public static void tampilkanSuhu(int[] suhu, String[] hari) {
        System.out.println("\n--- DATA SUHU HARIAN ---");
        for (int i = 0; i < 7; i++) {
            System.out.println(hari[i] + ": " + suhu[i] + "°C");
        }
    }

    public static double hitungRataRata(int[] arr) {
        int total = 0;
        for (int s : arr) total += s;
        return (double) total / arr.length;
    }

    public static int cariHariTerpanas(int[] arr) {
        int idx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[idx]) idx = i;
        }
        return idx;
    }

    // ✨ FUNGSI BARU: Cari hari terdingin
    public static int cariHariTerdingin(int[] arr) {
        int idx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[idx]) idx = i; // perhatikan tanda "<"
        }
        return idx;
    }
}