package com.ag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ag.modals.Employee;
import com.ag.service.IEmployeeService;

@Controller("payrollcontroller")
public class PayrollOperationController
{
	@Autowired
	private IEmployeeService service;
	
	public List<Employee> showAllEmployeebydesg(String desg1, String desg2, String desg3)throws Exception
	{
		List<Employee> list = service.getAllEmplyeeDetails(desg1, desg2, desg3);
		
		return list;
	}
	

}
