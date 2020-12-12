package day4;

public class CovertMS {

	
	public static void main(String[] args) {
		
		
		int ms=200010;
		
		int s=ms%1000;
		int d=ms/1000;
		int m=d%60;
		
		System.out.println(s+" "+m);
		
		
	}
}
