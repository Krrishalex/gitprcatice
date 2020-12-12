package day5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SortingMap {
	
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1, "Hi");
		hm.put(2, "hello");
		hm.put(3, "aaa");
		
		//Collections.sort(hm);
		
		List<Integer> list=new ArrayList<>(hm.keySet());
		List<String> list1=new ArrayList<>(hm.values());
		Collections.sort(list1);
		
		System.out.println(list1.toString());
		
		
	}

}
