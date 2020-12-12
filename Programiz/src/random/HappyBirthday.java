package random;

import java.time.LocalDate;
import java.time.Month;

public class HappyBirthday {

	public static void main(String[] args) {
	
		int day=8;
		Month m=Month.DECEMBER;
		
		LocalDate date=LocalDate.now();
		
		int currentday =date.getDayOfMonth();
		Month currentMonth=date.getMonth();
		
		if(day==currentday && m==currentMonth) {
			System.out.println("Happy birthday");
		}
		else {
			System.out.println("Not birthday");
		}

	}

}
