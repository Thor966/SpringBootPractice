package com.ag.main;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ag.config.AppConfig;
import com.ag.sbeans.WishMessageGenerator;

public class SigletonClassTest {

	public static void main(String[] args) {
		// creating IOC container
		
		AnnotationConfigApplicationContext aca =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		// getting the spring bean object
		
		WishMessageGenerator generator = aca.getBean("wmg", WishMessageGenerator.class);
		WishMessageGenerator generator1 = aca.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator generator2 = aca.getBean("wmg", WishMessageGenerator.class);
		
		System.out.println(generator.hashCode()+" "+ generator1.hashCode()+" "+ generator2.hashCode());
		
		System.out.println("generator==generator1 "+ (generator==generator1));
		System.out.println("generator1==generator2 "+ (generator1==generator2));
		
		LocalTime lt1 = aca.getBean("lt1", LocalTime.class);
		LocalTime  lt2 = aca.getBean("lt1", LocalTime.class);
		
		System.out.println(lt1.hashCode()+" "+ lt2.hashCode());
		System.out.println("lt1==ld1 " + (lt1==lt2));
		
		
		
		// closing the connection
		aca.close();

	}

}
