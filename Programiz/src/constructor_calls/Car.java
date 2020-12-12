package constructor_calls;

public class Car extends Vehicle {
	
	
	public Car() {
		super(5, "red", "1998");
	}
	
	public static void main(String[] args) {
		Car c=new Car();
	}

}
