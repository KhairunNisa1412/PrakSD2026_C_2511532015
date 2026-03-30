package pekan7_2511532015;

public class Akun {
	//inisialisasi
	private String username, password, email;
	private int pinAngka;
	
	//setter
	public void setUsername (String username) {
		this.username=username;
	}
	public void setPassword (String password) {
		this.password=password;
	}
	public void setEmail (String email) {
		this.email=email;
	}
	public void setPinAnngka (int pinAngka) {
		this.pinAngka=pinAngka;
	}
	//method validasi
	public boolean isPasswordValid() {
		return password.length() >=8;
	}
	public boolean isEmailValid() {
		return email.contains("@")&& email.contains(".");
	}
	//getter
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public int getPinAngka() {
		return pinAngka;
	}

}
