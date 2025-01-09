package com.ag.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder 
{
	@Autowired
	LocalDate ld; // HAS-A property
	
	
	// Business method
	public String Season(int month)
	{
		int month1 = ld.getMonthValue();
		System.out.println("Month: "+ld.getMonth());
		
		if(month>=2 && month<=5)
			return "Summer";
		else if(month>=6 && month<=9)
			return "Rainy";
		else 
			return "Winter";
			
		
	}
	

}
