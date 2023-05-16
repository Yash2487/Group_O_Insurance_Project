package com.insurance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.PremiumGet;
import com.insurance.repository.PremiumGetRepository;
import com.insurance.services.PremiumGetService;
/*Task  153 Design the API to get all the premium details from the database*/
@Service
public class PremiumGetServiceImpl implements PremiumGetService{
	//inject the repository reference
	@Autowired 
	private PremiumGetRepository premiumGetRepository;

	@Override
	public List<PremiumGet> getAllPremiumData() {
		return (List<PremiumGet>)premiumGetRepository.findAll();
		
	}

}
