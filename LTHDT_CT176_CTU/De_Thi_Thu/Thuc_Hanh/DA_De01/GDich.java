package DeThi;
import java.util.Scanner;
public class GDich {
	//thuoc tinh
	private int mgd;
	private String hten;
	private String ngay;
	private boolean tthai;
	
	//xay dung khong doi so
	public GDich() {
		mgd=0;
		hten = new String();
		ngay = new String();
		tthai = false;
	}
	
	//xay dung sao chep
	public GDich(GDich gd) {
		mgd=gd.mgd;
		hten = new String(gd.hten);
		ngay = new String(gd.ngay);
		tthai = gd.tthai;
	}
	
	//ham nhap
	void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhap ma so giao dich: ");
		mgd=sc.nextInt();
		sc.nextLine(); //xoa bo khoan trang
		System.out.println("\nNhap ho ten nguoi giao dich: ");
		hten=sc.nextLine();
		System.out.println("\nNhap thoi gian giao dich(dd/mm/yyyy): ");
		ngay=sc.nextLine();
	}
	
	//ham in
	void in() {
		System.out.println("\nMa so giao dich: " + mgd);
		System.out.println("\nHo ten nguoi giao dich: " + hten);
		System.out.println("\nThoi giao giao dich: " + ngay);
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GDich gd1 = new GDich();
		gd1.nhap();
		System.out.println("\nThong tin nguoi giao dich 1 la: ");
		gd1.in();
		
		GDich gd2 = new GDich(gd1);
		System.out.println("\nThong tin gd2 duoc sao chep tu gd1: ");
		gd2.in();
	
	}
}