package com.insurance.service.impl;

//Task 149 Build the Restful web service to add user with multiple 
//claim details -----------> Vinayak
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.UserMultipleClaim;
import com.insurance.repository.UserMultipleClaimRepository;
import com.insurance.services.UserMultilpleClaimService;

@Service
public class UserMultipleClaimServiceImpl implements UserMultilpleClaimService {

	// Inject UserMultipleClaimRepository
	@Autowired
	private UserMultipleClaimRepository userMultipleClaimRepository;

	@Override
	public UserMultipleClaim saveUserMultipleClaim(UserMultipleClaim userMultipleClaim) {
		UserMultipleClaim user = userMultipleClaimRepository.save(userMultipleClaim);
		return user;
	}

}
