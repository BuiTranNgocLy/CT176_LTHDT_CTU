package buoi01;
public class Bai03{
	public static void main(String args[]){
		double sum=0, n, max=Double.MIN_VALUE;
		for(String s: args) {
			try {n=Double.parseDouble(s);}
			catch(NumberFormatException e) {
				n=0;
			}
			sum+=n;
			if(max<n) max=n;
		}
		System.out.print("Tong= "+sum+"\nMax= "+max);
	}
}