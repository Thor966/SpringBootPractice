package com.ag.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("amazon")
public class Amazon 
{
	@Autowired
	private Courier courier; // HAS-A property
	
	
	// Business method
	public String shopping(String[] items, double[] prices)
	{
		double billAmount = 0.0;
		
		for(double p: prices)
		{
			billAmount = billAmount+p;
		}
		
		// generating tha order id dynamically
		int oid = new Random().nextInt(10000);
		
		String msg = courier.courier(oid);
		
		return Arrays.toString(items)+" and prices of the items.."+Arrays.toString(prices)+" Bill Amount is:- "+billAmount+" "+billAmount;
	}
	

}
