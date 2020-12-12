package day4;

import java.util.Arrays;

public class ConevrtCharToString {

	
	public static void main(String[] args) {
		char s='c';
		String str="Krishna reddy Chemikela";
		String c=Character.toString(s);
		System.out.println(c);
		
		char[] chars= {'a','e','i','o','u'};
		
		String st=String.valueOf(chars);
		String st1=new String(chars);
		System.out.println(st);
		System.out.println(st1);
		
		char[] name=str.toCharArray();
		
		System.out.println(Arrays.toString(name));
		
		
	}
}
