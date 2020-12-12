package intro;

public class RootsOfQuadratic {

	public static void main(String[] args) {
		
		double a=1,b=-2,c=4,root1 = 0,root2 = 0;
		double det=Math.sqrt((b*b)-(4*a*c));
		//System.out.println();
		if(det>0) {
			root1=(-b+det)/(2*a);
			root2=(-b-det)/(2*a);
		}
		else if(det==0) {
			root1=root2=-b/(2*a);
		}
		
System.out.println("Root1: "+root1+" Root2: "+root2);
	}

}
