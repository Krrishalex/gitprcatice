package day4;

public class RecGCD {

	public static int hcf(int a,int b) {
		if(b!=0) {
			return hcf(b,a%b);
		}
		else {
			return a;
		}
	}
	
	public static void main(String[] args) {
		
		int a=5,b=15;
		int hcf=hcf(a,b);
		System.out.println(hcf);
	}
	
}
