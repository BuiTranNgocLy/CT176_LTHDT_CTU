package QLThongTin;
import java.util.Scanner;
public class CThu extends CNguoi {
	//khai bao thuoc tinh
	private int so;
	private String vtri;
	private long bthang;
	private String mua;
	private String clbo;
	
	//ham xay dung mac nhien
	public CThu() {
		super();
		so= 10;
		vtri = new String();
		bthang = 10;
		mua = new String();
		clbo = new String();
	}
	
	//ham xay dung sao chep
	public CThu(CThu ct) {
		super(ct);
		so=ct.so;
		vtri = new String(ct.vtri);
		bthang = ct.bthang;
		mua = new String(ct.mua);
		clbo = new String(ct.clbo);
	}
	
	//ham nhap
	void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhap vao so ao thi dau: ");
		so = Integer.parseInt(sc.nextLine());
		System.out.println("\nNhap vi tri thi dau: ");
		vtri=sc.nextLine();
		System.out.println("\nNhap so ban thang: ");
		bthang=Long.parseLong(sc.nextLine());
		System.out.println("\nNhap mua giai: ");
		mua=sc.nextLine();
		System.out.println("\nNhap ten cau lac bo: ");
		clbo=sc.nextLine();
	}
	
	//ham in
	void in() {
		super.in();
		System.out.println("\nSo ao thi dau: " + so);
		System.out.println("\nVi tri: "+ vtri);
		System.out.println("\nSo ban thang: "+bthang);
		System.out.println("\nMua giai: "+ mua);
		System.out.println("\nTen cau lac bo: "+ clbo);
	}
	
	//ham tinh tien luong duoc huong
	public long tienLuong(){
		long luongcoban = 7000000;
		long luongtangthem = 0;
		if(vtri.equals("thu mon")) {
			luongtangthem = 3000000;
		}
		else if(vtri.equals("hau ve")) {
			luongtangthem = 4000000;
		}
		else if(vtri.equals("trung ve")) {
			luongtangthem = 4500000;
		}
		else if(vtri.equals("tien ve")) {
			luongtangthem = 5000000;
		}
		else if(vtri.equals("tien dao")) {
			luongtangthem = 7000000;
		}
		long luongthuong = bthang * 500000;
		long tongtienluong = luongcoban + luongtangthem + luongthuong;
		long luongnhanduoc = tongtienluong - ((tongtienluong*10)/100);
		return luongnhanduoc;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nDanh sach ban co bao nhieu doi tuong: ");
		int n = sc.nextInt();
		sc.nextLine();
		int c;
		CNguoi ds[] = new CNguoi[n];
		for(int i=0;i<n;i++) {
			System.out.println("\nBan chon doi tuong Con Nguoi hay Cau Thu thu " +(i+1)+"\n1. Con nguoi\n2. Cau Thu");
			c=sc.nextInt();
			if(c==1) ds[i] = new CNguoi();
			else ds[i] = new CThu();
			
			ds[i].nhap();
		}
		
		for(int i=0;i<n;i++) {
			System.out.println("\nThong tin doi tuong thu "+(i+1));
			ds[i].in();
		}
		for(int i=0;i<n;i++) {
			if(ds[i].tienLuong() != -1) {
				System.out.print("\nDanh sach tien luong cua cac cau thu: ");
				System.out.print("\nHo va ten: "+ds[i].getlayten()+", nhan duoc: "+ds[i].tienLuong());
			}
		}
	}
}
