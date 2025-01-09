package com.ag.cfgs;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.ag.sbeans")
public class AppConfig 
{
	
	public AppConfig()
	{
		System.out.println("AppConfig.AppConfig()");
	}
	
	
	// injection methods
	@Bean(name="ltime")
	public LocalTime createTime()
	{
		return LocalTime.now();
	}
	
	@Bean(name="ldate")
	public LocalDate createDate()
	{
		return LocalDate.now();
	}
	

}
