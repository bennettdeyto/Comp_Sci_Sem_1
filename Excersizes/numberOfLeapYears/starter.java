import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public class APCalendar{
	
	private static boolean isLeapYear(int year){
		
	}
	public static int numberOfLeapYears(int year1, int year2){
		int dif = year2 - year1;
		int numLP = 0;
		for(int i = year1; i < dif; i++){
			if(isLeapYear(i)){
				numLP = numLP + 1;
			}
		}
		return numLP;
	}
	private static int firstDayOfYear(int year){
	 
	}
	private static int dayOfYear(int month, int day, int year){
		
	}
	private static int dayOfWeek(int month, int day, int year){
		
	}
}


class starter {
	public static void main(String args[]) {
	
	}
}
