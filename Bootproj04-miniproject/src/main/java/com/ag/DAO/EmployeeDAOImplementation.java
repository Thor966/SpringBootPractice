package com.ag.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ag.modals.Employee;

@Repository("EDAOimpl")
public class EmployeeDAOImplementation implements IEmployeeDAO
{
	private static final String GET_EMPS_DATA = "SELECT * FROM emp WHERE edesg IN (?, ?, ?) ORDER BY edesg";
	
	@Autowired
	private DataSource ds; // HAS_A property
	
	public  List<Employee> getEmployeedetailbydesgn(String desg1, String desg2, String desg3) throws Exception
	{
		List<Employee> list = null;
		
		try(Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(GET_EMPS_DATA);
				){
			
			
			// set the parameter in desg
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			
			try(ResultSet rs = ps.executeQuery();
					
			){
				list = new ArrayList<Employee>();
				
				// getting the store data from the database
				
				while(rs.next())
				{
					
					//copy each object in employee bean class
					Employee emp = new Employee();
					emp.setEno(rs.getString(1));
					emp.setEname(rs.getString(2));
					emp.setSalary(rs.getFloat(4));
					emp.setJob(rs.getString(5));
					
					list.add(emp);
					
					
				}
			}
			
			
		}
		catch(SQLException se)
		{
			se.printStackTrace();
			throw se;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		
		return list;
	}
	
	
}
