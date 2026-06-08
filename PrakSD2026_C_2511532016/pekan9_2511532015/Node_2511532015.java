package pekan9_2511532015;

public class Node_2511532015 {
	int data_2015;
	Node_2511532015 left_2015;
	Node_2511532015 right_2015;
	public Node_2511532015 (int data_2015) {
		this.data_2015 = data_2015;
		left_2015 = null;
		right_2015 = null;
	}
	public void setLeft_2015 (Node_2511532015 node) {
		if (right_2015 == null)
			left_2015 = node;
	}
	public void setRight_2015 (Node_2511532015 node) {
		if (right_2015 == null)
			right_2015 = node;
	}
	public Node_2511532015 getLeft_2015() {
		return left_2015;
	}
	public Node_2511532015 getRight_2015() {
		return right_2015;
	}
	public int getData_2015() {
		return data_2015;
	}
	public void setData_2015 (int data_2015) {
		this.data_2015 = data_2015;
	}
	void printPreorder (Node_2511532015 node) {
		if (node == null)
			return;
		System.out.print(node.data_2015 + " ");
		printPreorder (node.left_2015);
		printPreorder (node.right_2015);
	}
	void printPostorder (Node_2511532015 node) {
		if (node == null) 
			return;
		printPostorder (node.left_2015);
		printPostorder (node.right_2015);
		System.out.print(node.data_2015 + " ");
	}
	void printInorder (Node_2511532015 node) {
		if (node == null)
			return;
		printInorder (node.left_2015);
		System.out.print(node.data_2015 + " ");
		printInorder (node.right_2015);
	}
	public String print () {
		return this.print ("",true,"");
	}
	public String print (String prefix, boolean isTail,String sb) {
		if (right_2015 != null) {
			right_2015.print (prefix + (isTail ? "| " : " "), false, sb);
		}
		System.out.println(prefix+(isTail? "\\--":"/--")+data_2015);
		if (left_2015!=null) {
			left_2015.print (prefix + (isTail ? " ": "| "), true, sb);
		}
		return sb;
	}
	
	
}
