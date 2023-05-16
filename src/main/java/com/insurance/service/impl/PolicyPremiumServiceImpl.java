package com.insurance.service.impl;

/*Task 156 Design the API to store user with multiple premium details into database*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.PolicyPremium;
import com.insurance.repository.PolicyPremiumRepository;
import com.insurance.services.PolicyPremiumService;

@Service
public class PolicyPremiumServiceImpl implements PolicyPremiumService {
	// inject the PolicyRepository
	@Autowired
	private PolicyPremiumRepository policyRepository;

	@Override
	public PolicyPremium savePolicy(PolicyPremium policy) {
		PolicyPremium policies = policyRepository.save(policy);
		return policies;
	}

}
