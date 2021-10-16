package buoi04;
import java.util.Scanner;

public class ConVat {
	//khai bao thuoc tinh
	private String giong;
	private String mau;
	private float cannang;
	
	//ham xay dung mac nhien
	public ConVat(){
		giong = new String();
		mau = new String();
		cannang = 0.0f;
	}
	
	//ham xay dung sao chep
	public ConVat(ConVat cv){
		giong = new String(cv.giong);
		mau = new String(cv.mau);
		cannang = cv.cannang;
	}
	
	//ham nhap thong tin
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap ten giong: ");
		giong = sc.nextLine();
		System.out.print("\nNhap mau: ");
		mau = sc.nextLine();
		System.out.print("\nNhap can nang: ");
		cannang = Float.parseFloat(sc.nextLine());
	}
	
	//ham in
	public void in() {
		System.out.print("Ten giong: " + giong);
		System.out.print("\nMau: " + mau);
		System.out.print("\nCan nang: " + cannang);
		System.out.print("\nTieng keu: ");
	}
	
	//ham tieng keu
	public void keu() {
		Scanner sc = new Scanner(System.in);
		int c=sc.nextInt();
		if(c==1) System.out.println("\nBooooo...Booooo....");
		else if(c==2) System.out.println("\nEccccc...Eccccc....");
		else if (c==3) System.out.println("\nBeeeee...Beeeee....");
		else System.out.println("\nOooooo...Oooooo....");
	}
	//public abstract void keu();
}
