package intro2;

public class Armstrong {

	
	public static int armStrong(int a) {
		int sum=0,rem=0;
		while(a>0) {
			rem=a%10;
			sum=sum+(rem*rem*rem);
			a=a/10;
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		int a=19,b=100;
		if(a>100) {
		for (int i = a; i <=b; i++) {
			int arm=armStrong(i);
			if (arm==i) {
				System.out.println(i);
			}
		}
		}
		else {
			System.out.println("enter more than 100");
		}
	}
	}
	

