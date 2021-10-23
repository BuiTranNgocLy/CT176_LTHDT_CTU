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
	//ham tinh tien
	public boolean thanhTien() {
		float Tien = sluong * dgia * tgia;
		if((Tien >100000) && loai == 'V') {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nDanh sach ban co bao nhieu doi tuong: ");
		int n = sc.nextInt();
		sc.nextLine();
		int c;
		GDich ds[] = new GDich[n];
		for(int i=0;i<n;i++) {
			System.out.println("\nBan muon Giao dich hay Giao dich tien te thu " +(i+1)+"\n1. Giao dich\n2. Giao dich tien te");
			c=sc.nextInt();
			if(c==1) ds[i] = new GDich();
			else ds[i] = new GDichTTe();
			
			ds[i].nhap();
		}
		
		for(int i=0;i<n;i++) {
			System.out.println("\nThong tin doi tuong thu: "+(i+1));
			ds[i].in();
		}
		
		for(int i=0;i<n;i++) {
			if((ds[i].getTthai() == true) && (ds[i].thanhTien())) {
				System.out.println("\nMa giao dich cua doi tuong thu "+(i+1)+": "+ds[i].getmgd());
			}
		}
	}
}
