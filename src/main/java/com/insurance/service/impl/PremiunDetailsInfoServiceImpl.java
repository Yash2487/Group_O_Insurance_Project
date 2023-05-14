package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.PremiumDetailsInfo;
import com.insurance.repository.PremiumDetailsInfoReposiitory;
import com.insurance.service.PremiumDetailsInfoService;

@Service
public class PremiunDetailsInfoServiceImpl implements PremiumDetailsInfoService {
	
	/*Task 152 Design API to save all the premium details into database
	 Task completed By Abhijit Daware*/

	@Autowired
	private PremiumDetailsInfoReposiitory premiumDetailsReposiitory;

	@Override
	public PremiumDetailsInfo savePremiumDetails(PremiumDetailsInfo premiumDetails) {
		PremiumDetailsInfo pd = premiumDetailsReposiitory.save(premiumDetails);
		return pd;
	}
}
