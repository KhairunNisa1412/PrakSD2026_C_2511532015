package pekan5_2511532015;

public class TambahSLL_2511532015 {
	public static NodeSLL_2511532015 insertAtFront (NodeSLL_2511532015 head_2015, int value_2015) {
		NodeSLL_2511532015 new_node_2015 = new NodeSLL_2511532015 (value_2015);
		new_node_2015.next_2015 = head_2015;
		return new_node_2015;
	}
	//fungsi menambahkan node di akhir SLL
	public static NodeSLL_2511532015 insertAtEnd (NodeSLL_2511532015 head_2015, int value_2015) {
		//buat sebuah node dengan sebuah nilai
		NodeSLL_2511532015 newNode = new NodeSLL_2511532015 (value_2015);
		//jika list kosong maka node jadi head
		if (head_2015 == null) {
			return newNode;
		}
		//simpan head ke variabel sementara
		NodeSLL_2511532015 last= head_2015;
		//telusuri ke node akhir
		while (last.next_2015 != null) {
			last = last.next_2015;
		}
		//ubah pointer
		last.next_2015 = newNode;
		return head_2015;
	}
	static NodeSLL_2511532015 GetNode (int data) {
		return new NodeSLL_2511532015 (data);
	}
	static NodeSLL_2511532015 insertPos (NodeSLL_2511532015 headNode_2015, int position_2015, int value_2015) {
		NodeSLL_2511532015 head_2015 = headNode_2015;
		if (position_2015 < 1)
			System.out.print ("Invalid position");
		if (position_2015 == 1) {
			NodeSLL_2511532015 new_node = new NodeSLL_2511532015 (value_2015);
			new_node.next_2015 = head_2015;
			return new_node;
		} else {
			while (position_2015-- != 0) {
				if (position_2015 == 1) {
					NodeSLL_2511532015 newNode = GetNode (value_2015);
					newNode.next_2015 = headNode_2015.next_2015;
					headNode_2015.next_2015 = newNode;
					break;
				}
				headNode_2015 = headNode_2015.next_2015;
			}
			if (position_2015 != 1)
				System.out.print ("Posisi di luar jangkauan"); 
		}
		return head_2015;
	}
	public static void printList_2015 (NodeSLL_2511532015 head_2015) {
		NodeSLL_2511532015 curr_2015= head_2015;
		while (curr_2015.next_2015 != null) {
			System.out.print (curr_2015.data_2015+"-->");
			curr_2015 = curr_2015.next_2015;
		}
		if (curr_2015.next_2015 == null) {
			System.out.print (curr_2015.data_2015);
		}
		System.out.println();
	}
	public static void main (String [] args) {
		//buat linked list 2->3->5->6
		NodeSLL_2511532015 head_2015 = new NodeSLL_2511532015 (2);
		head_2015.next_2015 = new NodeSLL_2511532015 (3);
		head_2015.next_2015.next_2015 = new NodeSLL_2511532015 (5);
		head_2015.next_2015.next_2015.next_2015 = new NodeSLL_2511532015 (6);
		//cetak list asli
		System.out.print ("Senarai berantai awal: ");
		printList_2015 (head_2015);
		//tambahkan node baru di depan
		System.out.print ("tambah 1 simpul di depan: ");
		int data_2015 = 1;
		head_2015 = insertAtFront (head_2015, data_2015);
		//cetak update list
		printList_2015 (head_2015);
		
		//tambahkan ode baru dibelakang
		System.out.print ("tambah 1 simpul di belakang: ");
		int data2_2015 = 7;
		head_2015 = insertAtEnd (head_2015, data2_2015);
		
		//cetak update list
		printList_2015 (head_2015);
		System.out.print("tambah 1 simpul ke data 4: ");
		int data3_2015 = 4;
		int pos_2015 = 4;
		head_2015 = insertPos (head_2015, pos_2015, data3_2015);
		//cetak update list
		printList_2015 (head_2015);
	}
}
