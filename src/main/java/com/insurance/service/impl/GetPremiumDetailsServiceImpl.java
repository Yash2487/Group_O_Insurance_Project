package com.insurance.service.impl;
//Task 157 Design API to get user with multiple premium details from database--------> Vinayak

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.GetPremiumDetails;
import com.insurance.repository.GetPremiumDetailsRepository;
import com.insurance.service.GetPremiumDetailsService;

@Service
public class GetPremiumDetailsServiceImpl implements GetPremiumDetailsService {

	// Inject the GetPremiumDetailsRepository
	@Autowired
	private GetPremiumDetailsRepository getPremiumDetailsRepository;

	@Override
	public GetPremiumDetails savePremiumDetails(GetPremiumDetails getPremiumDetails) {
		return getPremiumDetailsRepository.save(getPremiumDetails);

	}

	@Override
	public GetPremiumDetails getPremiumDetails(Integer Id) {
		GetPremiumDetails getDetails = getPremiumDetailsRepository.findById(Id);
		return getDetails;
	}

}
