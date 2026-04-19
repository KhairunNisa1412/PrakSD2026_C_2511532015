package pekan2_2511532015;

public class Musik_2511532015 {
	//Konstruktor 
	private String judulLagu_2015;
	private String penyanyi_2015;
	private int durasi_2015;
	public Musik_2511532015 (String judulLagu_2015, String penyanyi_2015, int durasi_2015){
		this.judulLagu_2015= judulLagu_2015;
		this.penyanyi_2015= penyanyi_2015;
		this.durasi_2015= durasi_2015;
	}
	//Selektor (Getter)
	public String getJudulLagu_2015() {
		return judulLagu_2015;
	}
	public String getPenyanyi_2015() {
		return penyanyi_2015;
	}
	public int getDurasi_2015() {
		return durasi_2015;
	}
	//Mutator (Setter)
	public void setJudulLagu_2015(String judulLagu_2015) {
		this.judulLagu_2015= judulLagu_2015;
	}
	public void setPenyanyi_2015 (String penyanyi_2015) {
		this.penyanyi_2015= penyanyi_2015;
	}
	public void setDurasi_2015 (int durasi_2015) {
		this.durasi_2015= durasi_2015;
	}
	@Override 
	public String toString() {
		return "Judul Lagu: "+judulLagu_2015+ "\n"+
				"Penyanyi: "+penyanyi_2015+ "\n"+
				"Durasi (detik): "+durasi_2015 +"\n";
	}
	
}
