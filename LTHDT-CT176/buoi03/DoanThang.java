package buoi03;
import java.util.Scanner;
import java.lang.Math;
import buoi02.Diem;
public class DoanThang {
	//khai bao thuoc tinh
	private Diem d1;
	private Diem d2;
	
	//ham xay dung amc nhien
	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}
	
	//ham xay dung sao chep
	public DoanThang(Diem a, Diem b) {
		d1 = new Diem(a);
		d2 = new Diem(b);
	}
	
	//ham xay dung 4 tham so
	public DoanThang(int a, int b, int c, int d) {
		d1 = new Diem(a,b);
		d2 = new Diem(c,d);
	}
	
	public Diem getdiem_Dau() {
		return d1;
	}
	public Diem getdiem_Cuoi() {
		return d2;
	}
	//Cac Phuong thuc
	//nhap toa do doan thang
	public void read() {
		System.out.println("Nhap toa do diem dau doan thang: ");
		d1.nhap();
		System.out.print("Nhap toa do diem cuoi doan thang: ");
		d2.nhap();
	}
	
	//hien thi
	public String toString() {
		return ("(" + d1 + "," + d2 + ")");
	}
	
	//ham tinh tien
	public void tinhTien(int dx, int dy) {
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}
	
	//ham tinh do dai doan thang
	public double tinhdoDai () {
		return d1.kCach(d2);
	}
	
	//ham tinh goc
	public double tinhGoc() {
		return Math.acos(Math.abs(d2.valueX() - d1.valueX()) / this.tinhdoDai());
	}
}
	
	

