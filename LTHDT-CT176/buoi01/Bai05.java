package buoi01;
import java.util.Scanner;
import java.lang.Math;
public class Bai05{
	public static void ptb1(float a, float b) {
		if(a==0) {
			if(b==0) System.out.print("PT vo so nghiem.");
			else {System.out.print("PT vo nghiem.");}
		}
		else {
			System.out.print("PT co 1 nghiem: " + (-b)/a);
		}
	}
	public static void ptb2(float a, float b, float c) {
		float delta = (float)Math.pow(b, 2) - 4*a*c;
		if(a==0) ptb1(b,c);
		else {
			if(delta > 0) {
				System.out.print("\nPT co 2 nghiem phan biet.");
				System.out.print("\nx1 = "+ (-b + (float)Math.sqrt(delta))/(2*a));
				System.out.print("\nx2 = "+ (-b - (float)Math.sqrt(delta))/(2*a));
			}
			else if(delta < 0) {
				System.out.print("\nPT vo nghiem.");
			}
			else {
				System.out.print("\nPT co nghiem kep x = " + (-b)/(2*a));
			}
		}
	}
	public static void main(String[] args) {
		Bai05 p = new Bai05();
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap he so a= ");
		float a = sc.nextFloat();
		System.out.print("\nNhap he so b= ");
		float b = sc.nextFloat();
		System.out.print("\nNhap he so c= ");
		float c = sc.nextFloat();
		p.ptb2(a, b, c);
		 
	}
}