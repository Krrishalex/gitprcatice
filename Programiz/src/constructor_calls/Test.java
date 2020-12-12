package constructor_calls;

public class Test {

	
	private Test(){
		System.out.println("thsi is private constructor");
	}
	
	public static void call() {
		Test obj=new Test();
	}
}


