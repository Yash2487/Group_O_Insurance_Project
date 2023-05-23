package com.insurance.service.impl;

//Task 154 Design API to update premium details into database-----------> Vinayak
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.PremiumDetailsUpdate;
import com.insurance.repository.PremiumDetailsUpdateRepository;
import com.insurance.service.PremiumDetailsUpdateService;

@Service
public class PremiumDetailsUpdateServiceImpl implements PremiumDetailsUpdateService {

	@Autowired
	private PremiumDetailsUpdateRepository updatePremiumDetailsRepository;

	@Override
	public PremiumDetailsUpdate updatePremiumDetails(PremiumDetailsUpdate premiumDetails) {

		return updatePremiumDetailsRepository.save(premiumDetails);

	}

}
