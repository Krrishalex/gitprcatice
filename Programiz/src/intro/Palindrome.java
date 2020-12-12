package intro;

public class Palindrome {
	
	
	public static int rev(int a) {
		int rem=0,rev=0;
		while(a>0) {
			
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
			
		}
		return rev;
	}
	public static boolean isPalindrome(int a) {	
		
		if(rev(a)==a) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		int a=1000;
		 
				int i=1;
				while(i<=a) {
					if(isPalindrome(i)==true) {
					System.out.print(i+",");
					}
					i++;
				}
			
		
	}

}
