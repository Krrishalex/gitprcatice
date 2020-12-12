package intro2;

public class SwitchCalc {

	public static void main(String[] args) {
		int a=9,b=8;
		String op="ad";
		
		switch(op){
		case "add":
			System.out.println(a+b);
			break;
		case "mul":
			System.out.println(a*b);
			break;
		case "sub":
			System.out.println(a-b);
			break;
		
		case "div":
			System.out.println(a/b);
			break;
		 default:
			System.out.println("Inavlid input");
		}
	}

}
