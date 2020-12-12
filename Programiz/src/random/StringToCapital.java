package random;

import java.util.Arrays;

public class StringToCapital {

	public static void main(String[] args) {
		
		String s="This is my friend";
		String[] s1=s.split(" ");
		String fin = "";
		System.out.println(Arrays.toString(s1));
		
		for (int i = 0; i<s1.length; i++) {
			
		String st=s1[i];
		
		String f=st.substring(0,1).toUpperCase();
		String l=st.substring(1,st.length());
		
	fin= fin+f+l+" ";
		
		
		

	}
		
	System.err.println(fin);	

}
}