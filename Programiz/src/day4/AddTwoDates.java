package day4;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;

public class AddTwoDates {
	
	public static void main(String[] args) {
		
		LocalDate today=LocalDate.now();
		System.out.println(today);
		
		LocalDate birthday=LocalDate.of(1992, 06, 8);
		
		Period p=Period.between(birthday, today);
		System.out.println(p.getYears()+" years "+p.getMonths()+" months "+p.getDays()+" days");
		
	}
	

}
