// Arbitrary method Injection

package com.ag.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg2")
public class WishMessageGenerator2
{
	LocalTime lt; // HAS-A property
	
	public WishMessageGenerator2()
	{
		System.out.println("WishMessageGenerator2.WishMessageGenerator2(0-param constructor)");
	}
	
	@Autowired
	public void assign(LocalTime lt)
	{
		this.lt = lt;
	}

	// Business method
	public String generateMessage(String user)
	{
		int hour =lt.getHour();
		
		System.out.println("WishMessageGenerator2.generateMessage()");
		
		if(hour<12)
			return "Good Morning"+user;
		else if(hour<16)
			return "Good Afternoon"+user;
		else if(hour<18)
			return "Good Evening"+ user;
		else 
			return "Good Night"+user;
	}
}
