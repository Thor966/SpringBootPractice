package com.ag.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ag.comp.Amazon;
import com.ag.config.AppConfig;

public class AmazonTest {

	public static void main(String[] args)
	{
		// creating an IOC Container
		AnnotationConfigApplicationContext aca =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		// getting the spring class object through generic
		
		Amazon generator = aca.getBean("amazon", Amazon.class);
		
		// calling the method and passing the value
	String msg = generator.shopping(new String[] {"Mobile","Cover"}, new double[] {20000.0,500.0});
	
	System.out.println(msg);
	
	//closing the IOC container
	aca.close();

	}

}
