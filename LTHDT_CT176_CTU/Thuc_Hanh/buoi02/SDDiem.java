package buoi02;

public class SDDiem {
	 public static void main(String[] args) {
			Diem a = new Diem(3, 4);
			System.out.print("Diem a vua khoi tao\n");
			System.out.print("A = "); 
	        a.in();
	        Diem b = new Diem();
			System.out.print("\nNhap diem b\n");
			b.nhap();
			System.out.print("Diem b vua nhap\n");
	        System.out.print("B = " + b.toString());

			Diem c = new Diem(-b.valueX(), -b.valueY());
			System.out.print("\nDiem c doi xung b qua O\n");
			System.out.print("C= " + c.toString());		
			System.out.print("\nKhoang cach tu diem den goc toa do: " + b.kCach());
			System.out.print("\nKhoang cah tu a den b: " + b.kCach(a));
	  }
}


