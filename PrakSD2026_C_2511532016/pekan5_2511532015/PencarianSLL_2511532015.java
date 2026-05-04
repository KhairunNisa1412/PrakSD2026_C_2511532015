package pekan5_2511532015;

public class PencarianSLL_2511532015 {
	static boolean searchKey (NodeSLL_2511532015 head_2015, int key_2015) {
		NodeSLL_2511532015 curr_2015 = head_2015;
		while (curr_2015 != null) {
			if (curr_2015.data_2015 == key_2015)
				return true;
			curr_2015 = curr_2015.next_2015;
		}
		return false;
	}
	public static void traversal (NodeSLL_2511532015 head_2015) {
		//mulai dari head
		NodeSLL_2511532015 curr_2015 = head_2015;
		//telusuri sampai pointer null
		while (curr_2015 != null) {
			System.out.print(" "+ curr_2015.data_2015);
			curr_2015 = curr_2015.next_2015;
		}
		System.out.println();
	}
	public static void main (String[] args) {
		NodeSLL_2511532015 head_2015 = new NodeSLL_2511532015 (14);
		head_2015.next_2015 = new NodeSLL_2511532015 (21);
		head_2015.next_2015.next_2015 = new NodeSLL_2511532015 (30);
		head_2015.next_2015.next_2015.next_2015 = new NodeSLL_2511532015 (10);
		System.out.print ("Penelusuran SLL: ");
		traversal (head_2015);
		//data yang akan dicari
		int key_2015 = 30;
		System.out.print ("cari data "+key_2015+ "= ");
		if (searchKey(head_2015, key_2015))
			System.out.println ("Ketemu");
		else
			System.out.println ("Tidak ada");
	}
}
