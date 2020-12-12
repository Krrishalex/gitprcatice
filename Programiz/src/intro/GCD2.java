package intro;

public class GCD2 {

	public static void main(String[] args) {
		
		int a=8,b=120,gcd;
		gcd=(a<b)?a:b;
		//System.out.println(gcd);
		while(true) {
			if(a%gcd==0 && b%gcd==0) {
				System.out.println(gcd);
				break;
			}
			--gcd;
			//System.out.println(gcd);
		}

	}

}
