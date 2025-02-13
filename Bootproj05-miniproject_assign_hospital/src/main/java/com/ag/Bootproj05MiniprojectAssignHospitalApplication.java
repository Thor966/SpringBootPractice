package com.ag;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ag.Controller.HospitalController;
import com.ag.modal.Hospital;

@SpringBootApplication
public class Bootproj05MiniprojectAssignHospitalApplication {

	private static Logger logger = LoggerFactory.getLogger(Bootproj05MiniprojectAssignHospitalApplication.class);

	
	public static void main(String[] args) {
		
		logger.debug("main() method started...");
		
		try(ConfigurableApplicationContext aca = SpringApplication.run(Bootproj05MiniprojectAssignHospitalApplication.class, args);
				Scanner sc = new Scanner(System.in);
				){
			// getting the controller spring bean object 
			HospitalController hs = aca.getBean("hospitalcontrol",HospitalController.class);
			logger.info("getting the spring bean bean objeect successfully...");
			
			// get location from the user
			System.out.println("Enter the first location: ");
			String location1 = sc.next();
			
			System.out.println("Enter the Second Location: ");
			String location2 = sc.next();
			
			System.out.println("Enter ther third location:  ");
			String location3 = sc.next();
			logger.debug("Get location by user added...");
			
			// passing the user input to controller class
			List<Hospital> list = hs.getalldetailsbylocation(location1, location2, location3);
			logger.debug("The user input is pssed to the controller class...");
			
			System.out.println("Your Enter hospitals is: "+location1+" "+location2+" "+location3);
			
			list.forEach(hos->{
				System.out.println(hos+" ");
				System.out.println();
			});
			
			logger.debug("The hospital data printed successfully on console....");
			
			
		}
		catch(SQLException se)
		{
			se.printStackTrace();
			logger.error("Getting known Error: "+se.getMessage());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			logger.error("Getting Unknown Error: "+e.getMessage());
		}
	}

}
