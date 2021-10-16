package buoi03;
import buoi02.Diem;
import java.util.Scanner;
public class SDDoanThang {
	public static void main(String[] args) {
		Diem A = new Diem (2,5);
		Diem B = new Diem (20, 35);
		DoanThang AB = new DoanThang(A, B);
		AB.tinhTien(5, 3);
		
		DoanThang CD = new DoanThang();
		CD.read();
		System.out.println("Do dai doan thang CD la: " + CD.tinhdoDai());
		
		System.out.println("Goc giua CD & truc hoanh la: " + CD.tinhGoc());
	}
}
