package buoi04;
import buoi03.SinhVien;
import buoi02.Date;
import java.util.Scanner;
public class SinhVienCNTT extends SinhVien{
	//khai bao thuoc tinh
	private String tkhoan, mkhau, email;
	
	//ham xd mac nhien
	public SinhVienCNTT() {
		super(); //goi ham xd cua cha: SinhVien();
		tkhoan = new String();
		mkhau = new String();
		email = new String();
	}
	
	//xd co doi so
	public SinhVienCNTT(String ms, String hten, Date nsinh, String tk, String mk, String e) {
		super(ms, hten, nsinh); //SinhVien();
		tkhoan = new String(tk);
		mkhau = new String(mk);
		email = new String(e);
	}
	
	//ham xay dung sao chep
	public SinhVienCNTT(SinhVienCNTT svcntt) {
		super(svcntt); 
		tkhoan = new String(svcntt.tkhoan);
		mkhau = new String(svcntt.mkhau);
		email = new String(svcntt.email);
	}
	
	//ham nhap
	public void nhap() {
		super.nhap(); //goi ham nhap cua lop cha(lop SinhVien)
		Scanner sc = new Scanner (System.in);
		System.out.println("\nNhap ten tai khoan:");
		tkhoan = sc.nextLine();
		System.out.println("\nNhap mat khau:");
		mkhau = sc.nextLine();
		System.out.println("\nNhap email:");
		email = sc.nextLine();
	}
	
	//ham in toString
	public String toString() {
		return super.toString() + ", tai khoan: " +tkhoan+ ", email: " + email;
	}
	
	//ham doi mat khau
	public void doiMk(String newpass) {
		mkhau = new String(newpass);
	}
	
	//ham kay dia chi email
	public String layEmail() {
		return email;
	}
	
	//ham lya tai khoan
	public String layTkhoan() {
		return tkhoan;
	}
}
