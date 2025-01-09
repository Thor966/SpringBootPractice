package com.ag.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ag.sbeans.WishMessageGenerator3;

public class DependencyInjectionTest3 {

	public static void main(String[] args)
	{
		// creating the IOC container
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		// get spring bean object 
		Object obj = ctx.getBean("wmg3");
		
		// type casting
		
		WishMessageGenerator3 generator = (WishMessageGenerator3)obj;
		// passing the values
		String result = generator.generateMessage("Aniket...");
		System.out.println("Result: "+result);
		
		// closing the IOC Container
		ctx.close();
		

	}

}
