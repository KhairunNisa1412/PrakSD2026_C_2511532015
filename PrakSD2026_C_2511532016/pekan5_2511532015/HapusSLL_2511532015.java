package pekan5_2511532015;

public class HapusSLL_2511532015 {
	//fungsi untuk menghapus head
	public static NodeSLL_2511532015 deleteHead (NodeSLL_2511532015 head_2015) {
		//jika SLL kosong
		if (head_2015 == null)
			return null;
		//pindahkan head ke node berikutnya
		head_2015 = head_2015.next_2015;
		//return head baru
		return head_2015;
	}
	//fungsi menghapus node terakhir SLL
	public static NodeSLL_2511532015 rempoveLastNode (NodeSLL_2511532015 head_2015) {
		//jika list kosong, return null
		if (head_2015 == null) {
			return null;
		}
		//jika list satu node, hapus node dan return null
		if (head_2015.next_2015 == null) {
			return null;
		}
		//temukan node terakhir ke dua
		NodeSLL_2511532015 secondLast = head_2015;
		while (secondLast.next_2015.next_2015 != null) {
			secondLast = secondLast.next_2015;
		}
		//hapus node terakhir
		secondLast.next_2015 = null;
		return head_2015;
	}
	//fungsi menghapus node di posisi tertentu
	public static NodeSLL_2511532015 deleteNode (NodeSLL_2511532015 head_2015, int position_2015) {
		NodeSLL_2511532015 temp_2015 = head_2015;
		NodeSLL_2511532015 prev_2015 = null;
		//jika linked list null
		if (temp_2015== null)
			return head_2015;
		//kasus 1: head dihapus
		if (position_2015 == 1) {
			head_2015 = temp_2015.next_2015;
			return head_2015;
			}
		//kasus 2: menghapus node di tengah
		//telusuri ke node yang dihapus
		for (int i= 1; temp_2015 != null && i < position_2015; i++) {
			prev_2015 = temp_2015;
			temp_2015 = temp_2015.next_2015;}
		
		//jika ditemukan, hapus node
		if (temp_2015 != null) {
			prev_2015.next_2015 = temp_2015.next_2015;
		} else {
			System.out.println ("Data tidak ada");
		}
		return head_2015;
		}
		//fungsi mencetak SLL
		public static void printList (NodeSLL_2511532015 head_2015) {
			NodeSLL_2511532015 curr_2015 = head_2015;
			while (curr_2015.next_2015 != null) {
				System.out.print (curr_2015.data_2015+"-->");
				curr_2015 = curr_2015.next_2015;
			}
			if (curr_2015.next_2015 == null) {
				System.out.print(curr_2015.data_2015);
			}
			System.out.println();
		}
	
	//kelas main
	public static void main (String[] args) {
		//buat SSL 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
		NodeSLL_2511532015 head_2015 = new NodeSLL_2511532015 (1);
		head_2015.next_2015 = new NodeSLL_2511532015 (2);
		head_2015.next_2015.next_2015 = new NodeSLL_2511532015 (3);
		head_2015.next_2015.next_2015.next_2015 = new NodeSLL_2511532015 (4);
		head_2015.next_2015.next_2015.next_2015.next_2015 = new NodeSLL_2511532015 (5);
		head_2015.next_2015.next_2015.next_2015.next_2015.next_2015= new NodeSLL_2511532015 (6);
		//cetak list awal
		System.out.println ("list awal: ");
		printList (head_2015);
		//hapus head
		head_2015 = deleteHead (head_2015);
		System.out.println ("List setelah head dihapus: ");
		printList(head_2015);
		
		//hapus node terakhir
		head_2015= rempoveLastNode (head_2015);
		System.out.println ("List setelah simpul terakhir di hapus: ");
		printList(head_2015);
		
		//deleting node at position 2
		int position_2015 = 2;
		head_2015 = deleteNode (head_2015, position_2015);
		//print list after deletion
		System.out.println ("List setelah posisi 2 dihapus: ");
		printList(head_2015);
	}
}
