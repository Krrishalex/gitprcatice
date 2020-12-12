package day4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class StringDate {
	
	public static void main(String[] args) {
		String s="2002-12-02";
		String date2="August 01,2020";
		
		LocalDate date=LocalDate.parse(s, DateTimeFormatter.ISO_DATE);
		
		System.out.println(date);
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MMMM d,yyyy",Locale.ENGLISH);
		LocalDate date1=LocalDate.parse(date2,formatter);
		System.out.println(date1);
	}

}
