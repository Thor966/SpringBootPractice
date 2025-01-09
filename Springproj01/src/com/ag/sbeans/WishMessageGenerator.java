package com.ag.sbeans;

import java.time.LocalTime;
public class WishMessageGenerator {
	private LocalTime lt;
	
	public WishMessageGenerator()
	{
		System.out.println("0-parameter constructor...");
	}
	
	// Setter method for setter injection
	public void setLt(LocalTime lt)
	{
		System.out.println("Setter Method has been Instantiated...");
		this.lt = lt;
	}
	
	// Business Method
	public String generateWishMessage(String user)
	{
		System.out.println("Business Method has been Instantiated...");
		System.out.println();
		int hour = lt.getHour();
		
		if(hour<12)
			return "Good Morning "+user;
		else if(hour<16)
			return "Good Afternoon "+user;
		else if(hour<20)
			return "Good Evening "+user;
		else
			return "Good Night "+user;
			
	}
	
	
	
	
		
		
}
