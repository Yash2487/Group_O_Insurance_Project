package com.insurance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.PolicyDetails;
import com.insurance.repository.PolicyDetailsRepository;
import com.insurance.service.PolicyDetailsService;

@Service
public class PolicyDetailsServiceImpl implements PolicyDetailsService {

	/*
	 * Task 150 Build the Restful web service to fetch user with multiple claim
	 * details ---------> Abhijit Daware
	 */

	@Autowired
	private PolicyDetailsRepository policyRepository;

	@Override
	public List<PolicyDetails> getPolicy(PolicyDetails policyDetails) {
		List<PolicyDetails> pc = (List<PolicyDetails>) policyRepository.findAll();
		return pc;
	}

}
