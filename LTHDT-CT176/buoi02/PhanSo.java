package buoi02;
import java.util.Scanner;
import java.lang.Math;
public class PhanSo{
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
    //ham nhap gia tr phan so
    public void read(Scanner sc){
        do{
            System.out.print("\nNhap tu so: ");
            tuSo=sc.nextInt();
            System.out.print("Nhap mau so: ");;
            mauSo=sc.nextInt();
            if(mauSo==0) System.out.print("Sai dinh dang, nhap lai");
        }while(mauSo==0);
    }
    //ham hien thi
    public void print(){
        if(tuSo==0) System.out.print("\nTu so = 0,phan so = "+0);
        else if(mauSo==1) System.out.print("\nMau so = 1, phan so = "+tuSo);
            else if(tuSo==mauSo) System.out.print("\nGia tri cua phan so = " + 1);
                else if(tuSo*mauSo<0) System.out.print("\nGia tri cua phan so: "+ (-tuSo)+"/"+Math.abs(mauSo));
                    else System.out.print("\nGia tri cua phan so: "+Math.abs(tuSo)+"/"+Math.abs(mauSo));
    }
    //ham in co kieu tra ve
    public String toString(){
        if(tuSo==0) return ("\nTu so = 0,phan so = "+0);
        else if(mauSo==1) return ("\nMau so = 1, phan so = "+tuSo);
            else if(tuSo==mauSo) return("\nGia tri cua phan so = " + 1);
                else if(tuSo*mauSo<0) return("\nGia tri cua phan so: "+ (-tuSo)+"/"+Math.abs(mauSo));
                    else return("\nGia tri cua phan so: "+Math.abs(tuSo)+"/"+Math.abs(mauSo));
    }
    //ham nghich dao phan so (lam thay doi gia tri thuoc tinh)
    public void nghichDao(){
        //swap
        int temp = tuSo;
        tuSo = mauSo;
        mauSo = temp;
    }
    //ham tinh gia tri phan so nghich dao(tao ra ket qua la 1 phan so de tra ve)
    public PhanSo gtringhichDao(){
    	PhanSo s = new PhanSo(mauSo, tuSo);
        return s;
    }
    //ham tinh gia tri thuc
    public double gtriThuc(){
        return (double)tuSo / mauSo; //ep kieu 
    }
    //ham so sanh
    public boolean soSanh(PhanSo s){
        //so sanh gia tri thuc
        return gtriThuc() > s.gtriThuc();
    }
  //ham tim UCLN
    private int timUcln(int a, int b){
        int temp = a%b;
        while(temp!=0){
            a=b;
            b=temp;
            temp=a%b;
        }
        return b;
    }
  //ham toi gian phan so
    public PhanSo toiGianPs(){
		PhanSo z = new PhanSo(tuSo,mauSo);
		int UCLN = z.timUcln(tuSo,mauSo);
		z.tuSo = z.tuSo / UCLN;
		z.mauSo = z.mauSo / UCLN;
		return z;
	}
    //ham cong phan so
    //cong voi 1 phan so(a+s, 3/4 + 4/3)
   public PhanSo congPs(PhanSo b){
	    PhanSo kq = new PhanSo();
        kq.tuSo = tuSo*b.mauSo + mauSo*b.tuSo;
        kq.mauSo = mauSo * b.mauSo;
        return kq.toiGianPs();
    }
    //cong voi 1 so nguyen n(tao phan so s co tu so = n, mau so = 1)
    public PhanSo cong(int n){
    	PhanSo s = new PhanSo(n,1);
        return congPs(s);
    }
    
    //ham tru phan so
    //tru voi 1 phan so
    public PhanSo truPs(PhanSo b) {
    	PhanSo kq = new PhanSo();
    	kq.tuSo = tuSo*b.mauSo - mauSo*b.tuSo;
        kq.mauSo = mauSo * b.mauSo;
        return kq.toiGianPs();
    }
    //tru voi 1 so nguyen
    public PhanSo tru(int n) {
    	PhanSo s = new PhanSo(n, 1);
    	return truPs(s);
    }
    //ham nhan phan so
    //nhan voi phan so
    public PhanSo nhanPs(PhanSo b){
    	PhanSo kq = new PhanSo();
    	kq.tuSo= tuSo * b.tuSo;
    	kq.mauSo = mauSo * b.mauSo;
    	return kq.toiGianPs();
    }
    //nhan voi so nguyen
    public PhanSo nhan(int n) {
    	PhanSo s= new PhanSo(n, 1);
    	return nhanPs(s);
    }
    //ham chia phan so
    //chia voi phan so
    public PhanSo chiaPs(PhanSo b) {
    	PhanSo kq = new PhanSo();
    	kq.tuSo = tuSo * b.mauSo;
    	kq.mauSo = mauSo * b.tuSo;
    	return kq.toiGianPs();
    }
    //chia voi so nguyen
    public PhanSo chia (int n) {
    	PhanSo s = new PhanSo();
    	return chiaPs(s);
    }
    
    
}