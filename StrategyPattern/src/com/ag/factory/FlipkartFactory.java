

// Factory pattern class
package com.ag.factory;

import com.ag.comp.BlueDartCourier;
import com.ag.comp.Courier;
import com.ag.comp.DTDCCourier;
import com.ag.comp.Flipkart;

public class FlipkartFactory
{
	public static Flipkart getInstance( String couriertype)
	{
		Courier courier = null;
		
		if(couriertype.equalsIgnoreCase("dtdc"))
			courier = new DTDCCourier();
			else if(couriertype.equalsIgnoreCase("bludart"))
				courier = new BlueDartCourier();
			else
				throw new IllegalArgumentException("Invalid Courier type");
		
		// creating the flipkart object
		Flipkart fpkt = new Flipkart();
		fpkt.setCourier(courier);
		
		return fpkt;
	}

}
