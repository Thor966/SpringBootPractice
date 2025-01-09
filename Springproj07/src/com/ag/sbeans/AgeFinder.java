package com.ag.sbeans;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Component;

@Component("age")
public class AgeFinder
{
//	LocalDate ld; // HAS-A property
	
	public void AgeFinder()
	{
		System.out.println("AgeFinder.AgeFinder()");
	}
	
	// Business method
	public String agefind(LocalDate birthdate)
	{
		if(birthdate==null || birthdate.isAfter(LocalDate.now()))
			return "Invalid Date";
			
		
		
			Period age = Period.between(birthdate, LocalDate.now());
		     return "You are " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days old.";


			
	}
	
}
