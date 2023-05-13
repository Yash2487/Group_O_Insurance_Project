package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.repository.PolicyRepository;
import com.insurance.services.PolicyService;
/* Task 148 Build the Restful Web Service to delete claim details by Rohini Shinde */

@Service
public class PolicyServiceImpl implements PolicyService {
	// inject the repository reference
	@Autowired
	private PolicyRepository policyRepository;

	@Override
	public void deleteById(Integer id) {
		policyRepository.deleteById(id);

	}

}
