package anagrams;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String st=new String("come");
		String st1=new String("cmor");
		
		if (st.length()==st1.length()) {
			char c1[]=st.toCharArray();
			char c2[]=st1.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			boolean b=Arrays.equals(c1, c2);
			
			System.out.println(b);
			
		}

	}

}
