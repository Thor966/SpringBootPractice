package com.ag.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg3")
public class WishMessageGenerator3
{
	@Autowired
	private LocalTime lt;
	@Autowired
	private LocalDate ld;
	
	// business method
	
	public String generateMessage(String user)
	{
		int hour = lt.getHour();
		System.out.println("WishMessageGenerator3.generateMessage()");
		System.out.println("Time: "+lt.getHour()+" "+"Date "+ld.getDayOfMonth());
		
		if(hour<12)
			return "Good Morning "+user;
		else if(hour<16)
			return "Good Afternoon "+user;
		else if(hour<18)
			return "Good Evenong "+user;
		else
			return "Good Night "+user;
			
	}

}
