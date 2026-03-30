package tugas_2511532015;

import java.util.Scanner;

public class TugasProsedurDenganSatuOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;
        System.out.print("Masukkan Jari-jari Lingkaran: ");
        double r = input.nextDouble();
        double keliling = 2 * PI * r;
        double luas = PI * r * r;
        System.out.println("Keliling Lingkaran = " + keliling);
        System.out.println("Luas Lingkaran = " + luas);
    }
}