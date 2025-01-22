package com.ag.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmg")
@Scope("singleton")
public class WishMessageGenerator
{
	
	private LocalDate ld; // HAS-A property
	
	@Autowired
	private LocalTime lt; // HAS-A property
	
	// business method
	
	public String generateMessage(String msg)
	{
		int hour = lt.getHour();
		
		System.out.println("current time: "+ lt.getHour()+" "+lt.getMinute()+" "+lt.getSecond());
		
		if(hour<12)
			return "Good Morning";
		else if(hour<16)
			return "Good Afternoon";
		else if(hour<18)
			return "Good Evening";
		else
			return "Good Night";
	}

	
}
