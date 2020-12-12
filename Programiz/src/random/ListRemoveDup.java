package random;

import java.util.ArrayList;
import java.util.List;

public class ListRemoveDup {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		
		list.add("Come");
		list.add("Come");
		list.add("Go");
		list.add("Go");
		list.add("Tel");
		list.add("Tel");
		
		for (int i = 0; i < list.size()-1; i++) {
			
			if(list.get(i).equals(list.get(i+1))) {
				list.remove(i+1);
			}
		}
		
		System.out.println(list.toString());
	}
	
}
