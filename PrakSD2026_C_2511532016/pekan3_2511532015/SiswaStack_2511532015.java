package pekan3_2511532015;

import java.util.ArrayList;

class Siswa_2511532015{
	String nama_2015;
	int nim_2015;
	
	public Siswa_2511532015 (String nama_2015, int nim_2015) {
		this.nama_2015 = nama_2015;
		this.nim_2015 = nim_2015;
	}
	
	@Override
	public String toString () {
		return "Nim: " + nim_2015 + ", Nama: " + nama_2015;
	}
}
public class SiswaStack_2511532015 {
	private ArrayList<Siswa_2511532015> stack;
	
	public SiswaStack_2511532015() {
		stack = new ArrayList<>();
	}
	public void push_2015 (Siswa_2511532015 mhs) {
		stack.add(mhs);
	}
	public Siswa_2511532015 pop_2015() {
		if (!isEmpty_2015()) {
			return stack.remove(stack.size()-1);
		}
		return null;
	}
	public Siswa_2511532015 peek_2015() {
		if (!isEmpty_2015()) {
			return stack.get(stack.size()-1);
		}
		return null;
	}
	public boolean isEmpty_2015() {
		return stack.isEmpty();
	}
	
	public void tampilkanSiswa_2015() {
		for (int i_2015 = stack.size()-1; i_2015 >=0; i_2015--) {
			System.out.println (stack.get(i_2015));
		}
	}
	public static void main(String[] args) {
		SiswaStack_2511532015 studentStack= new SiswaStack_2511532015();
		
		Siswa_2511532015 mhs1_2015 = new Siswa_2511532015 ("Ali", 1);
		Siswa_2511532015 mhs2_2015 = new Siswa_2511532015 ("Boby", 2);
		Siswa_2511532015 mhs3_2015 = new Siswa_2511532015 ("Charles", 3);
		studentStack.push_2015(mhs1_2015);
		studentStack.push_2015(mhs2_2015);
		studentStack.push_2015(mhs3_2015);
		
		System.out.println ("Siswa di dalam stack: ");
		studentStack.tampilkanSiswa_2015();
		
		System.out.println ("Siswa teratas " + studentStack.peek_2015());
		System.out.println ("Mengelurkan siswa teratas dari stack: "+ studentStack.pop_2015());
		System.out.println ("Daftar siswa setelah di pop: ");
		studentStack.tampilkanSiswa_2015();
	}
}
