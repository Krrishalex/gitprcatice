package intro;

public class StringCheck {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String s=null;
		
		if(s==null) {
			System.out.println("null");
		}
		else if(s.isEmpty()) {
			System.out.println("it si empty");
		}
		else if(s!=null) {
			System.out.println("its not null");
		}
		else {
			System.out.println("its not empty");
		}
	}
	
	
}
