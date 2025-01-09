package com.ag.cfgs;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.ag.sbeans")
public class AppConfig 
{
	public void AppConfig()
	{
		System.out.println("AppConfig.AppConfig(0-param constructor)");
	}
	
	@Bean(name="ldate2")
	public LocalDate createDate()
	{
		return LocalDate.now();
	}

}
