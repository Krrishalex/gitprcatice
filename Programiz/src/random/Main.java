package random;

class Kick{
	String movie="kick";
	
	public void displayMovie() {
		System.out.println(movie);
	}
}

class Music extends Kick{
	String music="Thaman";
	
	public void musicDisplay() {
		displayMovie();
		System.out.println(music);
	}
}


class Director extends Music{
	
	String director="Raja";
	public void displaydirector() {
		musicDisplay();
		System.out.println(director);
		
	}
}

public class Main {

	public static void main(String[] args) {
		Director dir=new Director();
		//dir.displayMovie();
		//dir.musicDisplay();
		dir.displaydirector();
		
	}
}
