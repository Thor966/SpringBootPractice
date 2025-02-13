package com.ag.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ag.modal.Hospital;
import com.ag.service.IHospitalService;

@Controller("hospitalcontrol")
public class HospitalController 
{
	@Autowired
	private IHospitalService service;
	
	public List<Hospital> getalldetailsbylocation(String location1, String location2, String location3) throws Exception{
		
		List<Hospital> list = service.getAlldetailsofhospital(location1, location2, location3);
		
		return list;
	}

}
