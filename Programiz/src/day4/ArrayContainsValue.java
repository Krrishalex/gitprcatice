package day4;

public class ArrayContainsValue {

	public static void main(String[] args) {
		
		int[] a= {1,2,8,7,9};
		int value=8;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==value) {
				System.out.println(true+"At the position of "+i);
			}
			else {
				System.out.println(false);
			}
		}

	}

}
