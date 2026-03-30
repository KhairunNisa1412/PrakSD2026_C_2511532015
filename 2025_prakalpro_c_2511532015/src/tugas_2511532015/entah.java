package tugas_2511532015;
import java.util.Scanner;
public class entah {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int pilihan;
        boolean keluar = false;

        do {
            System.out.println("\n===== MINI APLIKASI ALPRO =====");
            System.out.println("1. Cek Kelulusan (if-else)");
            System.out.println("2. Konversi Angka ke Hari (switch-case)");
            System.out.println("3. Cetak Pola Bintang Segitiga (nested for)");
            System.out.println("4. Hitung Jumlah Deret 1 sampai N (for)");
            System.out.println("5. Tebak Angka (while + random)");
            System.out.println("6. Validasi Email & Password (String method)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-6): ");
            
            // Validasi input harus angka
            while (!sc.hasNextInt()) {
                System.out.print("Input harus angka! Pilih lagi: ");
                sc.next(); // buang input salah
            }
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    // === IF-ELSE ===
                    System.out.print("Masukkan nilai (0-100): ");
                    int nilai = sc.nextInt();
                    if (nilai >= 75) {
                        System.out.println("✅ LULUS!");
                    } else {
                        System.out.println("❌ TIDAK LULUS.");
                    }
                    break;

                case 2:
                    // === SWITCH-CASE ===
                    System.out.print("Masukkan angka hari (1-7): ");
                    int hari = sc.nextInt();
                    switch (hari) {
                        case 1: System.out.println("Senin"); break;
                        case 2: System.out.println("Selasa"); break;
                        case 3: System.out.println("Rabu"); break;
                        case 4: System.out.println("Kamis"); break;
                        case 5: System.out.println("Jumat"); break;
                        case 6: System.out.println("Sabtu"); break;
                        case 7: System.out.println("Minggu"); break;
                        default: System.out.println("❌ Angka harus 1-7!");
                    }
                    break;

                case 3:
                    // === NESTED FOR (Pola Bintang) ===
                    System.out.print("Tinggi segitiga: ");
                    int t = sc.nextInt();
                    for (int i = 1; i <= t; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    // === FOR (Jumlah deret 1 sampai N) ===
                    System.out.print("Masukkan N: ");
                    int n = sc.nextInt();
                    int total = 0;
                    for (int i = 1; i <= n; i++) {
                        total += i;
                    }
                    System.out.println("Jumlah 1 sampai " + n + " = " + total);
                    break;

                case 5:
                    // === WHILE (Game Tebak Angka) ===
                    int angkaRahasia = (int)(Math.random() * 10) + 1; // 1-10
                    int tebakan;
                    System.out.println("Tebak angka 1-10!");
                    while (true) {
                        System.out.print("Tebakan: ");
                        tebakan = sc.nextInt();
                        if (tebakan == angkaRahasia) {
                            System.out.println("🎉 Benar! Angkanya: " + angkaRahasia);
                            break;
                        } else if (tebakan < angkaRahasia) {
                            System.out.println("↑ Terlalu kecil!");
                        } else {
                            System.out.println("↓ Terlalu besar!");
                        }
                    }
                    break;

                case 6:
                    // === STRING VALIDASI (minggu 7) ===
                    sc.nextLine(); // clear buffer
                    System.out.print("Masukkan email: ");
                    String email = sc.nextLine();
                    System.out.print("Masukkan password: ");
                    String pass = sc.nextLine();

                    if (email.contains("@") && email.contains(".") && pass.length() >= 8) {
                        System.out.println("✅ Registrasi berhasil!");
                        System.out.println("Email: " + email.toUpperCase());
                        System.out.println("Username (lower): " + email.toLowerCase());
                    } else {
                        System.out.println("❌ Registrasi gagal:");
                        if (!email.contains("@") || !email.contains(".")) {
                            System.out.println("   - Email harus ada '@' dan '.'");
                        }
                        if (pass.length() < 8) {
                            System.out.println("   - Password minimal 8 karakter");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih! Sampai jumpa 👋");
                    keluar = true;
                    break;

                default:
                    System.out.println("⚠️ Pilihan tidak valid. Coba lagi.");
            }

            // Tunggu enter sebelum lanjut (biar rapi di output)
            if (pilihan != 0) {
                System.out.print("\nTekan Enter untuk kembali ke menu...");
                sc.nextLine(); sc.nextLine(); // clear + wait
            }

        } while (!keluar);

        sc.close();
    }
}




		        