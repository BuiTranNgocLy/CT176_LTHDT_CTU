package DeThi;
import java.util.Scanner;
public class GDichTTe extends GDich {
	//khai bao thuco tinh
	private float dgia;
	private int sluong;
	private char loai;
	private float tgia;
	
	//ham xay dung mac nhien
	public GDichTTe() {
		super();
		dgia=0;
		sluong=0;
		loai='\0';
		tgia=0.0f;
	}
	
	//ham xay dung sao chep
	public GDichTTe(GDichTTe gdtt) {
		super(gdtt);
		dgia=gdtt.dgia;
		sluong=gdtt.sluong;
		loai=gdtt.loai;
		tgia=gdtt.tgia;
	}
	//ham nhap
	void nhap() {
		super.nhap();
		//đối tượng Scanner: nhận dữ liệu từ user & gán dữ liệu vào biễn bằng câu lệnh nextInt
		Scanner sc = new Scanner (System.in); 
		System.out.println("\nNhap don gia tien: ");
		dgia=sc.nextInt();
		System.out.println("\nNhap so luong: ");
		sluong=sc.nextInt();
		System.out.println("\nNhap loai tien te(USD, EURO, VND): ");
		loai=sc.next().charAt(0);
		System.out.println("\nNhap ti gia tien: ");
		tgia=sc.nextFloat();
	}
	//ham in
	void in() {
		super.in();
		System.out.println("\nDon gia tien: " + dgia);
		System.out.println("\nSo luong: " + sluong);
		System.out.println("\nLoai tien: " + loai);
		System.out.println("\nTi gia tien: " + tgia);
	}
	
	public static void main(String[] args) {
		GDichTTe ds[];
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhap so luong giao dich ban muon quan li: ");
		n=sc.nextInt();
		
		ds=new GDichTTe[n];
		
		//cap phat bo nho
		for(int i=0;i<n;i++) ds[i] = new GDichTTe();
		
		for(int i=0;i<n;i++) {
			System.out.println("\nNhap thong tin giao dich cua ban: ");
			ds[i].nhap();
		}
		
		for(int i=0;i<n;i++) {
			System.out.println("\nThong tin giao dich cua ban: ");
			ds[i].in();
		}
	}

}
