package com.ag.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ag.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args)
	{
		System.out.println("DependencyInjectionTest.main(Started)");
		// creating the IOC container
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get spring bean object
		Object obj = ctx.getBean("wmg");
		
		// type casting
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		// passing the value
		String result = generator.generateMessage("Aniket...");
		System.out.println("Result: "+result);
		
		// closing the IOC container
		ctx.close();
		System.out.println("DependencyInjectionTest.main(Ended)");
		

	}

}
