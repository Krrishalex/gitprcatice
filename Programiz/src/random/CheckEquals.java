package random;

public class CheckEquals {

	public static void main(String[] args) {
		
		String a="This";
		
		String b="This";
		
		if(a==b) {
			System.err.println("true");
		}

		else {
			System.out.println("false");
		}
		
		if(a.equals(b)) {
			System.err.println("True");
		}
		else {
			System.out.println("false");
		}
	}

}
