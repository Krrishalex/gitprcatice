package day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapToList {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		
		hm.put(1, "Hello");
		hm.put(124, "he");
		
		List<Integer> listKeys=new ArrayList<>(hm.keySet());
		ArrayList<String> listValues=new ArrayList<>(hm.values());
		
		System.out.println(listKeys.toString());
		System.out.println(listValues.toString());
		
		
		
		
		
		
	}
}
