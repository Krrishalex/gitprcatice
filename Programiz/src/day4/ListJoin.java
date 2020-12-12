package day4;

import java.util.ArrayList;

public class ListJoin {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		
		ArrayList<Integer> list1=new ArrayList<>();
		
		list.add(254);
		list.add(24588);
		
		list1.add(1);
		list1.add(57);
		
		list.addAll(list1);
		
		System.out.println(list.toString());
		
		
		
	}

}
