package com.ag.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ag.sbeans.WishMessageGenerator2;

public class DependencyInjectionTest2 {

	public static void main(String[] args)
	{
		System.out.println("DependencyInjectionTest2.main(Started...)");
		// creating IOC container
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		// get the spring bean object
		Object obj = ctx.getBean("wmg2");
		
		// type casting
		WishMessageGenerator2 generator = (WishMessageGenerator2)obj;
		
		// passing the value in business method
		 String result = generator.generateMessage2("Aniket...");
		 System.out.println("Result "+result);
		 
		 // closing the IOC container
		 ctx.close();
		 System.out.println("DependencyInjectionTest2.main(Ended....)");

	}

}
