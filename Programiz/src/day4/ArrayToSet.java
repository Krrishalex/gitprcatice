package day4;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayToSet {

	public static void main(String[] args) {
		
		int[] a= {1,2,3};
		
		HashSet<Integer> set=new HashSet<>();
	
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
			
		}
		
		System.out.println(set.toString());
		
		HashSet<Character> set1=new HashSet<>();
		
		set1.add('h');
		set1.add('j');
		set1.add('d');
		set1.add('e');
		set1.add('3');
		
		char[] c=new char[set1.size()-2];
		for (int i = 0; i < c.length; i++) {
			set1.add(c[i]);
		}
		
		System.out.println(set1.toString());
		
	}
}
