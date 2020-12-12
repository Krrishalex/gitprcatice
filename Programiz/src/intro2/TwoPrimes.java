package intro2;

public class TwoPrimes {
	
	
	public static boolean isPrime(int a) {
		int count=0;
		if(a==1||a==0) {
			return  false;
		}
		else if(a==2) {
			return true;
		}
		for (int i = 2; i <a; i++) {
			
		 if(a%i==0) {
				count++;
			}
		}
			if(count ==0) {
				return true;
			}
		
		return false;
		
		
	}
	
	public static boolean isBothPrimes(int a,int b) {
		if(isPrime(a)) {
			if(isPrime(b)) {
				return true;
			}
		}
		else {
			return false;
		}
		return false;

		
	}
	
	public static void main(String[] args) {
		int a=56;
		
		for (int i =1,j=55; i <=a/2; i++,j--) {
			//System.out.println(i+"count"+(i+j));
			if(isBothPrimes(i, j)) {
				System.out.println("("+i+","+j+")");
			}
			
		}
		//System.out.println(isPrime(a));
		
	}

}
