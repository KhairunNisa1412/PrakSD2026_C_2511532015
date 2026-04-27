package pekan4_2511532015;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IterasiQueue_2511532015 {

	public static void main(String[] args) {
		Queue<String> q_2015 = new LinkedList<>();
		
		q_2015.add("Praktikum");
		q_2015.add("Struktur");
		q_2015.add("Data");
		q_2015.add("Dan");
		q_2015.add("Algoritma");
		Iterator<String> iterator = q_2015.iterator();
		while (iterator.hasNext()) {
			System.out.print (iterator.next() + " ");
		}

	}

}
