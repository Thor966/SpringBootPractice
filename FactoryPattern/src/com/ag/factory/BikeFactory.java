package com.ag.factory;

import com.ag.comp.Bike;
import com.ag.comp.ElectricBike;
import com.ag.comp.OffroadBike;
import com.ag.comp.SportsBike;
import com.ag.comp.StandardBike;

public class BikeFactory
{
	public static Bike orderBike(String type)
	{
		Bike bike = null;
		
		if(type.equalsIgnoreCase("standard"))
			bike = new StandardBike();
		else if(type.equalsIgnoreCase("electric"))
			bike = new ElectricBike();
		else if(type.equalsIgnoreCase("offroad"))
			bike = new OffroadBike();
		else if(type.equalsIgnoreCase("sport"))
			bike = new SportsBike();
		else
			throw new IllegalArgumentException("Invalid Bike type...");
		
		return bike;
		
	}

}
