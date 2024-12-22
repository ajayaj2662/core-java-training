package com.day12;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class DateAPIExample {
	public static void main(String[] args)
	{
		//To display date
		LocalDate date = LocalDate.now();
		//System.out.println(date); //To get(2024-12-21)
		System.out.println(date.getYear());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfMonth());
		
		//To display Time
		LocalTime time = LocalTime.now();
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		
		//To display date and time
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
	}

}
