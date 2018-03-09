package poly.entity;

public class Book {
	private int MaSach;
	private String TenSach;
	private int Gia;
	private int SoLuong;
	private int MaTG;

	public Book(int maSach, String tenSach, int gia, int soLuong, int maTG) {
		super();
		MaSach = maSach;
		TenSach = tenSach;
		Gia = gia;
		SoLuong = soLuong;
		MaTG = maTG;
	}

	public Book() {
		super();
	}

	public int getMaSach() {
		return MaSach;
	}

	public void setMaSach(int maSach) {
		MaSach = maSach;
	}

	public String getTenSach() {
		return TenSach;
	}

	public void setTenSach(String tenSach) {
		TenSach = tenSach;
	}

	public int getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}

	public int getMaTG() {
		return MaTG;
	}

	public void setMaTG(int maTG) {
		MaTG = maTG;
	}

	public int getGia() {
		return Gia;
	}

	public void setGia(int gia) {
		Gia = gia;
	}

}
