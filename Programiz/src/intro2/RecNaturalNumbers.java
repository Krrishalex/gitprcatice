package intro2;

public class RecNaturalNumbers {
	static int sum=0;
	public static int add(int a) {
		if(a>0) {
			sum=a+add(a-1);
			//System.out.println("Entered");
		}
		
		return sum;
		}
	

	public static void main(String[] args) {
		int a=100;
		int sum=add(a);
				System.out.println(sum);
	}

}
