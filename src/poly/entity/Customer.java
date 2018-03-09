package poly.entity;

public class Customer {
	private String Makh;
	private String Matkhau;
	private String Hovaten;
	private String Email;
	private String Dienthoai;
	public Customer() {
		
	}
	public Customer(String makh, String matkhau, String hovaten, String email, String dienthoai) {
		Makh = makh;
		Matkhau = matkhau;
		Hovaten = hovaten;
		Email = email;
		Dienthoai = dienthoai;
	}
	public String getMakh() {
		return Makh;
	}
	public void setMakh(String makh) {
		Makh = makh;
	}
	public String getMatkhau() {
		return Matkhau;
	}
	public void setMatkhau(String matkhau) {
		Matkhau = matkhau;
	}
	public String getHovaten() {
		return Hovaten;
	}
	public void setHovaten(String hovaten) {
		Hovaten = hovaten;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDienthoai() {
		return Dienthoai;
	}
	public void setDienthoai(String dienthoai) {
		Dienthoai = dienthoai;
	}

	
}
