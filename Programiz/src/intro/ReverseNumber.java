package intro;

public class ReverseNumber {

	public static void main(String[] args) {
		int a=112,rem=0,rev=0;
		while(a>0) {
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
			
		}
		System.out.println(rev);
	}

}
