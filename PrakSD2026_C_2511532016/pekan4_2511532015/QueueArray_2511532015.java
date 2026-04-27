package pekan4_2511532015;

public class QueueArray_2511532015 {
	int front, rear, size;
	int capacity;
	int array[];
	
	public QueueArray_2511532015 (int capacity) {
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity - 1;
		array = new int [this.capacity];
	}
	
	boolean isFull_2015 (QueueArray_2511532015 queue) {
		return (queue.size == queue.capacity);
	}
	
	boolean isEmpty_2015 (QueueArray_2511532015 queue) {
		return (queue.size == 0);
	}
	
	void enqueue_2015 (int item) {
		if (isFull_2015 (this))
			return;
		this.rear = (this.rear + 1)% this.capacity;
		this.array [this.rear]= item;
		this.size = this.size + 1;
		System.out.println (item + " enqueue to queue");
	}
	
	int dequeue_2015() {
		if (isEmpty_2015(this))
			return Integer.MIN_VALUE;
		int item = this.array[this.front];
		this.front = (this.front + 1)% this.capacity;
		this.size = this.size - 1;
		return item;
	}
	int front_2015() {
		if (isEmpty_2015 (this))
			return Integer.MIN_VALUE;
		
		return this.array[this.front];
	}
	int rear_2015() {
		if (isEmpty_2015(this))
			return Integer.MIN_VALUE;
		return this.array[this.rear];
	}
	//mencetak elemen antrean
	void display_2015() {
		int i;
		if (front == rear) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		//kunjungi dari belakang dan cetak
		for (i = front; i < rear; i++) {
			System.out.printf(" %d <--", array[i]);
		}
		return;
	}
}
