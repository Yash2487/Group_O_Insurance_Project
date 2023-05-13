package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.repository.ClaimDetailsDeleteRepository;
import com.insurance.services.ClaimDetailsDeleteService;

/* Task 148 Build the Restful Web Service to delete claim details by Rohini Shinde */
@Service
public class ClaimDetailsDeleteServiceImpl implements ClaimDetailsDeleteService {
	// inject the repository reference
	@Autowired
	private ClaimDetailsDeleteRepository policyRepository;

	@Override
	public void deleteById(Integer id) {
		policyRepository.deleteById(id);

	}

}
