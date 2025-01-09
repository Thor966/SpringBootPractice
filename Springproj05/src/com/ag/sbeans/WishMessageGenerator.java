package com.ag.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator 
{
	@Autowired
	LocalTime lt; // HAS-A property
	@Autowired
	LocalDate ld; // HAS-A property
	
	public WishMessageGenerator()
	{
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}
	
	// Business method
	public String generateMessage(String user)
	{
		int hour = lt.getHour();
		
		System.out.println("WishMessageGenerator.generateMessage()");
		System.out.println("Time :"+lt.getHour()+"."+lt.getMinute()+" "+"Date:  "+ld.now());
		
		if(hour<12)
		return "Good Morning "+user;
		else if(hour<16)
			return "Good Afternoon "+user;
		else if(hour<18)
			return "Good Evening "+user;
		else
			return "Good Night "+user;
	}

}
