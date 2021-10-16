package buoi03;
import java.util.Scanner;
public class SDGach {
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhap so loai gach: ");
		n=sc.nextInt();
		
		Gach ds [] = new Gach[n];
		for(int i=0;i<n;i++) {
			ds[i] = new Gach();
			System.out.println("Nhap thong tin loai gach thu " + (i+1));
			ds[i].nhap();
		}
		
		for(int i=0;i<n;i++) {
			System.out.println("\nThong tin loai gach thu: " + (i+1));
			ds[i].print();
		}
		
		Gach g = ds[0];
		//ham chi phi lot thap nhat
		double min_cp = (double)ds[0].getGia() / ds[0].dien_tichNTD();
		for(int i=0;i<n;i++) {
			if((double)ds[i].getGia() / ds[i].dien_tichNTD() < min_cp) {
				min_cp = (double)ds[i].getGia() / ds[i].dien_tichNTD();
				g = ds[i];
			}
		}
		System.out.println("\nLoai gach co chi phi lot thap nhat la: ");
		g.print();
		
		//chi phi mua
		for(int i=0; i<n;i++) {
			double cp = ds[i].slHop(2000, 500) * ds[i].getGia();
			System.out.println("\nChi phi lot cua loai gach thu " + (i+1) + "la: "+ cp);
			
		}
	}
}
