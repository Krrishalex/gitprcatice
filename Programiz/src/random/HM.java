package random;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HM {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1, "he");
		hm.put(2, "she");
		hm.put(3, "it");
		hm.put(4, "they");
		
		hm.put(4, "LOve");
		
		for (Entry<Integer, String> entry: hm.entrySet()) {
			
		}
		
		for(Integer key:hm.keySet()) {
			System.out.print(key);
		}
		
		for(String value:hm.values()) {
			System.out.print(value);
		}
		
	
	}

}
