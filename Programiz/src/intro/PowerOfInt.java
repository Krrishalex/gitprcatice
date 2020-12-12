package intro;

import java.util.Scanner;

public class PowerOfInt {

	public static void main(String[] args) {
		String str ="yes";
		
		while(str.equalsIgnoreCase("yes")) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a ");
		int a =sc.nextInt();
		System.out.println("Enter b ");
		int b=sc.nextInt();
		int temp=a;
		for (int i = 1; i <b; i++) {
			
			temp=temp*a;
		}
		System.out.println(temp);
		
		System.out.println("Enter do you want continue yes/no ");
		 str=sc.next();	
		
		}

	}

}
