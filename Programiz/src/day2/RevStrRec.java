package day2;

public class RevStrRec {
	
	public static String REvStr(String s) {
		String rev="";
		
		if(s.length()>0) {
		rev=rev+REvStr(s.substring(s.length()));
		}
		
		return rev;
	}
	
	public static void main(String[] args) {
		String str="a boy is here";
		
		System.out.println(REvStr(str));
	}
	
	
}
