package constructor_calls;

public class Vehicle {

	private int noWheels;
	private String color;
	private String model;
	
	
	public Vehicle(int noWheels, String color, String model) {
		
		if(noWheels>4) {
			System.out.println("its a truck");
		}
		
		 if(color=="red") {
			System.out.println(color);
		}
		
		 if(model=="1998") {
			System.out.println(model);
		}
		
		
	}
	}
