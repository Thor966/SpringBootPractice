package com.ag.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ag.sbeans.WishMessageGenerator;

public class DependencyInjectionTest 
{
	public static void main(String [] args)
	{
		System.out.println("Main Method has been started...");
		System.out.println();
		// creating IOC container 
//		FileSystemXmlApplicationContext ctx = 
//				new FileSystemXmlApplicationContext("src/com/ag/cfs/applicationContext.xml");
		
//		ClassPathXmlApplicationContext ctx =
//				new ClassPathXmlApplicationContext("com/ag/cfs/applicationContext.xml");
		
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the spring bean object 
		Object obj = ctx.getBean("wmg");
		
		// type casting
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		
		String result = generator.generateWishMessage("Aniket....");
		System.out.println("result: "+result);
		
		// closing the IOC container
		ctx.close();
		System.out.println("Main Method is Ended....");
	}

}
