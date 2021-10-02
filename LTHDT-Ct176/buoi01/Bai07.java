package buoi01;
import java.util.Scanner;
public class Bai07 {
	//ham tach ten
	public static void tachTen(String hoten) {
		String ten = new String(hoten);
		//bo khoang trang o dau va cuoi chuoi
		hoten = hoten.trim();
		//tim vi tri khoang trang cuoi cung trong chuoi
		int i =hoten.lastIndexOf(' ');
		//tra ve chuoi bat dau tu vi tri i+1
		ten= hoten.substring(i+1);
		System.out.print(ten);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter full name: ");
		String hoten = sc.nextLine();
		System.out.print("First name is: ");
		Bai07.tachTen(hoten);
	}

}