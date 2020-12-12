package intro2;

public class FactorialRec {
	
	public static int fact(int a) {
		
		int sum=1;
		if(a>0) {
			sum=a*fact(a-1);
		}
		return sum;
		
	}

	public static void main(String[] args) {
		int a=5;
		int fac=fact(a);
		System.out.println(fac);
		
	}

}
