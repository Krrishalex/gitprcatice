package day2;

public class LargestArNum {

	
		public static void main(String[] args) {
			int[] a= {5,8,9,7,6,4,3,10};
			
			int big=a[0];
			int l=a.length-1;
			int i=0;
			while(l>0) {
				
				if(big<a[i+1]) {
					big=a[i+1];
					
				
				}
				i++;
				l--;
			}
			System.out.println(big);
		}
		
}
