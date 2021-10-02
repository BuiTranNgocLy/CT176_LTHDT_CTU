package buoi01;
import java.util.Scanner;
public class Bai04{
	public int nhap() {
		Scanner sc = new Scanner(System.in);
		int n;
		String s;
		do {
			System.out.print("Nhap vao 1 so nguyen");
			s=sc.nextLine();
			try {n=Integer.parseInt(s);}
			catch(NumberFormatException e) {
				n = Integer.MAX_VALUE;
				System.out.print("sai dinh dang nhap lai");
			}
		}while(n==Integer.MAX_VALUE);
		return n;

	}
	public static void main(String agrs[]) {
		Bai04 t = new Bai04();
		int a = t.nhap();
		int b = t. nhap();
		System.out.print("tong = "+(a+b));
	}

}