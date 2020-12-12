package objs;

public class GetClassName {

	public static void main(String[] args) {
		
		
		GetClassName ob=new GetClassName();
		System.out.println(ob.getClass().getName());
		
		System.out.println(ob instanceof GetClassName);
	}

}
