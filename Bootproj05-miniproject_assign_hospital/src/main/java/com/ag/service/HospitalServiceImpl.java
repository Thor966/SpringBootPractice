package com.ag.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ag.DAO.IHospitalDAO;
import com.ag.modal.Hospital;

@Service("hospitalservice")
public class HospitalServiceImpl implements IHospitalService {

	@Autowired
	private IHospitalDAO dao;
	
	@Override
	public List<Hospital> getAlldetailsofhospital(String location1, String location2, String location3) throws Exception {
		
		location1 = location1.toLowerCase();
		location2 = location2.toLowerCase();
		location3 = location3.toLowerCase();
		
	    List<Hospital> list = dao.getHospitallocation(location1, location2, location3);
	    
	    
		
		return list;
	}

	

}
