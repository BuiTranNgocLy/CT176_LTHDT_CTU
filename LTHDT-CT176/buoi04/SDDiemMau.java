package buoi04;
import buoi02.Diem;
import java.util.Scanner;
public class SDDiemMau {
/*Cha gan tham chieu den con, nguoc lai khong dc*/
	public static void main(String[] args) {
		DiemMau A = new DiemMau(5,10, "Trang");
		//A.in();
		System.out.println("\nToa do diem mau A:"+A);
		
		DiemMau B = new DiemMau(); //goi ham khong doi so
		
		B.nhap();
		System.out.println("\nToa do diem mau B:"+B);
		B.doiDiem(10, 8);//goi cua lop cha(Diem)
		System.out.println("\nToa do diem mau B sau khi doi (10,8): "+B);
		B.ganMau("Den");
		System.out.println("\nToa do diem mau B sau khi doi mau:"+B);
		
		//nhap vao danh sach gom n Diem va DiemMau
		
		/*Su dung thua ke-tuong thich tham chieu lop cha va con.
		 Tao mang tham chieu cua lop cha de quan li moi doi tuong cua con
		 */
		
		Diem ds[];
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhap so diem can quan li: ");
		int n = sc.nextInt();
		int c;
		
		ds = new Diem[n]; // tao ra mang n tham chieu kieu lop cha tro den NULL
		
		for(int i=0;i<n;i++) {
			System.out.print("Ban muon nhap diem hay diem mau thu " + (i+1) + "\n1. Diem  2.Diem mau");
			c=sc.nextInt();
			if(c==1) ds[i] = new Diem();
			else ds[i] = new DiemMau();
			
			ds[i].nhap(); //ham nhap cua lop nao tuy thuoc vao su lua chon 1 hay 2 => Lien ket dong
		}
		
		//in
		for(int i=0;i<n;i++) {
			System.out.println("\nDiem thu "+(i+1)+ ": ");
			ds[i].in(); //=> Lien ket dong : ket hop nap de voi tham chieu cha con
		}
	}

}
