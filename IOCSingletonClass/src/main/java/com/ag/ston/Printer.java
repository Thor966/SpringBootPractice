package com.ag.ston;

public class Printer
{
	public static Printer INSTANCE = null;
	private Printer()
	{
		System.out.println("Printer: 0-param constructor...");
	}
	
	public static Printer getInstance()
	{
		if(INSTANCE==null)
			INSTANCE = new Printer();
			return INSTANCE;
	}
	
	// business method
	
			public void printmessage(String msg)
			{
				System.out.println(msg);
			}

}
