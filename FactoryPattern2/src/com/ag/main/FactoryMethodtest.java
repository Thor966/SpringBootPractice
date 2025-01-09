package com.ag.main;

import com.ag.comp.Car;
import com.ag.factory.CarFactory;

public class FactoryMethodtest {

	public static void main(String[] args)
	{
		
		Car car1 = CarFactory.orderCar("standard");
		car1.car();
		System.out.println();
		System.out.println("============================");
		
		Car car2 = CarFactory.orderCar("offroad");
		car2.car();
		System.out.println("============================");
		
		Car car3 = CarFactory.orderCar("luxory");
		car3.car();
		System.out.println("============================");
		
		Car car4 = CarFactory.orderCar("electric");
		car4.car();
		
				
		

	}

}
