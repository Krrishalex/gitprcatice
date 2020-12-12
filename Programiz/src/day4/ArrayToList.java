package day4;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToList {

	public static void main(String[] args) {
		
		int a[]= {1,2,8,7};
		ArrayList<Integer> list=new ArrayList<>();
		
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		
		System.out.println(list.toString());
		ArrayList<String> list1=new ArrayList<>();
		list1.add("Hello");
		list1.add("Hi");
		list1.add("Bye");
		String s[] =new String[list1.size()];
		
		list1.toArray(s);
		System.out.println(Arrays.toString(s));
		
	}
}
