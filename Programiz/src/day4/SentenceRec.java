package day4;

public class SentenceRec {
	
	public static String revStr(String str) {
		if(str.isEmpty()) 
			return str;
		
		
		return revStr(str.substring(1))+str.charAt(0);
		
	}
	
	public static void main(String[] args) {
		String str="abc";
		String a=revStr(str);
		System.out.println(a);
	}

}
