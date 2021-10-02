package buoi02;
import java.util.Scanner;
public class PhanSo {
	//khai bao thuoc tinh
    private int tuSo;
    private int mauSo;
    //ham xay dung mac nhien
    public PhanSo(){
        tuSo = 19;
        mauSo = 12;
    }
    //ham xay dung 2 doi so
    public PhanSo(int a, int b){
        tuSo = a;
        mauSo = b;
    }
    //ham xay dung sao chep
    public PhanSo(PhanSo k){
        tuSo = k.tuSo;
        mauSo = k.mauSo;
    }
    //ham nhap gia tri phan so
    public void read(Scanner sc){
        do{
            System.out.print("\nNhap tu so: ");
            tuSo=sc.nextInt();
            System.out.print("\nNhap mau so: ");;
            mauSo=sc.nextInt();
            if(mauSo==0) System.out.print("Sai dinh dang, nhap lai");
        }while(mauSo==0);
    }
    //ham hien thi
    public void print(){
        if(tuSo==0) System.out.println(0);
        else if(mauSo==1) System.out.println(tuSo);
            else if(tuSo==mauSo) System.out.println(1);
                else if(tuSo*mauSo<0) System.out.println((-tuSo)+"/"+Math.abs(mauSo));
                    else System.out.println(Math.abs(tuSo)+"/"+Math.abs(mauSo));
    }
    //ham in co kieu tra ve
    public String toString(){
        String s = Integer.toString(tuSo);
        if(tuSo==0) return "0";
        else if(mauSo==1) return s; 
            else if(tuSo==mauSo) return "1";
                else if(tuSo*mauSo<0) return((-tuSo)+"/"+Math.abs(mauSo));
                    else return(Math.abs(tuSo)+"/"+Math.abs(mauSo));
    }
    //ham nghich dao phan so (lam thay doi gia tri phan so)
    public void nghichDao(){
        //swap
        int temp = tuSo;
        tuSo = mauSo;
        mauSo = temp;
    }
    //ham tinh gia tri phan so nghich dao(tao ra ket qua la 1 phan so de tra ve)
    public PhanSo gtringhichDao(){
    	PhanSo s = new PhanSo(mauSo, tuSo);
        return s.rutGon();
    }
    //ham tinh gia tri thuc 1/2 = 0.5
    public double get_valuePs(){
        return (double)tuSo / mauSo; //ep kieu 
    }
    //ham so sanh
    public boolean soSanh(PhanSo s){
        //so sanh gia tri thuc
        return get_valuePs() > s.get_valuePs();
    }
    //cong 2 phan so
    public PhanSo congPS(PhanSo b){
    	PhanSo kq = new PhanSo();
        kq.tuSo = tuSo*b.mauSo + mauSo*b.tuSo;
        kq.mauSo = mauSo * b.mauSo;
        //goi ham rut gon phan so
        return kq.rutGon();
    }
    //ham cong phan so voi 1 so nguyen
    public PhanSo congSonguyen(int n){
    	PhanSo s = new PhanSo(n,1);
        return congPS(s);
    } 
    //ham tim UCLN
    private int UCLN(int a, int b){
        int temp;
        while(b!=0){
            temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    //ham toi gian phan so(k thay doi gia tri)
    public PhanSo rutGon(){
    	PhanSo kq = new PhanSo(tuSo, mauSo);
        int x = UCLN(tuSo, mauSo);
        kq.tuSo = kq.tuSo/x;
        kq.mauSo = kq.mauSo/x;
        return kq;
    }
    //ham nhap mang phan so
    public static void read_arr(PhanSo ds[]){
    Scanner sc = new Scanner(System.in);
        for(int i=0;i<ds.length;i++){
            System.out.println("\nNhap phan so thu "+(i+1));
            ds[i] = new PhanSo();
            ds[i].read(sc);
        }
    }
    //ham in mang phan so
    public static void print_arr(PhanSo ds[]){
        for(int i=0;i<ds.length;i++){
            System.out.println("ds["+(i+1)+"]: "+ds[i].toString());
        }
    }
    //ham tinh tong mang
    public static double tongArray(PhanSo ds[]){
        double sum = 0;
        for(int i=0; i<ds.length;i++){
            sum += ds[i].get_valuePs();
        }
        return sum;
    }
}
