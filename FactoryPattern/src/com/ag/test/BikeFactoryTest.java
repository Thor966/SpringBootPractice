package com.ag.test;

import com.ag.comp.Bike;
import com.ag.factory.BikeFactory;

public class BikeFactoryTest {

	public static void main(String[] args)
	{
		
		Bike bike1 = BikeFactory.orderBike("standard");
		bike1.bike();
		System.out.println("===================================");
		
		Bike bike2 = BikeFactory.orderBike("electric");
		bike2.bike();
		System.out.println("===================================");
		
		Bike bike3 = BikeFactory.orderBike("offroad");
		bike3.bike();
		System.out.println("===================================");
		
		Bike bike4 = BikeFactory.orderBike("sport");
		bike4.bike();
		
		

	}

}
