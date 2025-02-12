package com.ag;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ag.controller.PayrollOperationController;
import com.ag.modals.Employee;

@SpringBootApplication
public class Bootproj04MiniprojectApplication {

	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext aca = SpringApplication.run(Bootproj04MiniprojectApplication.class, args);
				
				Scanner sc = new Scanner(System.in);
		){
			
			// get spring bean object of controller class
			
			PayrollOperationController poc = aca.getBean("payrollcontroller",PayrollOperationController.class);
			
			// read the input from the user
			
			System.out.println("Enter the desgination 1: ");
			String desg11 = sc.next();
			
			System.out.println("Enter the Desgination 2: ");
			String desg22 = sc.next();
			
			System.out.println("Enter the Desgination 3: ");
			String desg33 = sc.next();
			
			// invoking the business method
			
			List<Employee> list = poc.showAllEmployeebydesg(desg11, desg22, desg33);
//			// Display result
			System.out.println("Employee belongs to : "+desg11+ " "+desg22+" "+desg33+" "+"are: ");
			
			
			list.forEach(emp->{
				System.out.println(emp+"  ");
				System.out.println();
			});
			
			
			
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
