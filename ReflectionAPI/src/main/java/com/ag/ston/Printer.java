package com.ag.ston;

public class Printer 
{
	private static Printer INSTANCE;
	
	public static Printer getInstance()
	{
		if(INSTANCE==null)
			INSTANCE = new Printer();
		
		return INSTANCE;
	}
	
	// business method
	
	public void printerMessage(String msg)
	{
		System.out.println(msg);
	}

}
