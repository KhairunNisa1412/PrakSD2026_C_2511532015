package pekan7_2511532015;

public class Mahasiswa_2511532015 {
	private String nama_2015;
    private String nim_2015;
    private String prodi_2015;

    //Konstruktor
    public Mahasiswa_2511532015 (String nama_2015, String nim_2015, String prodi_2015){
        this.nama_2015 = nama_2015;
        this.nim_2015 = nim_2015;
        this.prodi_2015 = prodi_2015;
    }
    //getter
    public String getNama_2015() {
        return nama_2015;
    }
    public String getNim_2015(){
        return nim_2015;
    }
    public String getProdi_2015(){
        return prodi_2015;
    }
    //setter
    public void setNama_2015(String nama_2015){
        this.nama_2015 = nama_2015;
    }
    public void setNim_2015(String nim_2015){
        this.nim_2015 = nim_2015;
    }
    public void setProdi_2015(String prodi_2015){
        this.prodi_2015 = prodi_2015;
    }

    @Override
    public String toString(){
        return "Nama: " + nama_2015 + ", NIM: "+nim_2015+", Prodi: "+prodi_2015;
    }
}
