package buoi04;
import buoi02.Diem;
import java.util.Scanner;
//chuong 3: QH bao gom ( diem mau bao gom diem)
//public class DiemMau{
//	private Diem d;
//	private String color;
//}
/*Can xem xet moi QH de khai bao cau truc 1 lop*/
/*Diem Mau co tat ca thanh [han cua lop Diem*/
/*Diem mau nhap in toString nap de*/
//chuong 4: QH thua ke (diem mau la diem)
public class DiemMau extends Diem {
	//thuoc tinh bo sung
	private String color;
	
	//ham xay dung
	public DiemMau() {
		super(); // ham xay dung con goi ham xay dung cua cha
		color = new String();
	}
	
	//ham xd co doi so
	public DiemMau(int x1, int y1, String m1) {
		super(x1, y1);
		color = new String(m1);
	}
	
	//ham xd sao chep
	public DiemMau(DiemMau dm) { //dm(x,y,mau)
		super( (Diem) (dm) ); //ep kieu diem -> diem mau
		color = new String(dm.color);
	}
	
	//ham nhap
	public void nhap() { //ham nhap cua lop con diem mau trung vs nhap cua lop cha Diem
		super.nhap(); //Deim.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhap mau:");
		color = sc.nextLine();
	}
	
	//ham in
	public void in() {
		super.in(); //Diem.in();
		System.out.println(", voi mau: " + color);
	}
	
	//toString
	public String toString() {
		return super.toString() + (", voi mau: " + color);
	}
	
	//ham gan mau
	public void ganMau(String mau1) {
		color = new String (mau1);
	}
	
}
