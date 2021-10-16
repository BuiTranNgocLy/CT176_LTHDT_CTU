package buoi03;
import java.util.Scanner;
public class SDSinhVien {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		SinhVien a = new SinhVien();
		System.out.println("Nhap thong tin Sinh Vien ");
		a.nhap();
		a.themHP("LTHDT",3, "A");
		System.out.println("\nThong tin SV vua nhap la: ");
		a.in();
		
		//SinhVien s dang ki them hoc phan
		System.out.println("\nThem hoc phan");
		a.dangkythem_HP();
		System.out.println("\nThong tin sinh vien sau khi cap nhat");
		a.in();
		
		//SinhVien a xoa hoc phan
		System.out.println("Xoa hoc phan");
		a.xoaHP();
		System.out.println("\nThong tin sinh vien sau khi cap nhat");		
	    a.in();
	    
	    //nhap sinh vien theo danh sach
	    System.out.println("\nNhap so luong danh sach sinh vien: ");
	    int n = sc.nextInt();
	    SinhVien ds[]= new SinhVien[n];
	    
	    System.out.println("\nNhap thong tin cac sinh vien trong danh sach: ");
	    SinhVien.read_List(ds);
	    
	    //danh sach sinh vien canh bao hoc vu
	    System.out.println("\nDanh sach sinh vien bi canh bao hoc vu: ");
	    for(int i=0;i<n;i++) {
	    	if(ds[i].diemTb()<1) {
	    		System.out.println("\n " + ds[i] + ds[i].diemTb());
	    	}
	    }
	    
	    //tim kiem sinh vien
	    System.out.println("\nNhap MSSV sinh vien can tim: ");
	    String MSSV = sc.nextLine();
	    for(int i=0;i<n;i++) {
	    	if(ds[i].layMSSV().equals(MSSV)) {
	    		System.out.println("\n " + ds[i] + ds[i].diemTb());
	    	}
	    }
	    
	    //Sap sep sinh vien
	    
	}
}
