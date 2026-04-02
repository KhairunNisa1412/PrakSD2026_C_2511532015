package pekan1_2511532015;

public class Mobil_2511532015 {
	private String nama;
	private int tahun;
	private int cc;
	private int harga;
	private String merek;
	
	//--- Array Biasa ---
	private static Mobil_2511532015[] garasi = new Mobil_2511532015[10];
	private static int jumlahMobil = 0;

	//--- Konstruktor --- 
	public Mobil_2511532015 (String nama, int tahun, int cc, int harga, String merek) {
		this.nama = nama;
		this.tahun = tahun;
		this.cc = cc;
		this.harga = harga;
		this.merek = merek; 
	}
	
	//--- Selector ---
	public String getNama() {return nama;}
	public int getTahun() {return tahun;}
	public int getCC() {return cc;}
	public int getHarga() {return harga;}
	public String getMerek() {return merek;}
	
	//dapatin jumlah mobil
	public static int getJumlahMobil() {
		return jumlahMobil;
	}
	//dapatin kapasitas garasi 
	public static int getKapasitasGarasi() {
		return garasi.length;
	}
	
	//--- Mutator ---
	public void setNama(String nama) {this.nama = nama;}
	public void setTahun(int tahun) {this.tahun = tahun;}
	public void setCC(int cc) {this.cc = cc;}
	public void setHarga(int harga) {this.harga = harga;}
	public void setMerek(String merek) {this.merek = merek;}
	
	//--- menampilkan data mobil ---
	public static void tampilkanSemuaMobil() {
		System.out.println("=== Daftar Mobil ===");
		if (jumlahMobil == 0) {
			System.out.println ("Garasi masih kosong");
		} else {
			for (int i= 0; i< jumlahMobil; i++) {
				Mobil_2511532015 m = garasi[i];
				System.out.println ("Mobil ke-"+ (i+1)+": ");
				System.out.println ("Nama: "+ m.nama);
				System.out.println ("Tahun: " + m.tahun);
				System.out.println ("CC: "+ m.cc);
				System.out.println ("Harga: "+m.harga);
				System.out.println ("Merek: "+m.merek);
				System.out.println ("\n=======================");
			}
		}
	}
	//--- Tambah Mobil ---
	public static boolean tambahMobil (Mobil_2511532015 mobilBaru) {
		if (mobilBaru == null) {
			System.out.println ("Mobil tidak boleh kosong");
			return false;
		}
		if (jumlahMobil >= garasi.length) {
			System.out.println ("Garasi sudah penuh (maksimal)");
			return false;
		} 
		garasi[jumlahMobil] = mobilBaru;
		jumlahMobil++;
		System.out.println("Mobil berhasil ditambahkan");
		return true;
	}
	
	//--- Hapus Mobil ---
	public static boolean hapusMobil(String namaMobil) {
		int index = -1;
		for (int i = 0; i < jumlahMobil; i++) {
			if (garasi[i].nama.equalsIgnoreCase(namaMobil)) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println ("Mobil tidak ditemukan");
			return false;
		}
		for (int i = index; i < jumlahMobil - 1; i++) {
			garasi[i]=garasi[i+1];
		}
		garasi [jumlahMobil - 1]= null;
		jumlahMobil--;
		System.out.println ("Berhasil menghapus mobil");
		return true;
		
	}

}
