package QLThongTin;
import java.util.Scanner;
public class CNguoi {
	
	//khai bao thuoc tinh
	private String id;
	private String hten;
	private String ngay;
	private char phai;
	
	//ham xay dung khong doi so
	public CNguoi() {
		id = new String();
		hten = new String();
		ngay = new String();
		phai = 'a';
	}
	
	//ham xay dung sao chep
	public CNguoi(CNguoi cn) {
		id = new String(cn.id);
		hten = new String(cn.id);
		ngay = new String(cn.id);
		phai=cn.phai;
	}
	
	//ham nhap
	void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhap CMND: ");
		id=sc.nextLine();
		System.out.println("\nNhap ho va ten: ");
		hten=sc.nextLine();
		System.out.println("\nNhap ngay thang nam sinh(dd/mm/yyyy): ");
		ngay=sc.nextLine();
		System.out.println("\nNhap gioi tinh: ");
		phai=sc.next().charAt(1);
	}
	
	//ham in
	void in() {
		System.out.println("\nHo va ten: " +hten);
		System.out.println("\nSo CMND: " + id);
		System.out.println("\nNgay thang nam sinh: " + ngay);
		System.out.println("\nGioi tinh: "+phai);
	}
	//ham tinh tien luong duoc huong
		public long tienLuong(){
			return -1; 
		}
	//ham lay ten
		public String getlayten() {
			return hten;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CNguoi cn1 = new CNguoi();
		System.out.println("\nNhap thong tin con nguoi thu 1: ");
		cn1.nhap();
		System.out.println("\nThong tin nguoi thu 1: ");
		cn1.in();
		
		CNguoi cn2 = new CNguoi(cn1);
		System.out.println("\nThong tin nguoi thu 2 duoc sao chep tu nguoi thu 1: ");
		cn2.in();
	}

}
