package com.ag.service;

import java.util.List;

import com.ag.modals.Employee;

public interface IEmployeeService
{
	public List<Employee> getAllEmplyeeDetails(String desg1, String desg2, String desg3) throws Exception;

}
