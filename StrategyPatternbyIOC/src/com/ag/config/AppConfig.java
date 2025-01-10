package com.ag.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.ag.comp")
public class AppConfig 
{
	public AppConfig()
	{
		System.out.println("AppConfig:- 0-parameter constructor...");
	}

}
