package poly.entity;

public class Author {
	private int MaTG;
	private String TenTacGia;
	private String DiaChi;

	public Author(int maTG, String tenTacGia, String diaChi) {
		super();
		MaTG = maTG;
		TenTacGia = tenTacGia;
		DiaChi = diaChi;
	}

	public Author() {
		super();
	}

	public int getMaTG() {
		return MaTG;
	}

	public void setMaTG(int maTG) {
		MaTG = maTG;
	}

	public String getTenTacGia() {
		return TenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		TenTacGia = tenTacGia;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

}
