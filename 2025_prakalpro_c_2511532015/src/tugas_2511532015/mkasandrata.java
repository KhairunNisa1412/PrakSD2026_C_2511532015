package tugas_2511532015;
import java.util.Scanner;
public class mkasandrata {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.print("Masukkan jumlah data: ");
		        int n = sc.nextInt();
		        
		        int maks = 0;
		        int jumlah = 0;
		        
		        for (int i = 1; i <= n; i++) {
		            System.out.print("Angka ke-" + i + ": ");
		            int angka = sc.nextInt();
		            
		            if (i == 1) {
		                maks = angka;
		            } else if (angka > maks) {
		                maks = angka;
		            }
		            
		            jumlah = jumlah + angka;
		        }
		        
		        double rata = (double) jumlah / n;
		        
		        System.out.println("Nilai maksimum: " + maks);
		        System.out.println("Rata-rata: " + rata);
		    }
		}
	


