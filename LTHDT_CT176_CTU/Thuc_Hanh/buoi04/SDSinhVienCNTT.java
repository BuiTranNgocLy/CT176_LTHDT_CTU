package buoi04;
import java.util.Scanner;
/*Su dung tuong thich cha con(lop cha tham chieu dc den lop con*/
public class SDSinhVienCNTT {
	public static void main(String[] args) {
		SinhVienCNTT ds[];
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nNhap so sinh vien: ");
		n=sc.nextInt();
		
		ds = new SinhVienCNTT[n];
		
		//cap phat bo nho
		for(int i=0;i<n;i++) ds[i] = new SinhVienCNTT();
		
		for(int i=0;i<n;i++) {
			System.out.print("\nNhap thong tin sinh vien thu " +(i+1));
			ds[i].nhap();
		}
		
		for(int i=0;i<n;i++) {
			System.out.print("\nThong tin sinh vien thu " +(i+1) +": "+ds[i]);
		}
		
		//tim tai khoan
		String email;
		sc.nextLine(); //khu bo khoan trang
		System.out.print("\nNhap dia chi email sinh vien can tim: ");
		email =sc.nextLine();
		boolean tim = false;
		for(int i=0;i<n;i++) { // so sanh chuoi dung equals hoac compareToIgnoreCase
			if(ds[i].layEmail().compareToIgnoreCase(email) == 0) {
				System.out.print("\nTai khoan sinh vien vua tim thay: " + ds[i].layTkhoan());
				System.out.println("Ket qua hoc tap: "+ds[i].diemTb());
			
				tim = true;
				break;
			}
		}
		if(tim == false) System.out.println("\nKhong tim thay sinh vien nay!");
	}
}
