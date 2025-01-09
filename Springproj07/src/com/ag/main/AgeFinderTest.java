package com.ag.main;

import java.time.LocalDate;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ag.cfgs.AppConfig;
import com.ag.sbeans.AgeFinder;

public class AgeFinderTest {

	public static void main(String[] args) 
	{
		// creating IOC container 
		AnnotationConfigApplicationContext aca =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		// get spring bean object by using generics
		AgeFinder finder = aca.getBean("age",AgeFinder.class);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your birth date (yyyy-MM-dd): ");
		String input = sc.nextLine();

		try {
		    // Trim whitespace and parse the input
		    LocalDate birthDate = LocalDate.parse(input.trim());
		    String ageMessage = finder.agefind(birthDate);

		    // Display the age
		    System.out.println(ageMessage);
		} catch (Exception e) {
		    System.out.println("Invalid date format. Please enter a valid date in yyyy-MM-dd format.");
		}

		
		// closing the IOC container
		aca.close();
		

	}

}
