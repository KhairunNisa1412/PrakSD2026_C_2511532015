package pekan4_2511532015;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2511532015 {

	public static void main(String[] args) {
		Queue<Integer> q_2015 = new LinkedList <>();
		//tambah elemen {0, 1, 2, 3, 4, 5} ke antrian
		for (int i = 0; i < 6; i++)
			q_2015.add(i);
		
		//menampilkan usu antrian
		System.out.println ("Elemen antrian "+ q_2015);
		
		//untuk menghapus kepala antrian
		int hapus = q_2015.remove();
		System.out.println ("Hapus elemen = " + hapus);
		System.out.println (q_2015);
		
		//unutk melihat antrian terdepan
		int depan = q_2015.peek();
		System.out.println ("Kepala antrian = "+ depan);
		
		int banyak = q_2015.size();
		System.out.println ("Size antrian = "+ banyak);

	}

}
