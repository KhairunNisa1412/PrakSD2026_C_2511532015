package pekan5_2511532015;

import java.util.Scanner;

public class RumahSakit_2511532015 {
    
    // === VARIABEL KUNCI ===
    private Pasien_2511532015 head_2015 = null;  
    private int counter_2015 = 0;                 
    
    //method daftar pasien
    public void daftarkanPasien_2015(String nama, String keluhan) {
        Pasien_2511532015 pasienBaru_2015 = new Pasien_2511532015(nama, keluhan, counter_2015 + 1);
        if (head_2015 == null) { //langsung jadi head jika null
            head_2015 = pasienBaru_2015;
        } else {
            Pasien_2511532015 bantu_2015 = head_2015;
            while (bantu_2015.getNext_2015() != null) {
                bantu_2015 = bantu_2015.getNext_2015();
            }
            bantu_2015.setNext_2015(pasienBaru_2015);
        }
        
        counter_2015++;  // naikkan counter setelah berhasil daftar
        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + pasienBaru_2015.getNomorAntrian_2015());
    }
    
    //method panggil pasien
    public void panggilPasien_2015() {
        if (head_2015 == null) {
            System.out.println("Antrian kosong. Tidak ada pasien yang bisa dipanggil.");
            return;
        }
        String nama_2015 = head_2015.getNamaPasien_2015();
        int nomor_2015 = head_2015.getNomorAntrian_2015();
        head_2015 = head_2015.getNext_2015();
        System.out.println("Pasien dipanggil: " + nama_2015 + " (No. Antrian: " + nomor_2015 + ")");
    }
    
    //method tampilkan antrina
    public void tampilkanAntrian_2015() {
        if (head_2015 == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        
        System.out.println("\n=== Daftar Antrian ===");
        Pasien_2511532015 curr_2015 = head_2015;
        int posisi_2015 = 1;
        while (curr_2015 != null) {
            System.out.println(posisi_2015+". " +  curr_2015.getNamaPasien_2015() + " - " + curr_2015.getKeluhan_2015());
            curr_2015 = curr_2015.getNext_2015();
            posisi_2015++;
        }
        System.out.println("=====================");
    }
    
    //method cari pasien
    public void cariPasien_2015(String nama) {
        if (head_2015 == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        
        Pasien_2511532015 curr_2015 = head_2015;
        boolean ditemukan_2015 = false;
        while (curr_2015 != null) {
            if (curr_2015.getNamaPasien_2015().equalsIgnoreCase(nama)) {
                System.out.println("Pasien ditemukan:");
                System.out.println("Nomor Antrian: " + curr_2015.getNomorAntrian_2015());
                System.out.println("Keluhan: " + curr_2015.getKeluhan_2015());
                ditemukan_2015 = true;
                break;  // berhenti setelah ketemu pertama
            }
            curr_2015 = curr_2015.getNext_2015();
        }
        
        if (!ditemukan_2015) {
            System.out.println("Pasien dengan nama \"" + nama + "\" tidak ditemukan dalam antrian.");
        }
    }
    
    //method cek status antrian
    public void cekStatusAntrian_2015() {
        if (head_2015 == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        int total_2015 = 0;
        Pasien_2511532015 curr_2015 = head_2015;
        while (curr_2015 != null) {
            total_2015++;
            curr_2015 = curr_2015.getNext_2015();
        }
        System.out.println("\n=== Status Antrian ===");
        System.out.println("Total Pasien: " + total_2015);
        System.out.println("Pasien Terdepan: " + head_2015.getNamaPasien_2015() + " (No. " + head_2015.getNomorAntrian_2015() + ")");
        System.out.println("=====================");
    }
    
    //menampilkan menu
    private void tampilkanMenu_2015() {
        System.out.println("\n=== Antrian Rumah Sakit NIM: 2511532015 ===");
        System.out.println("1. Daftarkan Pasien (Insert at Tail)");
        System.out.println("2. Panggil Pasien (Delete Head)");
        System.out.println("3. Tampilkan Antrian (Display)");
        System.out.println("4. Cari Pasien (Search)");
        System.out.println("5. Cek Status Antrian");
        System.out.println("6. Keluar");
        System.out.print("Pilihan: ");
    }
    //main method
    public static void main(String[] args) {
        Scanner scan_2015 = new Scanner(System.in);
        RumahSakit_2511532015 rs_2015 = new RumahSakit_2511532015();
        
        int pilihan_2015;
        
        do {
            rs_2015.tampilkanMenu_2015();
            pilihan_2015 = scan_2015.nextInt();
            scan_2015.nextLine();
            
            switch (pilihan_2015) {
                case 1:
                    System.out.print("Masukkan Nama Pasien: ");
                    String nama_2015 = scan_2015.nextLine();
                    System.out.print("Masukkan Keluhan: ");
                    String keluhan_2015 = scan_2015.nextLine();
                    rs_2015.daftarkanPasien_2015(nama_2015, keluhan_2015);
                    break;
                    
                case 2:
                    rs_2015.panggilPasien_2015();
                    break;
                    
                case 3:
                    rs_2015.tampilkanAntrian_2015();
                    break;
                    
                case 4:
                    System.out.print("Masukkan nama pasien yang dicari: ");
                    String cari_2015 = scan_2015.nextLine();
                    rs_2015.cariPasien_2015(cari_2015);
                    break;
                    
                case 5:
                    rs_2015.cekStatusAntrian_2015();
                    break;
                    
                case 6:
                    System.out.println("Terima kasih telah menggunakan sistem antrian.");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-6.");
            }
        } while (pilihan_2015 != 6);
        
        scan_2015.close();
    }
}