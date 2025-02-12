package com.ag.DAO;

import java.util.List;

import com.ag.modals.Employee;

public interface IEmployeeDAO 
{
	public  List<Employee> getEmployeedetailbydesgn(String desg1, String desg2, String desg3) throws Exception;

}
