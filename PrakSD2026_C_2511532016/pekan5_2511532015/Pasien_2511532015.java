package pekan5_2511532015;

public class Pasien_2511532015 {
    //atribut
    private String namaPasien_2015;
    private String keluhan_2015;
    private int nomorAntrian_2015;
    private Pasien_2511532015 next_2015;

    //konstruktor
    public Pasien_2511532015 (String namaPasien_2015, String Keluhan_2015, int nomorAntrian_2015){
        this.namaPasien_2015= namaPasien_2015;
        this.keluhan_2015 = keluhan_2015;
        this.nomorAntrian_2015 = nomorAntrian_2015;
        this.next_2015 = null;
    }
    //selektor (getter)
    public String getNamaPasien_2015(){
        return namaPasien_2015;
    }
    public String getKeluhan_2015(){
        return keluhan_2015;
    }
    public int getNomorAntrian_2015(){
        return nomorAntrian_2015;
    }
    public Pasien_2511532015 getNext_2015(){
        return next_2015;
    }
    //mutator (setter)
    public void setNamaPasien_2015(String namaPasien_2015){
        this.namaPasien_2015 = namaPasien_2015;
    }
    public void setKeluhan_2015 (String keluhan_2015eluhan_2015){
        this.keluhan_2015 = keluhan_2015;
    }
    public void setNomorAntrian_2015 (int nomorAntrian_2015){
        this.nomorAntrian_2015 = nomorAntrian_2015;
    }
    public void setNext_2015(Pasien_2511532015 next_2015){
        this.next_2015 = next_2015;
    }
}
