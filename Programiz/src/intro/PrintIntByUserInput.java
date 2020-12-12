package intro;

import java.util.Scanner;

public class PrintIntByUserInput {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		System.out.println("User input is: "+a);
		sc.close();
	}
}
