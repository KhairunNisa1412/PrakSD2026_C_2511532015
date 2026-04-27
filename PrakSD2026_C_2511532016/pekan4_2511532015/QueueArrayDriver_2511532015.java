package pekan4_2511532015;

public class QueueArrayDriver_2511532015 {

	public static void main(String[] args) {
		QueueArray_2511532015 queue_2015 = new QueueArray_2511532015 (1000);
		queue_2015.enqueue_2015(10);
		queue_2015.enqueue_2015(20);
		queue_2015.enqueue_2015(30);
		queue_2015.enqueue_2015(40);
		System.out.println ("Item di depan "+ queue_2015.front_2015());
		System.out.println ("Item paling belakang "+ queue_2015.rear_2015());
		System.out.println ("tampilkan queue");
		queue_2015.display_2015();
		System.out.println ();
		System.out.println (queue_2015.dequeue_2015() + " dihapus dari queue");
		System.out.println ("Item di depan: "+ queue_2015.front_2015());
		System.out.println ("Item dibelakang: "+ queue_2015.rear_2015());
		System.out.println ("Tampilan queue setelah daru data dihapus");
		queue_2015.display_2015();
	}

}
