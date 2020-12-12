package random;

import java.util.ArrayList;

public class ArrList {
	
	
public static void listAdd(ArrayList<String> names) {
	
	System.out.println(names.toString());
	
	
}
	


public static void main(String[] args) {
	
	String[] s= {"Hello","Hi","Bye"};
	
	ArrayList<String> list1 =new ArrayList<>();
	
	for (int i = 0; i < s.length; i++) {
		String s1=s[i];
		
		list1.add(s[i]);
	}
	
	listAdd(list1);
	
}
}
