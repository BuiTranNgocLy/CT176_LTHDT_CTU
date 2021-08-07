import java.util.Scanner;
import java.lang.Math;
public class phanSo{
    //khai bao thuoc tinh
    private int tuSo;
    private int mauSo;
    //ham xay dung mac nhien
    public phanSo(){
        tuSo = 19;
        mauSo = 12;
    }
    //ham xay dung 2 doi so
    public phanSo(int a, int b){
        tuSo = a;
        mauSo = b;
    }
    //ham xay dung sao chep
    public phanSo(phanSo k){
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
    public phanSo gtringhichDao(){
        phanSo s = new phanSo(mauSo, tuSo);
        return s;
    }
    //ham tinh gia tri thuc
    public double gtriThuc(){
        return (double)tuSo / mauSo; //ep kieu 
    }
    //ham so sanh
    public boolean soSanh(phanSo s){
        //so sanh gia tri thuc
        return gtriThuc() > s.gtriThuc();
    }
    //ham cong voi 1 phan so(a+s, 3/4 + 4/3)
   public phanSo congPs(phanSo b){
        phanSo kq = new phanSo();
        kq.tuSo = tuSo*b.mauSo + mauSo*b.tuSo;
        kq.mauSo = mauSo * b.mauSo;
        return kq.toiGianPs();
    }
    //ham cong voi 1 so nguyen n(tao phan so s co tu so = n, mau so = 1)
    public phanSo cong1(int n){
        phanSo s = new phanSo(n,1);
        return cong(s);
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
    public void toiGianPs(){
        int x = timUcln(tuSo, mauSo);
        tuSo = tuSo/x;
        mauSo = mauSo/x;
    }
    //ham chinh
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        //tao 2 phan so x, y
        phanSo x = new phanSo();
        phanSo y = new phanSo();
        x.read(sc);
        x.print();
        y.read(sc);
        y.print();
        //hien thi gia tri nghich dao cua ps x
        phanSo x1 = x.gtringhichDao();
        System.out.print("\nGia tri nghich dao cua x la ");
        x1.print();
        //tong x+y
        System.out.print("\nSum x+y: ");
        phanSo kq = x.cong(y);
        kq.print();
        //
        //tao danh sach n phan so
        System.out.print("\nThe number of elements of the array is: ");
        int n= sc.nextInt();
        //khai bao mang phan so
        // kieu_du_lieu [] ten_mang = new so_phan_tu_trong_mang
        phanSo [] m = new phanSo[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the fraction "+ (i+1));
            //xay dung phan so truoc khi su dung
            m[i] = new phanSo();
            m[i].read(sc);
        }
        //hien thi
        for(int i=0;i<n;i++){
            m[i].print();
        }
        //tong n phan so
        
        // for(int i=0; i<n; i++){
        //     System.out.print("\nTong "+n+" phan so vua nhap: ");
        //     System.out.print("\nMai viet")
        //     // phanSo kq1 = i.cong(m[i]);
        //     // kq1.print();
        // }
        //tim phan so max(gia tri thuc max)
        double max = m[0].gtriThuc();
        int index = 0;
        for(int i=1; i<n; i++){
            if(m[i].gtriThuc() > max){
                max = m[i].gtriThuc();
                index = i;
            }
        }
        System.out.print("\nThe largest fraction in position: " + (index+1));
        m[index].print();

        //sap xep tang dan
        System.out.print("\nArray after sorting ascending ");
        phanSo temp;
        for(int i=0; i<n-1;i++){
            for(int j=i+1; j<n; j++){
                if(m[i].soSanh( m[j] )){
                    temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            m[i].print();
        }
    }
}