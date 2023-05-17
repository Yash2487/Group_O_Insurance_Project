package com.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PolicyDetails;
import com.insurance.service.PolicyDetailsService;
import com.insurance.service.PolicyService;

@RestController
public class PolicyDetailsController {
	
	/*
	 * Task 150 Build the Restful web service to fetch user with multiple claim details --------->
	 *  Abhijit Daware
	 */

	@Autowired
	private PolicyDetailsService policyDetailsService;

	@GetMapping("/getpolicy")
	public List<PolicyDetails> getPolicy(PolicyDetails policyDetails) {
		List<PolicyDetails> list=policyDetailsService.getPolicy(policyDetails);
		return list;
	}
}
