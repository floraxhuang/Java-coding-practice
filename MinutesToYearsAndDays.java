
public class MinutesToYearsAndDays {
	public static void main(String[] args){
		printYearsAndDays(-561600);
	}
	
	public static void printYearsAndDays(long minutes) {
		if(minutes<0) {
			System.out.println("Invalid Value");
			return;
		}
		
		long days;
		long years;
		long remDays;
		days=minutes/(60*24);
		years=days/365;
		remDays=days%365;
		
		System.out.println(minutes+" min = "+years+" y and "+remDays+" d");
	}
}
