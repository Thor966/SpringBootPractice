package com.ag.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ag.comp.Printer;

@Configuration
@ComponentScan(basePackages="com.ag.comp")
public class AppConfig 
{
	public AppConfig()
	{
		System.out.println("AppConfig.0-param constructor...");
	}
	
	@Bean(name="prn1")
	public Printer createPrinter1()
	{
		return Printer.getInstance();
	}
	
	
	@Bean(name="prn2")
	public Printer createPrinter2()
	{
		return Printer.getInstance();
	}
	
	

}
