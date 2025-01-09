
// Target Class
package com.ag.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart 
{
	private Courier courier; // HAS-A prperty
	
	// setter method
	public void setCourier(Courier courier)
	{
		this.courier = courier;
	}
	
	// Business Logics
	public String shopping(String items[], double prices[])
	{
		double billAmount = 0.0;
		for(double p: prices)
		{
			billAmount = billAmount+p;
		}
		
		// creating the random order id
		int oid = new Random().nextInt(10000);
		// passing the order id
		String msg = courier.deliver(oid);
		
		return Arrays.toString(items)+"items with amount:::"+billAmount+" "+msg;
	}

}
