package com.ag.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ag.cfgs.AppConfig;
import com.ag.comp.Printer;

public class SingletonClassasbeanTest {

	public static void main(String[] args) 
	{
		// creating IOC container
		
		AnnotationConfigApplicationContext aca =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		// getting the spring bean object
		
		Printer pr1 = aca.getBean("prn1", Printer.class);
		Printer pr2 = aca.getBean("prn1", Printer.class);
		System.out.println(pr1.hashCode()+" "+ pr2.hashCode());
		
		Printer p3 = aca.getBean("prn2", Printer.class);
		Printer p4 = aca.getBean("prn2", Printer.class);
		System.out.println(p3.hashCode()+"  "+p4.hashCode());
				
		

	}

}
