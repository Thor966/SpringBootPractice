package com.ag.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ag.comp.PersonInfo;
import com.ag.config.AppConfig;

public class PropertiesTest {

	public static void main(String[] args) 
	{
		// creating IOC container
		
		AnnotationConfigApplicationContext aca = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// getting the spring bean object
		
		PersonInfo info = aca.getBean("pInfo", PersonInfo.class);
		
		System.out.println(info);
	}

}
