package buoi02;
import java.util.Scanner;
public class SDPhanSo {
	 public static void main(String []args){
	        Scanner sc = new Scanner(System.in);
	        //tao 2 phan so x, y
	        PhanSo x = new PhanSo();
	        PhanSo y = new PhanSo();
	        System.out.println("\nNhap phan so x");
	        x.read(sc);
	        System.out.println("\nNhap phan so y");
	        y.read(sc);
	        System.out.println("\nx = " + x.toString());
	        System.out.println("\ny = " + y.toString());
	        //hien thi gia tri nghich dao cua ps x
	        System.out.println("\nGia tri nghich dao cua ps la: "+x.gtringhichDao().toString());
	        System.out.println("\nTong phan so: "+x.congPS(y).toString());
	        System.out.print("\nDanh sach ban co bao nhieu phan so: ");
	        int n = sc.nextInt();
	        PhanSo ds[] = new PhanSo[n];
	        System.out.println("\nNhap thong tin cac phan so");
	        PhanSo.read_arr(ds);
	        System.out.println("\nThong tin cac phan so vua nhap");
	        PhanSo.print_arr(ds);
	        System.out.println("\nTong cac phan so vua nhap: "+PhanSo.tongArray(ds));
	        
	    }
}
