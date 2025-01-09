package com.ag.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ag.cfgs.AppConfig;
import com.ag.sbeans.WishMessageGenerator2;

public class DependencyInjectionTest2 {

	public static void main(String[] args)
	{
		// creating IOC container
		AnnotationConfigApplicationContext aca =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		// getting the spring bean object through generic
		
		WishMessageGenerator2 generator = aca.getBean("wmg2",WishMessageGenerator2.class);
		
		String msg = generator.generateMessage("Aniket...");
		
		System.out.println("Result: "+ msg);
		
		// closing the IOC container
		aca.close();

	}

}
