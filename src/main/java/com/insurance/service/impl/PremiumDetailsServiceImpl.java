package com.insurance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.PremiumDetails;
import com.insurance.repository.PremiumDetailsRepository;
import com.insurance.service.PremiumDetailsService;

/*
 * Task 151 Build the Restful web service to
 * get all the policy premium details for specific duration
 * by-> Yash
 */
@Service
public class PremiumDetailsServiceImpl implements PremiumDetailsService {

	// inject repository here
	@Autowired
	private PremiumDetailsRepository premiumDetailsRepository;

	@Override
	public List<PremiumDetails> getEmployeeData(String policyCommencementDate) {

		return premiumDetailsRepository.findByDate(policyCommencementDate);
	}

}
