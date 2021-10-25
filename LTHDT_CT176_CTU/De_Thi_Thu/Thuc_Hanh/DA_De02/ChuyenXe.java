package DuLich;
import java.util.Scanner;
public class ChuyenXe {
	//khai bao thuoc tinh
	private int mso;
	private String tentx;
	private String nden;
	private float dthu;
	
	//constructor
	public ChuyenXe() {
		mso=0;
		tentx = new String();
		nden = new String();
		dthu = 0.0f;
	}
	
	//COpy constructor
	public ChuyenXe(ChuyenXe cx) {
		mso=cx.mso;
		tentx = new String(cx.tentx);
		nden = new String(cx.nden);
		dthu=cx.dthu;
	}
	
	//ham nhap
	void read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhap ma so chuyen xe: ");
		mso=sc.nextInt();
		System.out.println("\nNhap ten tai xe: ");
		tentx=sc.nextLine();
		sc.nextLine();
		System.out.println("\nNhap noi den: ");
		nden=sc.nextLine();
		System.out.println("\nDoanh thu la bao nhieu: ");
		dthu=sc.nextFloat();
	}
	
	//ham in
	void print() {
		System.out.println("\nSo xe la: " + mso);
		System.out.println("\nTen tai xe: " + tentx);
		System.out.println("\nNoi den: " + nden);
		System.out.println("\nDoanh thu: " + dthu);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhap thong tin chuyen xe: ");
		ChuyenXe x = new ChuyenXe();
		x.read();
		System.out.println("\nThong tin chuyen xe: ");
		x.print();
		
		System.out.println("\nDanh sach ban co bao nhieu chuyen xe? ");
		int n = sc.nextInt();
		ChuyenXe ds[] = new ChuyenXe[n];
		for(int i=0;i<n;i++) {
			System.out.println("\nNhap thong tin chuyen xe thu "+(i+1));
			ds[i].read();
			System.out.println("\nThong tin chuyen xe thu "+(i+1));
			ds[i].print();
		}
	}

}
