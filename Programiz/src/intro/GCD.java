package intro;

public class GCD {

	public static void main(String[] args) {
		
		int a=600,b=100;int count=0;
		int temp=0;
		if(a<b) {
		temp=a;
		
		
		}
		else {
			temp=b;
		}
		if(a%b==0) {
			System.out.println(b);
		}
		else if(b%a==0) {
			System.out.println(b);
		}
		else {
			int i=1;
			while(i<=temp/2) {
				if(a%i==0 && b%i==0) {
					count=i;
					
				}
				i++;
			}
			System.out.println(count);
		}
		
		
	}

}
