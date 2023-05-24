package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.repository.DeletePolicyDataRepository;
import com.insurance.service.DeletePolicyDataService;

/*
 * Task 143 Design Restful API to delete the policy details from system.------> Abhijit Daware
 */

@Service
public class DeletePolicyDataServiceImpl implements DeletePolicyDataService {
	@Autowired
	private DeletePolicyDataRepository detailsPolicyRepository;

	@Override
	public void deleteById(Integer id) {
		detailsPolicyRepository.deleteById(id);

	}

}
