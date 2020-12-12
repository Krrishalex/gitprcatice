package day4;

public class PowerREc {
	
	
	public static int power(int a,int powerR) {
		if(powerR!=0) {
			return (a*power(a,powerR-1));
			
		}
		else {
			return 1;
		}
		
	}

	public static void main(String[] args) {
		int a=2,b=4;
		int res=power(a, b);
		System.out.println(res);
	}

}
