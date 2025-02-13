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

import com.ag.modal.Hospital;

@Repository("hospitaldao")
public class HospitalDAOimpl implements IHospitalDAO
{

	private static final String HOSPITAL_DATA = "select * from springhospital where location IN(?,?,?) order by location";
	
	@Autowired
	private DataSource ds; // HSA-A property
	
	@Override
	public List<Hospital> getHospitallocation(String location1, String location2, String location3) throws SQLException {
		
		List<Hospital> list;
		
		try(Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(HOSPITAL_DATA);
				){
			
			ps.setString(1, location1);
			ps.setString(2, location2);
			ps.setString(3, location3);
			
			try(ResultSet rs = ps.executeQuery();
					){
				
				list = new ArrayList<Hospital>();
				
				while(rs.next())
				{
					Hospital hos = new Hospital();
					hos.setHname(rs.getString(1));
					hos.setHaddr(rs.getString(2));
					hos.setContactno(rs.getLong(3));
					hos.setOpenhour(rs.getString(4));
					hos.setMedspecial(rs.getString(5));
					hos.setLocation(rs.getString(6));
					
					list.add(hos);
				}
				
				
				
			}//try
			
		}// try1
		catch(SQLException se)
		{
			throw se;
		}
		catch(Exception e)
		{
			throw e;
		}
		
		return list;
	}
	

}
