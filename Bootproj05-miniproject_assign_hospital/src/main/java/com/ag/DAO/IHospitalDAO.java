package com.ag.DAO;

import java.util.List;

import com.ag.modal.Hospital;

public interface IHospitalDAO 
{
	public List<Hospital> getHospitallocation(String location1, String location2, String location3) throws Exception; 

}
