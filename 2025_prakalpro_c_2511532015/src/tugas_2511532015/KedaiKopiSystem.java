package tugas_2511532015;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class KedaiKopiSystem {
	private Queue<String> antreanPelanggan;
	private Stack<String> riwayatBatal;
	private ArrayList<String> menuTerlaris;
	
	
	//KONSTRUKTOR
	public KedaiKopiSystem() {
        this.antreanPelanggan = new LinkedList<>();
        this.riwayatBatal = new Stack<>();
        this.menuTerlaris = new ArrayList<>();
    }
	
	//SETTER/PROSEDUR (menambahkan pelanggan ke dalam antrian)
	public void tambahPelanggan(String namaPelanggan) {
        if (namaPelanggan != null && !namaPelanggan.isEmpty()) {
            antreanPelanggan.add(namaPelanggan); // Atau .offer()
            System.out.println("[ANTREAN] " + namaPelanggan + " telah bergabung.");
        } else {
            System.out.println("[ERROR] Nama pelanggan tidak boleh kosong.");
        }
    }
	//mencatat pesanan
	public void catatPesananSukses(String namaMinuman) {
        menuTerlaris.add(namaMinuman);
        System.out.println("[MENU] Pesanan '" + namaMinuman + "' berhasil dicatat.");
    }
	//mencatat pembatalan ke dalam stack
	public void batalkanPesananTerakhir(String namaPelanggan) {
        riwayatBatal.push(namaPelanggan);
        System.out.println("[BATAL] Pesanan " + namaPelanggan + " dibatalkan (masuk riwayat).");
    }
	
	//GETTER/FUNCTION
	public String layaniPelanggan() {
        if (!antreanPelanggan.isEmpty()) {
            String namaDepan = antreanPelanggan.poll(); 
            System.out.println("[LAYANAN] Sekarang melayani: " + namaDepan);
            return namaDepan;
        } else {
            System.out.println("[INFO] Antrean kosong, barista bisa istirahat sejenak.");
            return null;
        }
    }
	public String lihatBatalTerbaru() {
        if (!riwayatBatal.isEmpty()) {
            return riwayatBatal.peek();
        }
        return "Tidak ada riwayat pembatalan.";
    }
	public void tampilkanLaporanHarian() {
        System.out.println("\n=== LAPORAN PENJUALAN HARI INI ===");
        if (menuTerlaris.isEmpty()) {
            System.out.println("Belum ada penjualan hari ini.");
        } else {
            int nomor = 1;
            for (String minuman : menuTerlaris) {
                System.out.println(nomor + ". " + minuman);
                nomor++;
            }
        }
        System.out.println("===================================\n");
    }
	
	//MAIN METHOD (Uji coba program)
	public static void main(String[] args) {
        KedaiKopiSystem kedai = new KedaiKopiSystem();

        System.out.println("--- Simulasi Awal Buka Kedai ---");
        
        //queue
        kedai.tambahPelanggan("Mahasiswa A");
        kedai.tambahPelanggan("Mahasiswa B");
        kedai.tambahPelanggan("Mahasiswa C");
        
        //stack
        kedai.batalkanPesananTerakhir("Mahasiswa B"); 

        //queue
        kedai.layaniPelanggan(); 
        
        //array list
        kedai.catatPesananSukses("Kopi Gula Aren");
        kedai.catatPesananSukses("Latte Dingin");
        kedai.catatPesananSukses("Cokelat Panas");

        kedai.layaniPelanggan(); 

        //getter stack
        System.out.println("Riwayat pembatalan terbaru: " + kedai.lihatBatalTerbaru());

        //getter arraylist
        kedai.tampilkanLaporanHarian();
    }

}
