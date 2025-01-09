package com.ag.main;

import java.time.LocalDate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ag.cfgs.AppConfig;
import com.ag.sbeans.SeasonFinder;

public class DependencyInjectionTest {

	public static void main(String[] args)
	{
		// creating IOC Container
		AnnotationConfigApplicationContext aca =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		// Using generic we getting the spring bean object
		SeasonFinder finder = aca.getBean("sf",SeasonFinder.class);
		LocalDate currentdate = LocalDate.now();
		int currentmonth = currentdate.getMonthValue();
		
		String Season = finder.Season(currentmonth);
		
		System.out.println("Season: "+Season);
		
		// closing the IOC container
		aca.close();
		

	}

}
