package day4;

public class BinaryToDecimal {
	public static int decimal(long a) {
			long rem = 0,temp = 0;
			int i=0;
			while(a!=0) {
				rem=a%10;
				a=a/10;
				temp=(long) (temp+Math.pow(2, i));
				++i;
			}
			
			
			return (int) temp;
			
			
			
		}

	public static void main(String[] args) {
	
		long num=101011;
		
		int a=decimal(num);
		
		System.out.println(a);
		

	}

}
