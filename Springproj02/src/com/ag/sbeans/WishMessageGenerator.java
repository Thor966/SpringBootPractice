package com.ag.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator
{
	private LocalTime lt;
	private LocalDate ld;
	
	public WishMessageGenerator(LocalTime lt, LocalDate ld)
	{
		System.out.println("WishMessageGenerator.WishMessageGenerator(0-param Constructor)");
		this.lt = lt;
		this.ld = ld;
	}
	
	/*public void setLt(LocalTime lt)
	{
		System.out.println("WishMessageGenerator.setLt()");
		this.lt = lt;
		
	}
	
	public void setLd(LocalDate ld)
	{
		System.out.println("WishMessageGenerator.setLd()");
		System.out.println();
		this.ld = ld;
	}*/
	
	
	public String generateMessage(String user)
	{
		System.out.println("WishMessageGenerator.generateMessage()");
		System.out.println();
		System.out.println("Time: "+lt.of(04, 45)+" "+"Date: "+ld.of(2024, 12,31));
		
		int hour = lt.getHour();
		
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
