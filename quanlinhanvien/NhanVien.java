package quanlinhanvien;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NhanVien {
	String maNV;
	String hoTen;
	double tienLuong;
	
	public NhanVien(String maNV, String hoTen, double tienLuong) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.tienLuong = tienLuong;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public double getTienLuong() {
		return tienLuong;
	}
	public void setTienLuong(double tienLuong) {
		this.tienLuong = tienLuong;
	}
	public NhanVien() {
		maNV = new String ("");
		
	}
	

}