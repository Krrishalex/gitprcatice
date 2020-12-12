package day4;

public class ToHexa {

	
	public static void main(String[] args) {
		byte bye[] = {10,2,15,11};
		
		for(byte b:bye) {
			String st=String.format("%02X",b);
			System.out.print(st);
			
			
		}
	}
}
