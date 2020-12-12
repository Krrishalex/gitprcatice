package day4;

public class Complex {

	public double real;
	public double image;
	
	public Complex(double real,double image) {
		this.real=real;
		this.image=image;
		
		
	}
	
	
	public static Complex add(Complex n1,Complex n2) {
		Complex temp=new Complex(0, 0);
		
		temp.real=n1.real+n2.real;
		temp.image=n1.image+n2.image;
		
		return temp;
	}	
		
	public static void main(String[] args) {
		
	Complex n1=new Complex(2.5, 3.6);
	Complex n2=new Complex(9.2, 5.8);
	Complex temp=add(n1, n2);
	System.out.println(temp.real+"+"+temp.image+"i");
	
	
	
	
	}
	
	
}
