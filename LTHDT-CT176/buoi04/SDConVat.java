package buoi04;
import java.util.Scanner;
public class SDConVat {

	public static void main(String[] args) {
		ConVat ds[];
		Scanner sc = new Scanner (System.in);
		int c;
		System.out.println("\nNhap so con vat can quan li: ");
		int n = sc.nextInt();
		ds = new ConVat[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("\nBan muon nhap thong tin: \n1.Bo \n2.Heo \n3.De \n4.Ga");
			c=sc.nextInt();
			if(c==1) ds[i]= new Bo();
			else if(c==2) ds[i] = new Heo();
			else if (c==3) ds[i] = new De();
			else ds[i] = new Ga();
			ds[i].nhap();
			
		}
		
		for(int i=0;i<n;i++){
			System.out.println("\nThong tin dong vat thu "+(i+1));
			ds[i].in();
			ds[i].keu();
		}
		

		
	}

}
