package buoi03;
import java.util.Scanner;
import buoi02.Date;
import java.util.ArrayList;
import buoi02.Date;
public class SinhVien {
	//khai bao thuoc tinh
	private String MSSV;
	private String hoTen;
	private Date ngaySinh;
	private int slHP;
	private String tenHP[];  //ArrayList khoi tao 1 ds mang trong
	private String diemHP[]; //private ArrayList<String> tenHP;
	private int soTC[];
	private int MAX=50;
	
	//ham xay dung mac nhien
	public SinhVien() {
		MSSV = new String();
		hoTen= new String();
		ngaySinh = new Date();
		slHP = 0;
		tenHP = new String[MAX]; // tenHP la 1 ArrayList kieu String
		diemHP = new String[MAX];//tenHP = new ArrayList<String>();
		soTC =  new int[MAX];
	}
	
	//ham xay dung sao chep
	public SinhVien(SinhVien sv) { 
		MSSV = new String(sv.MSSV); 
		hoTen = new String(sv.hoTen); 
		ngaySinh = new Date(sv.ngaySinh); 
		slHP=sv.slHP;
		soTC = new int[MAX]; 
		tenHP = new String[MAX]; 
		diemHP = new String[MAX]; //diemHP = new ArrayList<String>(sv.diemHP);
		
		for(int i=0;i<slHP;i++) { 
			tenHP[i]=new String(sv.tenHP[i]);
			diemHP[i]=new String(sv.diemHP[i]);
			soTC[i]=sv.soTC[i]; 
		}
	}
	
	//ham nhap thong tin SV
	public void read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhap MSSV: ");
		MSSV=sc.nextLine();
		System.out.println("\nNhap ho va ten: ");
		hoTen=sc.nextLine();
		System.out.println("\nNhap ngay thang nam sinh: ");
		ngaySinh.readDate();
		System.out.println("\nNhap so hoc phan trong hoc ki nay: ");
		slHP=sc.nextInt();
		for(int i=0;i<slHP;i++) {
			System.out.println("\nNhap thong tin hoc phan thu "+(i+1));
			System.out.print("\nNhap ten hoc phan thu " + (i+1) + ": ");
			tenHP[i] = sc.nextLine();
			System.out.println("\nNhap diem chu hoc phan " + (i+1));
			diemHP[i]=sc.nextLine();
			System.out.println("\nNhap so tin chi cua hoc phan " + (i+1));
			soTC[i]=sc.nextInt();
		}
	}
	//ham in thong tin sinh vien
	public void print() {
		System.out.println("\nHo ten sinh vien: " + hoTen);
		System.out.println("\nMSSV: "+ MSSV);
		System.out.println("\nNgay thang anm sinh: "+ ngaySinh);
		System.out.println("\nSinh vien "+ hoTen +" hoc "+ slHP +"hoc phan trong hoc ki nay.");
		for(int i=0;i<slHP;i++) {
			System.out.println("\nThong tin cua hoc phan thu: "+(i+1));
			System.out.println("\nTen hoc phan "+tenHP[i]);
			System.out.println("\nDiem hoc phan " + tenHP[i]+"la: "+diemHP[i]);
			System.out.println("\nSo tin chi hoc phan "+tenHP[i]+"la: "+soTC[i]);
		}
		
	}
	
	//ham tinh diem trung binh (deim/tong s hp)* so tc
	//ham doi diem chu sang diem so
	public double doi_Diem(String s){
		if(s.equals("A"))	return 4;
		else if(s.equals("B+"))	return 3.5;
		else if(s.equals("B")) return 3;
		else if(s.equals("C+"))	return 2.5;
		else if(s.equals("C")) return 2;
		else if(s.equals("D+")) return 1.5;
		else if(s.equals("D")) return 1;
		else return 0;
	}
	//Hàm tính điểm trung bình tích lũy 
		public double trungBinh() {
			double tong = 0;
			int count = 0;
			String s;
			for(int i = 0;i<slHP;i++) {
				count += soTC[i];
				s = new String(diemHP[i]);
				tong += (soTC[i] * doi_Diem(s));
			}
			return (double)tong/count;
		}
		//ham dang ki them hoc phan
		public void themHP() {
			Scanner sc = new Scanner(System.in);
			String tmp1, tmp2;
			System.out.println("\nNhap ten hoc phan can them: ");
			tmp1=sc.nextLine();
			System.out.println("Nhap diem hoc phan: ");
			tmp2=sc.nextLine();
			slHP++;
		}
		//ham xoa hoc phan
		public void xoaHP() {
			Scanner sc = new Scanner(System.in);
			String tmp;
			System.out.println("Nhap ten hoc phan can xoa: ");
			tmp=sc.nextLine();
			for(int i=0;i<slHP;i++) {
				if(tenHP[i].equals(tmp)) {
					tenHP[i]=tenHP[i+1];
					diemHP[i]=diemHP[i+1];
					slHP--;
				}
			}
		}
		

}