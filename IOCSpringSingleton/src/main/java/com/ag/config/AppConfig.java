package com.ag.config;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="com.ag.sbeans")
public class AppConfig 
{
	
	public AppConfig()
	{
		System.out.println("AppConfig: 0-param constructor");
	}
	
	
	@Bean(name="lt1")
	@Scope("singleton")
	public LocalTime createTime()
	{
		return LocalTime.now();
	}

	
	@Bean(name="ld1")
	@Scope("singleton")
	public LocalDate createDate()
	{
		return LocalDate.now();
	}

}
