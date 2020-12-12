package intro;

public class LCM {

	public static void main(String[] args) {
		
		int a=9,b=7,lcm;
		lcm=(a>b)?a:b;	
		while(true) {
			
			if(lcm%a==0 && lcm%b==0) {
			System.out.println(lcm);
			break;
		}
			++lcm;
		}
	}

}
