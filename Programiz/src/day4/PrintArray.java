package day4;

import java.util.Arrays;

public class PrintArray {

	public static void main(String[] args) {
		
		int[] s= {1,2,5,7,8};
		int[][] a= {{1,2,3},{2,5,8,7}};
		System.out.println(Arrays.deepToString(a));
		System.out.println(Arrays.toString(s));
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}

	}

}
