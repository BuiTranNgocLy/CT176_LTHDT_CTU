package buoi02;
import java.util.Scanner;
public class Date {
	//khai bao thuoc tinh
    private int d, m, y;
    //ham xay dung mac nhien
    public Date(){
        d=19;
        m=12;
        y=2001;
    }
    //ham xay dung co tham so
    public Date(int d1, int m1, int y1){
        d=d1;
        m=m1;
        y=y1;
    }
    public Date(Date k){
        d=k.d;
        m=k.m;
        y=k.y;
    }
    //ham kiem tra d, m, y hop le
    public boolean hopLe(){
        int max[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(namnhuan()==true) max[2]=29;
		if( d>0 && m>0 && y>0){
			if(m<13 && d<= max[m])
				return true;
		}
		return false;
    }
    //ham kietm tra nam nhuan
    public boolean namnhuan() {
		if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0))
            return true; 
		return false; 
	}
    //ham nhap thong tin
    public void readDate(){
        Scanner sc = new Scanner(System.in);
        do {
			System.out.print("Nhap ngay: ");
			d = sc.nextInt();
			System.out.print("Nhap thang: ");
			m = sc.nextInt();
			System.out.print("Nhap nam: ");
			y = sc.nextInt();
			if(!hopLe()) {
				System.out.print("\nSai dinh dang, nhap lai\n");
			}
		}while(!hopLe());
    }
    // ham hien thi thong tin
    public void printDate(){
        System.out.print(d+"/" +m+ "/" +y);
    }
    //ham hien thi co kieu tra ve
    public String toString(){
        return (d+"/" +m+ "/" +y);
    }
    //ham tinh ra ngay hom sau
    public Date tomorrow(){
        Date d1 = new Date(d, m, y);
        d1.d+=1;
        if(!d1.hopLe()) {
			d1.d=1;
			d1.m+=1;
			if(d1.hopLe()) {
				d1.m=1;
				d1.y+=1;
			}
		}
		return d1;
    }
    //ham cong 1 Date voi so ngay n nao do
    public Date plusnDate(int n) {
		Date d1 = new Date(d, m, y);
        for(int i=0;i<n;i++) {
			d1 = d1.tomorrow();
		}
		return d1;
	}
    
}
