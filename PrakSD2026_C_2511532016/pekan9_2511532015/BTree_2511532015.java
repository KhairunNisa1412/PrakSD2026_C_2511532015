package pekan9_2511532015;

public class BTree_2511532015 {
	private Node_2511532015 root_2015;
	private Node_2511532015 currentNode_2015;
	public BTree_2511532015() {
		root_2015 = null;
	}
	public boolean search_2015 (int data_2015) {
		return search_2015 (root_2015, data_2015);
	}
	private boolean search_2015 (Node_2511532015 node, int data_2015) {
		if (node.getData_2015()== data_2015)
			return true;
		if (node.getLeft_2015() != null)
			if (search_2015 (node.getLeft_2015(), data_2015))
				return true;
		if (node.getRight_2015() != null)
			if (search_2015 (node.getRight_2015(), data_2015))
				return true;
		return false;
	}
	public void printInOrder() {
		root_2015.printInorder(root_2015);
	}
	public void printPreOrder() {
		root_2015.printPreorder(root_2015);
	}
	public void printPostOrder() {
		root_2015.printPostorder(root_2015);
	}
	public Node_2511532015 getRoot_2015() {
		return root_2015;
	}
	public boolean isEmpty() {
		return root_2015 == null;
	}
	public int countNodes () {
		return countNodes (root_2015);
	}
	private int countNodes (Node_2511532015 node) {
		int count = 1;
		if (node == null) {
			return 0;
		} else {
			count += countNodes (node.getLeft_2015());
			count += countNodes (node.getRight_2015());
			return count;
		}
	}
	public void print_2015() {
		root_2015.print();
	}
	public Node_2511532015 getCurrent_2015() {
		return currentNode_2015;
	}
	public void setCurrent_2015 (Node_2511532015 node) {
		this.currentNode_2015 = node;
	}
	public void setRoot_2015(Node_2511532015 root_2015) {
		this.root_2015 = root_2015;
	}
}
