package day4;

import java.sql.Time;

public class TimeDiff {

	public int hours;
	public int mins;
	public int secs;
	
	public TimeDiff(int hours,int mins,int secs) {
		this.hours=hours;
		this.mins=mins;
		this.secs=secs;
		
	}
	
	
	public static TimeDiff difference(TimeDiff start,TimeDiff stop) {
		TimeDiff diff=new TimeDiff(0, 0, 0);
		
		if(stop.secs<start.secs) {
			--stop.mins;
			stop.secs+=60;
		}
		
		diff.secs=stop.secs-start.secs;
		
		if(stop.mins<start.mins) {
			--stop.hours;
			stop.mins+=60;
		}
		
		diff.mins=stop.mins-start.mins;
		diff.hours=stop.hours-start.hours;
		return diff;
	}
	
	public static void main(String[] args) {
		TimeDiff start=new TimeDiff(12, 25, 25);
		TimeDiff stop=new TimeDiff(13, 14, 25);
		
		TimeDiff temp;
		temp=difference(start,stop);
		System.out.println(temp.hours+":"+temp.mins+":"+temp.secs);
		
	}
	
}
