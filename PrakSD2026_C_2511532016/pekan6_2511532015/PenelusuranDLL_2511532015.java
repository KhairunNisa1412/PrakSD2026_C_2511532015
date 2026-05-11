package pekan6_2511532015;

public class PenelusuranDLL_2511532015 {
	//fungsi penelurusan maju
	static void forwardTraversal (NodeDLL_2511532015 head_2015) {
		//memulai penelusuran dari head
		NodeDLL_2511532015 curr_2015 = head_2015;
		//lanjutkan sampai akhir
		while (curr_2015 != null) {
			//print data
			System.out.print (curr_2015.data_2015 + " <-> ");
			//pindahkan ke node berikutnya
			curr_2015 = curr_2015.next_2015;
		}
		//print spasi
		System.out.println ();
	}
	//fungsi penelusuran mundur
	static void backwardTraversal (NodeDLL_2511532015 tail_2015) {
		//mulai dari akhir
		NodeDLL_2511532015 curr_2015 = tail_2015;
		//lanjut sampai head
		while (curr_2015 != null) {
			//cetak data
			System.out.print (curr_2015.data_2015 + " <-> ");
			//pindahkan ke node sebelumnya
			curr_2015 = curr_2015.prev_2015;
		}
		//cetak spasi
		System.out.println();
	}
	public static void main (String[] args) {
		//cetak dll
		NodeDLL_2511532015 head_2015 = new NodeDLL_2511532015 (1);
		NodeDLL_2511532015 second_2015 = new NodeDLL_2511532015 (2);
		NodeDLL_2511532015 third_2015 = new NodeDLL_2511532015 (3);
		
		head_2015.next_2015 = second_2015;
		second_2015.prev_2015 = head_2015;
		second_2015.next_2015 = third_2015;
		third_2015.prev_2015 = second_2015;
		
		System.out.println ("Penelusuran maju: ");
		forwardTraversal (head_2015);
		
		System.out.println ("Penelusuran mundur: ");
		backwardTraversal (third_2015);
		
	}
}
