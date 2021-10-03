package buoi02;
import java.util.Scanner;
import java.lang.Math;
public class SDPhanSo {
	 public static void main(String []args){
	        Scanner sc = new Scanner(System.in);
	        //tao 2 phan so 
	        PhanSo a = new PhanSo();
	        PhanSo b = new PhanSo();
	        PhanSo c = new PhanSo(10,10);
	        PhanSo d = new PhanSo(c);
	        PhanSo kq = new PhanSo();
	        
	        System.out.println("Nhap phan so a");
			a.read(sc);
			System.out.println("\nNhap phan so b");
			b.read(sc);
			
	        System.out.println("Nhap phan so a" + a.toString());
	        System.out.println("Nhap phan so b" + b.toString());
	       
	        System.out.println("Gia tri nghich dao cua phan so a: " + a.gtringhichDao().toString());
	     
	        System.out.println("\nTong 2 phan so: " + a.congPs(b).toString());
	        System.out.println("\nHieu 2 phan so: " + a.truPs(b).toString());
	        System.out.println("\nTich 2 phan so: " + a.nhanPs(b).toString());
	        System.out.println("\nThuong 2 phan so: " + a.chiaPs(b).toString());
	        
	        //danh sach phan so
	        System.out.println("Danh sach cua ban co bao nhieu phan so: ");
	        int n=sc.nextInt();
	        //nhap danh sach PS
	        PhanSo ds[]=new PhanSo[n];
	      
	        for(int i=0;i<n; i++) {
	        	System.out.println("\nNhap phan so thu " + (i+1));
	        	ds[i]= new PhanSo();
	        	ds[i].read(sc);
	        }
	        //in ds PS
	        System.out.println("\nDanh sach phan so ban vua nhap");
	        for(int i=0;i<n;i++) {
	        	System.out.print("\nPhan so thu "+(i+1)+"\n"+ ds[i].toString());
	        }
	        //tong ds PS
	        //double total = ds[0].gtriThuc();
	        double sum=0;
	        for(int i=0;i<ds.length;i++) {
	        	sum+=ds[i].gtriThuc();
	        }
	        System.out.println("\nTong "+n+" phan so ban vua nhap: "+ sum);
	 }
}