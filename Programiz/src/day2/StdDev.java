package day2;

public class StdDev {

	
	public static void main(String[] args) {
		double[] a= {9,7,10};
		double sum=0;
		int n=a.length;
		
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
			
		}
		
		double mean=sum/n;
		System.out.println(mean);
		double dev=0;
		double y;
		for (int i = 0; i < a.length; i++) {
			y=((a[i]-mean)*(a[i]-mean))/n;
			y=Math.sqrt(y);
			System.out.println(y);
			dev=dev+y;
		}
		System.out.println(dev);
	}
}
