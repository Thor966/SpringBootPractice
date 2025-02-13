package com.ag.service;

import java.util.List;

import com.ag.modal.Hospital;

public interface IHospitalService
{
	public List<Hospital> getAlldetailsofhospital(String location1, String location2, String location3) throws Exception;

}
