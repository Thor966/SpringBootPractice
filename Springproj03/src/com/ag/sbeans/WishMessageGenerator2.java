package com.ag.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator2 
{
	private LocalTime lt;// HAS-A property
	
	private LocalDate ld;// HAS-A property
	
	
	// Constructor Injection
	public WishMessageGenerator2(LocalTime lt, LocalDate ld)
	{
		System.out.println("WishMessageGenerator2.WishMessageGenerator2(Constructor)");
		this.lt = lt;
		this.ld = ld;
	}
	
	// Setter Injection
	
	public void setLt(LocalTime lt)
	{
		System.out.println("WishMessageGenerator2.setLt()");
		this.lt = lt;
	}
	
	public void setLd(LocalDate ld)
	{
		System.out.println("WishMessageGenerator2.setLd()");
		this.ld = ld;
	}
	
	
	// Business Method
	
	public String generateMessage2(String user)
	{
		int hour = lt.getHour();
		System.out.println("WishMessageGenerator2.generateMessage()");
		System.out.println("Time :"+lt+" "+"Date: "+ld);
		
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
