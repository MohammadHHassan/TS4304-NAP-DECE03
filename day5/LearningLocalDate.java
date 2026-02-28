package day5;

import java.time.LocalDate;		// LocalDate library
import java.util.Date;

public class LearningLocalDate
{
	public static void main(String[] args)
	{
		LocalDate now = LocalDate.now();		// Declaration of LocalDate class
		
		System.out.println(now);
		System.out.println("Year = " + now.getYear());		// Retrieve the year
		System.out.println("Month = " + now.getMonth());	// Retrieve the month
		System.out.println("Month value = " + now.getMonthValue());		// Retrieve the value of the month
		System.out.println("Day of the month = " + now.getDayOfMonth());
		System.out.println("Day of the year = " + now.getDayOfYear());
		System.out.println("Day of the week = " + now.getDayOfWeek());
		
		System.out.println("The time and date now is " + new Date());
	}
}
