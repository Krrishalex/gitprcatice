package day4;

import java.util.Arrays;

public class ConcanetateArrays {

	
	public static void main(String[] args) {
		int[] a= {1,5,8,7};
		int[] b={1,7,8,9};
		
		int[] result=new int[a.length+b.length];
		int pos = 0;
		for (int i = 0; i < a.length; i++) {
			result[pos]=a[i];
			pos++;
		}
		
		for (int i = 0; i < b.length; i++) {
			result[pos]=b[i];
			pos++;
		}
		
		System.out.println(Arrays.toString(result));
	}
	
	
}
