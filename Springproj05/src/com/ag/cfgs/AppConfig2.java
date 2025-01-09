package com.ag.cfgs;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.ag.sbeans")
public class AppConfig2
{
	public AppConfig2()
	{
		System.out.println("AppConfig2.AppConfig2()");
	}
	
	@Bean(name="ltime")
	public LocalTime createTime()
	{
		return LocalTime.now();
	}

}
