package buoi02;

import java.util.Scanner;
public class SDDate {
	public static void main(String []args){
        Scanner sc = new Scanner(System.in);
		Date newDate = new Date();
		System.out.print("Nhap ngay thang nam\n");
		newDate.readDate();
		System.out.print("Ngay thang nam vua nhap la: "+ newDate.toString());
		newDate = newDate.tomorrow();
		System.out.print("\nNgay hom sau: " + newDate.toString());
		System.out.print("\nNhap so ngay can cong: ");
		int n=sc.nextInt();
		newDate = newDate.plusnDate(n);
		System.out.print("\nSo ngay da cong them " + n + " ngay: " + newDate.toString());
    }
}
