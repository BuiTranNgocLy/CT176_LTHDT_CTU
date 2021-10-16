package buoi02;
import java.util.Scanner;
public class Diem {
	//khai bao thuoc tinh
	private int x, y;
	
	//ham xay dung mac nhien
	public Diem() {
		x=0;
		y=0;
	}
	//ham xay dung co 2 tham so
	public Diem(int a, int b) {
		x=a; 
		y=b;
	}
	//ham xay dung sao chep
	public Diem(Diem k) {
		x=k.x;
		y=k.y;
	}
	 //ham nhap
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap hoanh do x= ");
        x=sc.nextInt();
        System.out.print("Nhap tung do y= ");
        y=sc.nextInt();
    }
    //ham hien thi
    public void in(){
        System.out.print("("+x+","+y+")");
    }
    //ham in co kieu tra ve
    public String toString(){
        return ("("+x+","+y+")");
    }

    //lay gtri x
    public int valueX() {
		return x;
	}
    //lay gtri y
	public int valueY() {
		return y;
	}
    //kCach tu diem den goc toa do
	public float kCach () {// nap chong: cung ten khac tham so
		return (float)Math.sqrt(Math.pow(x, 2) + Math.pow(y,  2));
	}
    //kCach tu 1 diem den 1 diem khac
	public float kCach(Diem a) {
		return (float)Math.sqrt(Math.pow(x-a.x, 2) + Math.pow(y-a.y,  2));
	}
    //tinh tien
	public void doiDiem(int dx, int dy) {
		x +=dx;
		y +=dy;
	}
}
