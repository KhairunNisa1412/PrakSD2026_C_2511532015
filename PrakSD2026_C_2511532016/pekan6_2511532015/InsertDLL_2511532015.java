package pekan6_2511532015;

public class InsertDLL_2511532015 {
    //menambahkan node di awal DLL
    static NodeDLL_2511532015 insertBegin (NodeDLL_2511532015 head_2015, int data_2015){
        //buat node baru
        NodeDLL_2511532015 new_node = new NodeDLL_2511532015 (data_2015);
        //jadikan pinter nextnya head
        new_node.next_2015 = head_2015;
        //jadikan pointer prev head ke new node
        if (head_2015 != null){
            head_2015.prev_2015 = new_node;
        }
        return new_node;
    }
    //fungsi menambahkan node di akhir
    public static NodeDLL_2511532015 insertEnd(NodeDLL_2511532015 head_2015, int newData){
        //buat node baru
        NodeDLL_2511532015 newNode = new NodeDLL_2511532015 (newData);
        //jika dll null jadikan head
        if (head_2015 == null){
            head_2015 = newNode;
        }
        else {
            NodeDLL_2511532015 curr_2015 = head_2015;
            while (curr_2015.next_2015 != null){
                curr_2015 = curr_2015.next_2015;
            }
            curr_2015.next_2015 = newNode;
            newNode.prev_2015 = curr_2015;
        }
        return head_2015;
    }
    //fungsi menambahkan node di posisi teratas
    public static NodeDLL_2511532015 insertAtPosition (NodeDLL_2511532015 head_2015, int pos_2015, int new_data) {
    	//buat node baru
    	NodeDLL_2511532015 new_node = new NodeDLL_2511532015 (new_data);
    	if (pos_2015 == 1) {
    		new_node.next_2015 = head_2015;
    		if (head_2015 != null) {
    			head_2015.prev_2015 = new_node;
    		}
    		head_2015 = new_node;
    		return head_2015;
    	}
    	NodeDLL_2511532015 curr_2015 = head_2015;
    	for (int i = 1; i < pos_2015 - 1 && curr_2015 != null; ++i) {
    		curr_2015 = curr_2015.next_2015;
    	}
    	if (curr_2015 == null) {
    		System.out.println ("Posisi tidak ada");
    		return head_2015;
    	}
    	new_node.prev_2015 = curr_2015;
    	new_node.next_2015 = curr_2015.next_2015;
    	curr_2015.next_2015 = new_node;
    	if (new_node.next_2015 != null) {
    		new_node.next_2015.prev_2015 = new_node;
    	}
    	return head_2015;
    }
    public static void printList (NodeDLL_2511532015 head_2015) {
    	NodeDLL_2511532015 curr_2015 = head_2015;
    	while (curr_2015 != null) {
    		System.out.print (curr_2015.data_2015 + " <-> ");
    		curr_2015 = curr_2015.next_2015;
    	}
    	System.out.println ();
    }
    public static void main (String[] args) {
    	//membuat dll 2 <-> 3 <-> 5
    	NodeDLL_2511532015 head_2015 = new NodeDLL_2511532015 (2);
    	head_2015.next_2015 = new NodeDLL_2511532015 (3);
    	head_2015.next_2015.prev_2015 = head_2015;
    	head_2015.next_2015.next_2015 = new NodeDLL_2511532015 (5);
    	head_2015.next_2015.next_2015.prev_2015 = head_2015.next_2015;
    	//cetak DLL awal
    	System.out.print ("DLL Awal: ");
    	printList (head_2015);
    	//tambah 1 di awal
    	head_2015 = insertBegin (head_2015, 1);
    	System.out.print("Simpul 1 ditambah di awal: ");
    	printList(head_2015);
    	//tambah 6 di akhir
    	System.out.print ("Simpul 6 ditambah di akhir: ");
    	int data_2015 = 6;
    	head_2015 = insertEnd (head_2015, data_2015);
    	printList (head_2015);
    	//menambahkan node 4 di posisi 4
    	System.out.print ("Tambah node 4 di posisi 4: ");
    	int data2_2015 = 4;
    	int pos_2015 = 4;
    	head_2015 = insertAtPosition (head_2015, pos_2015, data2_2015);
    	printList (head_2015);
    }
}
