package com.ag.comp;

import org.springframework.stereotype.Component;

@Component("prn")

public class Printer {
	private static Printer INSTANCE;

	public static Printer getInstance() 
	{
		if (INSTANCE == null)
			INSTANCE = new Printer();

		return INSTANCE;
	}
	
	// b.method
	public void printMessage(String msg)
	{
		System.out.println(msg);
	}

}
