package com.insurance.service;

import java.util.List;

import com.insurance.model.PolicyDetails;

public interface PolicyDetailsService {

	/*
	 * Task 150 Build the Restful web service to fetch user with multiple claim details --------->
	 *  Abhijit Daware
	 */
	
	public List<PolicyDetails> getPolicy(PolicyDetails policyDetails);
}
