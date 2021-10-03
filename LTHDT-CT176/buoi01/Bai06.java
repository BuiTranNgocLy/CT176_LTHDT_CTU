package buoi01;
import java.util.Scanner;
import java.lang.Math;
public class Bai06{
	//ham kiem tr so nguyen to
	public static boolean check_Prime(int n) {
		if (n < 2) {
			return false;
		}
		int count = 0;
		for(int i = 2; i <= (int)Math.sqrt(n); i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
	// ham chuyen sang so nhi phan
	public static void Binary(int n){
		int binary[] = new int[40];
		int count = 0;
		while(n > 0){
			binary[count++] = n%2;
			n = n/2;
		}
		for(int i = count-1; i>=0;i--){
			System.out.print(binary[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a test number: ");
		int n = sc.nextInt();
		if (check_Prime(n)) {
			System.out.print(n + " is prime number.");
		}else {
			System.out.print(n + " isn't prime number.");
		}
		System.out.print("\n" + n + " to binary number: ");
		Bai06.Binary(n);
	}
}