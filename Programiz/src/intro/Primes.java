package intro;

public class Primes {
	
	public static int isPrime(int a){
		int count=0;
		if(a==1||a==0) {
			return count++;
		}
		else if(a==2) {
			return count ;
		}
		
		else if(a>2) {
		
		for (int i = 2; i <=a/2; i++) {
			if(a%i==0) {
				count++;
			}
			else {
				return count;
			}
			
		}
		
		}
		return count;
		
		
	}	
		
	
	

	public static void main(String[] args) {
		int a=100;
		
		int i=2;
			while (i<=a) {
				if(isPrime(i)==0) {
				System.out.println(i);
				
				}
				i++;
		}
		
		
	
		
	
}
}