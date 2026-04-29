package pekan4_2511532015;
import java.util.Stack;
public class AntrianLoket_2511532015 {
	int front, rear, size;
	int capacity;
	int max;
	String[] queue;
	
	public AntrianLoket_2511532015 (int capacity) {
		max = capacity;
		queue = new String [max];
		front = this.size = 0;
		rear = capacity - 1;
	}
	boolean isFull_2015 () {
		return (size == max);
	}
	boolean isEmpty_2015 () {
		return (size == 0);
	}
	//method enqueue = menambahkan data
	public void enqueue_2015 (String pelanggan) {
		if (isFull_2015()) {
			System.out.println ("Antrian penuh");
			return;
		}
		rear = (rear + 1) % max;
		queue [rear] = pelanggan;
		size = size + 1;
	}
	//method dequeue = menghapus data dari depan
	String dequeue_2015() {
		if (isEmpty_2015()) {
			System.out.println ("Antrian Kosong");
			return null;
		}
		String pelanggan = queue [front];
		front = (front + 1) % max;
		size = size - 1;
		return pelanggan;
	}
	//method display = menampilkan antrian
	void display_2015() {
		int i= front;
		if (isEmpty_2015()) {
			System.out.println ("Antrian Kosong");
			return ;
		}
		for (int j = 0; j < size; j++) {
			System.out.println((j+1) + ". " + queue [i]);
			i = (i+1)% max;
		}
		return;
	}
	//method reverse
	void reverse_2015() {
		Stack<String> s = new Stack<>();
		
		while (!isEmpty_2015()) {
			 String data = dequeue_2015(); 
			 s.push(data);
		}
		while (!s.isEmpty()) {
			String data = s.pop();
			enqueue_2015(data);
		}      
	}
}
