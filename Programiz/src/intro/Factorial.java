package intro;

public class Factorial {

	public static void main(String[] args) {
		
		int n=7;
		int fact =1,i=1;
		while(n>0) {
			
			fact*=i;
			
			i++;
			n--;
			
		}
		
System.out.println(fact);
	}

}
