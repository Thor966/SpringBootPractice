package com.ag.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ag.DAO.IEmployeeDAO;
import com.ag.modals.Employee;

@Service("service")
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	private IEmployeeDAO dao;
	
	
	public List<Employee> getAllEmplyeeDetails(String desg1, String desg2, String desg3) throws Exception {
		
		  desg1 = desg1.toUpperCase();
          desg2 = desg2.toUpperCase();
          desg3 = desg3.toUpperCase();
		
		List<Employee> list = dao.getEmployeedetailbydesgn(desg1, desg2, desg3);
		
		
		//calculate the gross salary and netsalary
		
		list.sort((t1, t2) -> t1.getEno().compareTo(t2.getEno()));
		
		// calculate the gross salary and net salary
		list.forEach(emp->{
			emp.setGrossSalary(emp.getSalary()+(emp.getSalary()*0.5));
			emp.setNetSalary(emp.getGrossSalary()-(emp.getGrossSalary()*0.2));
		});

		
		return list;
		
	}

}
