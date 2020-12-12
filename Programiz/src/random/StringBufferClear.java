package random;

public class StringBufferClear {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		sb.append("Hello");
		sb.append("Helllllo");
		
		System.out.println(sb.toString());
		
		System.err.println(sb.delete(0, sb.length()-1));
	}

}
