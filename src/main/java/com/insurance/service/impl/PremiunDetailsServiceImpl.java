package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.PremiumDetails;
import com.insurance.repository.PremiumDetailsReposiitory;
import com.insurance.service.PremiumDetailsService;

@Service
public class PremiunDetailsServiceImpl implements PremiumDetailsService {
	
	/*Task 152 Design API to save all the premium details into database
	 Task completed By Abhijit Daware*/

	@Autowired
	private PremiumDetailsReposiitory premiumDetailsReposiitory;

	@Override
	public PremiumDetails savePremiumDetails(PremiumDetails premiumDetails) {
		PremiumDetails pd = premiumDetailsReposiitory.save(premiumDetails);
		return pd;
	}
}
