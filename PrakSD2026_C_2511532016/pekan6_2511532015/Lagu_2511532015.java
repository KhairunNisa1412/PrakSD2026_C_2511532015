package pekan6_2511532015;

public class Lagu_2511532015 {
	//atribut (judul, penyani, next, prev)
	String judul_2015;
	String penyanyi_2015;
	Lagu_2511532015 next_2015;
	Lagu_2511532015 prev_2015; 
	
	//konstruktor
	public Lagu_2511532015 (String judul_2015, String penyanyi_2015) {
		this.judul_2015 = judul_2015;
		this.penyanyi_2015 = penyanyi_2015;
		this.next_2015 = null;
		this.prev_2015 = null;
	}
	// getter
	public String getJudul_2015() { return judul_2015;}
	public String getPenyanyi_2015() { return penyanyi_2015;}
	public Lagu_2511532015 getNext_2015() { return next_2015;}
	public Lagu_2511532015 getPrev_2015() { return prev_2015;}
	
	//setter
	public void setJudul_2015 (String judul_2015) {
		this.judul_2015 = judul_2015;
	}
	public void setPenyanyi_2015 (String penyanyi_2015) {
		this.penyanyi_2015 = penyanyi_2015;
	}
	public void setNext_2015 (Lagu_2511532015 next_2015) {
		this.next_2015 = next_2015;
	}
	public void setPrev_2015 (Lagu_2511532015 prev_2015) {
		this.prev_2015 = prev_2015;
	}
}

