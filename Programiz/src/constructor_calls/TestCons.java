package constructor_calls;

public class TestCons {
	public int a;
	public TestCons() {
		System.out.println("Constructor is called");
		a=5;
	}

		public static void main(String[] args) {
			TestCons t=new TestCons();
			System.err.println(t.a);
			
		}
}
