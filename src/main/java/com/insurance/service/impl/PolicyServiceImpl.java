package com.insurance.service.impl;

/*Task 156 Design the API to store user with multiple premium details into database*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Policy;
import com.insurance.repository.PolicyRepository;
import com.insurance.services.PolicyService;

@Service
public class PolicyServiceImpl implements PolicyService {
	// inject the PolicyRepository
	@Autowired
	private PolicyRepository policyRepository;

	@Override
	public Policy savePolicy(Policy policy) {
		Policy policies = policyRepository.save(policy);
		return policies;
	}

}
