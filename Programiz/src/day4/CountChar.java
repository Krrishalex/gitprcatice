package day4;

import java.util.HashMap;
import java.util.Map;

public class CountChar {
	
	public static void main(String[] args) {
		String s="abbakdvxzkvn n dxzclkjvlkzcnxbnzndfslanvlcbznzkzvhdsndvnxjcbvjcxbkj";
		String s1=s;
		int count=0;
		
	Map<Character, Integer> hm=new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			count=0;
			for (int j = 0; j < s.length(); j++) {
				char k=s1.charAt(j);
				if(c==k) {
					count++;
				}
				
				
			}
			hm.put(c, count);
		}
		
		for(Map.Entry<Character,Integer> entry:hm.entrySet()){
			
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
	}

}
