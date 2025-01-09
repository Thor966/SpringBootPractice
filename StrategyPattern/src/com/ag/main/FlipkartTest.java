package com.ag.main;

import com.ag.comp.Flipkart;
import com.ag.factory.FlipkartFactory;

public class FlipkartTest {

	public static void main(String[] args) 
	{
		Flipkart fpkt1 = FlipkartFactory.getInstance("dtdc");
		
		String fpktresult = fpkt1.shopping(new String[]{"shirt","pants"}, new double[] {800.0,1200.0});
		System.out.println(fpktresult);
		
		
	}

}
