package DuLich;
import java.util.Scanner;
public class Xe {
	//khai bao thuoc tinh
	private String soxe;
	private String loai;
	private String ngay;
	private char tthai;
	
	//contrustor
	public Xe() {
		soxe = new String();
		loai = new String();
		ngay = new String();
		tthai = 'a';
	}
	
	//construtor copy
	public Xe(Xe x) {
		soxe = new String(x.soxe);
		loai = new String(x.loai);
		ngay = new String(x.ngay);
		tthai = x.tthai;
	}
	
	//ham nhap
	void nhap() {
		Scanner sc = new Scanner (System.in);
		System.out.println("\nNhap so xe: ");
		soxe=sc.nextLine();
		System.out.println("\nNhap loai xe: ");
		loai=sc.nextLine();
		System.out.println("\nNhap ngay dang kiem (dd/mm/yyyy): ");
		ngay=sc.nextLine();
		System.out.println("\nCho phep luu hanh hay khong? ");
		tthai=sc.next().charAt(0);
	}
	
	//ham in
	void in() {
		System.out.println("\nSo xe: " + soxe);
		System.out.println("\nLoai xe: " + loai);
		System.out.println("\nNgay dang kiem xe: " + ngay);
		System.out.println("\nTrang thai luu hanh: " + tthai);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Xe x1 = new Xe();
		System.out.println("\nNhap thong tin xe thu 1: ");
		x1.nhap();
		System.out.println("\nThong tin xe thu 1: ");
		x1.in();
		
		Xe x2 = new Xe(x1);
		System.out.println("\nThong tin xe thu 2 duoc sao chep tu xe 1: ");
		x2.in();
	}

}
