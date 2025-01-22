package com.ag.ston;

import java.lang.reflect.Constructor;

public class ReflectionTest {

	public static void main(String[] args) throws Exception 
	{
		// load the class
		Class clazz = Class.forName("com.ag.ston.Printer");
		
		// get all constructor of the current class
		Constructor con[] = clazz.getDeclaredConstructors();
		
		// get access to private constructor
		
		con[0].setAccessible(true);
		
		// create objects
		Object obj1 = con[0].newInstance();
		Object obj2 = con[0].newInstance();
		
		// displaying data
		System.out.println(obj1.getClass()+"  "+obj2.getClass());
		System.out.println(obj1.hashCode()+"  "+obj2.hashCode());
		
	}

}
