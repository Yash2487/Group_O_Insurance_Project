package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Policy;
import com.insurance.repository.PolicyRepository;
import com.insurance.service.PolicyService;

@Service
public class PolicyServiceImpl implements PolicyService {

	/*
	 * Task 147 Build the Restful web service to get claim details Task completed by
	 * Abhijit Daware
	 */

	@Autowired
	private PolicyRepository policyRepository;

	@Override
	public Policy getPolicyById(Integer id) {
		Policy policy = policyRepository.findById(id);
		return policy;
	}

}
