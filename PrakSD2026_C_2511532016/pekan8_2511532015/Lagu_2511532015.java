package pekan8_2511532015;

public class Lagu_2511532015 {
    private String judul_2015;
    private String penyanyi_2015;
    private int durasi_2015;

    //konstruktor
    public Lagu_2511532015 (String judul_2015, String penyanyi_2015, int durasi_2015){
        this.judul_2015 = judul_2015;
        this.penyanyi_2015 = penyanyi_2015;
        this.durasi_2015 = durasi_2015;
    }
    //getter
    public String getJudul_2015(){
        return judul_2015;
    }
    public String getPenyanyi_2015(){
        return penyanyi_2015;
    }
    public int getDurasi_2015(){
        return durasi_2015;
    }
    //setter
    public void setJudul_2015(String judul_2015){
        this.judul_2015 = judul_2015;
    }
    public void setPenyanyi_2015(String penyanyi_2015){
        this.penyanyi_2015 = penyanyi_2015;
    }
    public void setDurasi_2015(int durasi_2015){
        this.durasi_2015 = durasi_2015;
    }
    @Override
    public String toString() {
        return judul_2015 + " - " + durasi_2015 + " detik";
    }
}
