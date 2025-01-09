package com.ag.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.ag.sbeans")
public class AppConfig 
{
	public void AppConfig()
	{
		System.out.println("AppConfig.AppConfig()");
	}

}
