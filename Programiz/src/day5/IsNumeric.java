package day5;

public class IsNumeric {
	
	public static void main(String[] args) {
		String s="456G";
		boolean b=true;
		int a = 0;
		try {
			 a=Integer.parseInt(s);
		}
		catch(Exception e) {
			b=false;
		}
		
		if(b) {
			System.out.println(a+"is numeric");
		}
		
		else {
			System.out.println(a+" is not numeric");
		}
	}

}
