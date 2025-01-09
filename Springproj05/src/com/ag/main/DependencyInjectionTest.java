package com.ag.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ag.cfgs.AppConfig;
import com.ag.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) 
	{
		System.out.println("DependencyInjectionTest.main(Started...)");
		// creating the IOC container
		
		AnnotationConfigApplicationContext aca =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		// getting the spring bean object and type casting
		WishMessageGenerator generator = (WishMessageGenerator)aca.getBean("wmg");
		
		// passing the value to the business method 
		String msg = generator.generateMessage("Aniket...");
		System.out.println("Result: "+ msg);
		//closing the IOC container
		aca.close();
		System.out.println("DependencyInjectionTest.main(Ended...)");
	}

}
