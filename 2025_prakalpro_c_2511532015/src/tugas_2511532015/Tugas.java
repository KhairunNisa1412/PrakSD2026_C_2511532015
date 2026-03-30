package tugas_2511532015;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        boolean genap = (angka % 2 == 0);
        System.out.println(genap);
    }
}