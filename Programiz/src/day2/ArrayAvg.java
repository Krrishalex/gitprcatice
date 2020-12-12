package day2;

public class ArrayAvg {

	public static void main(String[] args) {
		int[] ar= {1,2,3,98,100,873,7,8,465,9};
		int sum=0,avg=0;
		
		for (int i = 0; i < ar.length; i++) {
			sum=sum+ar[i];
			
		}
		System.out.println(sum);
		System.out.println(sum/ar.length);
	}
	
}
