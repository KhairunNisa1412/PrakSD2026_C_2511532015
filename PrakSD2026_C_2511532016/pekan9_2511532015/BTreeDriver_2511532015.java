package pekan9_2511532015;

public class BTreeDriver_2511532015 {
	public static void main(String[] args) {
	// membuat pohon
	BTree_2511532015 tree_2015 = new BTree_2511532015();
	System.out.print("Jumlah Simpul awal pohon: ");
	System.out.println(tree_2015.countNodes());
	// menambahkan simpul data 1
	Node_2511532015 root_2015 = new Node_2511532015(1);
	// menjadikan simpul 1 sebagai root
	tree_2015.setRoot_2015(root_2015);
	System.out.println("Jumlah simpul jika hanya ada root");
	System.out.println(tree_2015.countNodes());
	Node_2511532015 node2_2015 = new Node_2511532015(2);
	Node_2511532015 node3_2015 = new Node_2511532015(3);
	Node_2511532015 node4_2015 = new Node_2511532015(4);
	Node_2511532015 node5_2015 = new Node_2511532015(5);
	Node_2511532015 node6_2015 = new Node_2511532015(6);
	Node_2511532015 node7_2015 = new Node_2511532015(7);
	Node_2511532015 node8_2015 = new Node_2511532015(8);
	Node_2511532015 node9_2015 = new Node_2511532015(9);
	root_2015.setLeft_2015(node2_2015);
	node2_2015.setLeft_2015 (node4_2015);
	node2_2015.setRight_2015 (node5_2015);
	node4_2015.setRight_2015 (node8_2015);
	root_2015.setRight_2015(node3_2015);
	node3_2015.setLeft_2015 (node6_2015);
	node3_2015.setRight_2015 (node7_2015);
	node6_2015.setLeft_2015 (node9_2015);
	// set root_2015
	tree_2015.setCurrent_2015(tree_2015.getRoot_2015());
	System.out.println("menampilkan simpul terakhir:");
	System.out.println(tree_2015.getCurrent_2015().getData_2015());
	System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
	System.out.println(tree_2015.countNodes());
	System.out.println("InOrder: ");
	tree_2015.printInOrder();
	System.out.println("\nPreorder: ");
	tree_2015.printPreOrder();
	System.out.println("\nPostorder: ");
	tree_2015.printPostOrder();
	System.out.println("\nMenampilkan simpul dalam bentuk pohon");
	tree_2015.print_2015();
	}

}