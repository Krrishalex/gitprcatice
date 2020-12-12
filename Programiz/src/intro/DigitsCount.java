package intro;

public class DigitsCount {

	public static void main(String[] args) {
		
		int a=190014578;
		int i=0;
		while(a>0) {
			a=a/10;
			i++;
		}
		System.out.println(i);

	}

}
