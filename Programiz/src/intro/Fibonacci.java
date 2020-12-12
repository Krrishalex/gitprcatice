package intro;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a=0,b=1,temp=0;
		System.out.print(a+" ");
	int count =0;
	while(count<=20) {
		System.out.print(b+" ");
		temp=a+b;
		a=b;
		b=temp;
		count++;
		
	}
	

	}

}
