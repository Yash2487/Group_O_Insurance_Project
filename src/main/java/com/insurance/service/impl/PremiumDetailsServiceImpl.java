package com.insurance.service.impl;
//Task 154 Design API to update premium details into database-----------> Vinayak
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.PremiumDetails;
import com.insurance.repository.UpdatePremiumDetailsRepository;
import com.insurance.service.UpdatePremiumDetailsService;

@Service
public class PremiumDetailsServiceImpl implements UpdatePremiumDetailsService {
	@Autowired
	private UpdatePremiumDetailsRepository updatePremiumDetailsRepository;

	@Override
	public PremiumDetails updatePremiumDetails(PremiumDetails premiumDetails) {

		return updatePremiumDetailsRepository.save(premiumDetails);

	}

}
