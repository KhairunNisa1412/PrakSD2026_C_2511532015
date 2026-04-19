package pekan3_2511532015;

public class Website_2511532015 {
	private String judul_2015;
	private String url_2015;

	public Website_2511532015(String judulInput, String urlInput) {
		this.judul_2015 = judulInput;
	    this.url_2015 = urlInput;
	}
	public String getJudul_2015() {
		return judul_2015;
	}
    public String getUrl_2015() {
    	return url_2015;
	}
    public void setJudul_2015(String judulInput) {
        this.judul_2015 = judulInput;
    }
    public void setUrl_2015(String urlInput) {
        this.url_2015 = urlInput;
    }
    @Override
    public String toString() {
    	return "Judul: " + judul_2015 + "\n" +
    			"URL   : " + url_2015;
	}
}

