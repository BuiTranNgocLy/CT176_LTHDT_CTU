package buoi03;
import java.util.Scanner;

public class SDSinhVien {
	public static void main(String []args) {
		SinhVien a = new SinhVien();
		System.out.println("Nhap thong tin Sinh Vien ");
		a.read();
		a.themHP();
		System.out.println("\nThong tin SV vua nhap la: ");
		a.print();
	}
}
