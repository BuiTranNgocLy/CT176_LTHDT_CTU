package buoi03;
import buoi02.Date;
import java.util.Scanner;

public class SinhVien{

	//khai bao thuoc tinh
	private String MSSV;
	private String hoTen;
	private Date ngaySinh;
	private int slHP;
	private String tenHP[];
	private String diemHP[];
	private int soTC[];
	private final int MAX = 50;

	//ham xay dung mac nhien
	public SinhVien(){
		MSSV = new String();
		hoTen = new String();
		ngaySinh = new Date();
		slHP = 0;
		tenHP = new String[MAX];
		diemHP = new String[MAX];
		soTC = new int[MAX];
	}
	
	//ham xd 3 doi so lam bai SVCNTT
	public SinhVien(String ms, String hten, Date nsinh){
		MSSV = new String(ms);
		hoTen = new String(hten);
		ngaySinh = new Date(nsinh);
		slHP = 0;
		tenHP = new String[MAX];
		diemHP = new String[MAX];
		soTC = new int[MAX];
	}
	//ham xay dung sao chep
	public SinhVien(SinhVien sv){
		MSSV = new String(sv.MSSV);
		hoTen = new String(sv.hoTen);
		ngaySinh = new Date(sv.ngaySinh);
		slHP = sv.slHP;
		tenHP = new String[MAX];
		diemHP = new String[MAX];
		soTC = new int[MAX];

		for(int i=0;i<sv.slHP;i++){
			tenHP[i] = new String(sv.tenHP[i]);
			diemHP[i] = new String(sv.diemHP[i]);
			soTC[i] = sv.soTC[i];
		}

	}	

	//Hàm nhập thông tin sinh viên
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap mssv: ");
		MSSV = sc.nextLine();
		System.out.print("\nNhap ho va ten: ");
		hoTen = sc.nextLine();
		System.out.println("\nNhap ngay thang nam sinh: ");
		ngaySinh.readDate();
		System.out.print("\nNhap so hoc phan sinh vien "+hoTen+" hoc trong hoc ki nay: ");
		slHP = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<slHP;i++){
			System.out.print("\nNhap thong tin hoc phan thu " + (i+1));
			System.out.print("\nNhap ten hoc phan thu " + (i+1) + ": ");
			tenHP[i] = sc.nextLine();
			System.out.print("\nNhap diem chu cua hoc phan thu " + tenHP[i] + ": ");
			diemHP[i] = sc.nextLine();
			System.out.print("\nNhap so tin chi cua hoc phan " + tenHP[i] + ": ");
			soTC[i] = check_exception(sc);
		}

	}
	//ham nhap thong tin danh sach sinh vien
	public static void read_List(SinhVien ds[]){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<ds.length;i++){
			System.out.println("\nNhap thong tin sinh vien thu " + (i+1));
			ds[i] = new SinhVien();
			ds[i].nhap();
		}
	}
	//ham in thông tin sinh viên
	public void in(){
		System.out.print("\nTen sinh vien: "+hoTen);
		System.out.print("\nMSSV: "+MSSV);
		System.out.print("\nNgay thang nam sinh: "+ngaySinh.toString());
		System.out.print("\nHoc ki nay sinh vien " + hoTen + " hoc " + slHP + " hoc phan");
		for(int i=0;i<slHP;i++){
			System.out.print("\nThong tin hoc phan thu " + (i+1));
			System.out.print("\nTen hoc phan: "+tenHP[i]);
			System.out.print("\nDiem hoc phan " + tenHP[i] + ": " + diemHP[i]);
			System.out.print("\nSo tin chi hoc phan " + tenHP[i] + ": " + soTC[i]);
		}
	}
	
	public String toString() {
		String s = MSSV +"," + hoTen +","+ ngaySinh.toString() + "[";
		
		for(int i=0;i<slHP;i++) {
			s+= tenHP[i] + ":" +diemHP[i] + ";";
		}
		s+="]";
		return s;
	}
	//ham in thong tin danh sach sinh vien
	public static void print_List(SinhVien ds[]){
		for(int i=0;i<ds.length;i++){
			System.out.println("\nThong tin sinh vien thu " + (i+1));
			ds[i].in();  
		}
	}
	//Hàm xử lí ngoại lệ
	public static int check_exception(Scanner sc){
		String s;
		int n;
		do{	
			s = sc.nextLine();
			try{n = Integer.parseInt(s);}
			catch(NumberFormatException e){
				n = Integer.MAX_VALUE;
				System.out.print("\nSai dinh dang, nhap lai: ");
			}
		}while(n==Integer.MAX_VALUE);
		return n;
	}
//	//Them hoc phan
	public void themHP(String ten, int stc, String diem){
			tenHP[slHP] = new String(ten);
			diemHP[slHP] = new String(diem);
			soTC[slHP] = stc;
			slHP++;
	}

//	//Them n hoc phan
	public void dangkythem_HP(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so luong hoc phan muon dang ky them: ");
		int n = Integer.parseInt(sc.nextLine());
		int k = slHP;
		slHP = slHP + n;
		for (int i = k; i < slHP; i++){
			System.out.print("Nhap hoc phan thu " + (i+1) + " can dang ki: ");
			tenHP[i] = sc.nextLine();
			System.out.print("\nNhap diem chu cua hoc phan " + tenHP[i] + " : ");
			diemHP[i] = sc.nextLine();
			System.out.print("\nNhap STC cua hoc phan " + tenHP[i] + " : ");
			soTC[i] = Integer.parseInt(sc.nextLine());
		}
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

	//Hàm đổi điểm chữ sang điểm số (theo thang điểm 4)
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
	public double diemTb() {
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
		
	//ham lay ten
	public String layTen() {
		String layTen = new String(hoTen);
		layTen = layTen.trim();
		return layTen.substring(layTen.lastIndexOf(" ")+1);
	}
	//ham lay ho ten
	public String lay_hoTen() {
		return hoTen;
	}
	//ham lay mssv
	public String layMSSV() {
		return MSSV;
	}
}	