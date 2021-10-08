package buoi03;
import java.util.Scanner;
import java.lang.Math;
public class Gach {
	//khai bao thuoc tinh
	private String maso;
	private String mau;
	private int soluong;
	private int dai;
	private int ngang;
	private long gia;
	
	//phuong thuc
	//ham xay dung mac nhien (Comstruction)
	public Gach() {
		maso = new String();
		mau = new String();
		soluong=0;
		dai=0;
		ngang=0;
		gia=0;
	}
	//ham xay dung sao chep(Copy Construction)
	public Gach(Gach k) {
		maso=new String(k.maso);
		mau=new String (k.mau);
		soluong=k.soluong;
		dai=k.dai;
		ngang=k.ngang;
		gia=k.gia;
	}
	//ham nhap thong tin 1 hop gach
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so hop gach: ");
		maso=sc.nextLine();
		System.out.println("\nNhap mau gach: ");
		mau=sc.nextLine();
		System.out.println("\nNhap so luong gach trong 1 hop: ");
		soluong=sc.nextInt();
		System.out.println("\nNhap chieu dai vien gach: ");
		dai=sc.nextInt();
		System.out.print("\nNhap chieu ngang vien gach: ");
		ngang=sc.nextInt();
		System.out.print("\nNhap gia hop gach: ");
		gia=sc.nextInt();
	}
	//ham hien thi thong tin
	public void print() {
		System.out.println("Thong tin hop gach:");
		System.out.print("\nMa so hop gach: " + maso);
		System.out.print("\nMau hop gach: " + mau);
		System.out.print("\nSo luong gach: " + soluong);
		System.out.print("\nChieu dai gach " + dai);
		System.out.print("\nChieu ngang gach " + ngang);
		System.out.print("\nGia hop gach: " + gia);
	}
	//ham tinh gia ban 1 vien gach(cao hon hop 20%)
	public double giaBanLe() {
		return (float) gia/(soluong*1.2);
	}
	//ham dien tich nen toi da
	public int dien_tichNTD() {
		return soluong * (dai * ngang);
	}
	
	//Ham tinh so luong gach can
	//dai dien tich can lot / dai vien gach = sl gach chieu dai
	//ngang dien tich can lot / ngang gach = sl ngang
	// Tong so gach can lot = sl gach dai * sl gach ngang
	//Tong so hop gach = Tong so gach can / sl gach moi hop
	public int slHop(int D, int N) {
		double svd = Math.ceil((double)D / dai);
		double svn = Math.ceil((double)N / ngang);
		return (int)Math.ceil((svd * svn) / soluong);
	}
	public long getGia() {
		return gia;
	}
}
