package pekan6_2511532015;

public class HapusDLL_2511532015 {
	//fungsi mengahpus node di awal
	public static NodeDLL_2511532015 delHead (NodeDLL_2511532015 head_2015) {
		if (head_2015 == null) {
			return null;
		}
		NodeDLL_2511532015 temp_2015 = head_2015;
		head_2015 = head_2015.next_2015;
		if (head_2015 != null) {
			head_2015.prev_2015 = null;
		}
		return head_2015;
	}
	//fungsi menghapus di akhir
	public static NodeDLL_2511532015 delLast (NodeDLL_2511532015 head_2015) {
		if (head_2015 == null) {
			return null;
		}
		if (head_2015.next_2015 == null) {
			return null;
		}
		NodeDLL_2511532015 curr_2015 = head_2015;
		while (curr_2015.next_2015 != null) {
			curr_2015 = curr_2015.next_2015;
		}
		//update pointer previous node
		if (curr_2015.prev_2015 != null) {
			curr_2015.prev_2015.next_2015 = null;
		}
		return head_2015;
	}
	//fungsi menghapus node posisi tertentu
	public static NodeDLL_2511532015 delPos (NodeDLL_2511532015 head_2015, int pos_2015) {
		//jika DLL kosong
		if (head_2015 == null) {
			return head_2015;
		}
		NodeDLL_2511532015 curr_2015 = head_2015;
		//telusuri sampai ke node yang akan dihapus
		for (int i = 1; curr_2015 != null && i < pos_2015; ++i) {
			curr_2015 = curr_2015.next_2015;
		}
		//jika posisi tidak ditemukan
		if (curr_2015 == null) {
			return head_2015;
		}
		//update pointer
		if (curr_2015.prev_2015 != null) {
			curr_2015.prev_2015.next_2015 = curr_2015.next_2015;
		}
		if (curr_2015.next_2015 != null) {
			curr_2015.next_2015.prev_2015 = curr_2015.prev_2015;
		}
		//jika yang dihapus head
		if (head_2015 == curr_2015) {
			head_2015 = curr_2015.next_2015;
		}
		return head_2015;
	}
	//fungsi mencetak DLL
	public static void printList (NodeDLL_2511532015 head_2015) {
		NodeDLL_2511532015 curr_2015 = head_2015;
		while (curr_2015 != null) {
			System.out.print ( curr_2015.data_2015 + " ");
			curr_2015 = curr_2015.next_2015;
		}
		System.out.println ();
	}
	public static void main (String[] args) {
		//buat sebuah DLL
		NodeDLL_2511532015 head_2015 = new NodeDLL_2511532015 (1);
		head_2015.next_2015 = new NodeDLL_2511532015 (2);
		head_2015.next_2015.prev_2015 = head_2015;
		head_2015.next_2015.next_2015 = new NodeDLL_2511532015 (3);
		head_2015.next_2015.next_2015.prev_2015 = head_2015.next_2015;
		head_2015.next_2015.next_2015.next_2015 = new NodeDLL_2511532015 (4);
		head_2015.next_2015.next_2015.next_2015.prev_2015 = head_2015.next_2015;
		head_2015.next_2015.next_2015.next_2015.next_2015 = new NodeDLL_2511532015 (5);
		head_2015.next_2015.next_2015.next_2015.next_2015.prev_2015 = head_2015.next_2015.next_2015.next_2015;
		
		System.out.print ("DLL Awal: ");
		printList(head_2015);
		
		System.out.print ("Setelah head dihapus: ");
		head_2015 = delHead (head_2015);
		printList (head_2015);
		
		System.out.print("Setelah node terkahir dihapus: ");
		head_2015 = delLast (head_2015);
		printList (head_2015);
		
		System.out.print ("Menga=hapus node ke 2: ");
		head_2015 = delPos (head_2015, 2);
		printList (head_2015);
	}
}
