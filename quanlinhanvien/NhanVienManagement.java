package quanlinhanvien;
import java.text.SimpleDateFormat;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class NhanVienManagement {
	Vector list= new Vector();
	public NhanVienManagement() {
		while(true) {
			System.out.println("quan li nhan vien");
			System.out.println("1.Nhap thong tin nhan vien");
			System.out.println("2.xem thong tin nhan vien");
			System.out.println("---------------------------------");
			int n;
			Scanner key= new Scanner(System.in);
			System.out.println("Moi ban chon chuc nang: ");
			n= key.nextInt();
			switch(n) {
			case 1: 
				NhapTT();
			        break;
			case 2: InTT();
			        break;
			}
		}
	}
	public void NhapTT() {
		int n;
		Scanner key= new Scanner(System.in);
		System.out.print("Nhap so luong nhan vien: ");
		n=Integer.parseInt(key.nextLine());
		for(int i=1;i<=n;i++) {
			System.out.println("Nhap thong tin nhan vien thu "+i);
			System.out.print("ID: ");
			String id=key.nextLine();
			System.out.print("Ten Nhan Vien: ");
			String name=key.nextLine();
			System.out.print("Tien Luong: ");
			long luong=key.nextLong();
			NhanVien NV =new NhanVien(id,name,luong);
			list.add(NV);
		}
		System.out.println("\n-------------------------\n");
	}
	public void InTT() {
		System.out.println("THONG TIN NHAN VIEN");
		Enumeration emp = list.elements();
		int i=1;
		while(emp.hasMoreElements()) {
			NhanVien nh =(NhanVien)emp.nextElement();
			System.out.println("  "+i+".ID: "+nh.getMaNV()+",Ten: "+nh.getHoTen()+",Luong: "+nh.getTienLuong());
			i++;
		}
		System.out.println("\n------------------------------\n");
	}
	public static void main(String []args) {
		new NhanVienManagement();
	}
}
		