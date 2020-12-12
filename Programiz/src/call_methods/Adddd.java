package call_methods;

public class Adddd {

	
	static long start=System.nanoTime();
	public static int add1() {
		return 4+5;
		
	}
	
	public static int add2() {
		return 4+5;
		
	}
	
	public void add(int add1,int add2) {
		
		System.out.println(add1()+add2());
		
	}
	
	static long stop=System.nanoTime();
	
	
	public static void main(String[] args) {
		Adddd a=new Adddd();
		a.add(add1(), add2());
		
		System.out.println(stop-start);
	}
	
}
