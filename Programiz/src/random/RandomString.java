package random;

import java.util.Random;

public class RandomString {
	
	public static void main(String[] args) {
		
		String alpha="abcdefghijklmnopqrstuvwxyz";
		String alphas=alpha.toUpperCase();
		String num="1234567890";
		
		StringBuilder sb=new StringBuilder();
		
		Random random=new Random();
		
		for (int i = 0; i <5; i++) {
			
			int index=random.nextInt(alphas.length());
			
			//System.out.println(index);
			char randomChar=alphas.charAt(index);
			
			sb.append(randomChar);
			
			
		}
		
		for (int i = 0; i <4; i++) {
			int indx=random.nextInt(num.length());
			char randomChars=num.charAt(indx);
			sb.append(randomChars);
		}
for (int i = 0; i <1; i++) {
			
			int index=random.nextInt(alphas.length());
			
			//System.out.println(index);
			char randomChar=alphas.charAt(index);
			
			sb.append(randomChar);
			
			
		}
		System.out.println(sb.toString());
		
	}

}
