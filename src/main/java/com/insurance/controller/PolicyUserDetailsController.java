package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PolicyUserDetails;
import com.insurance.service.PolicyUserDetailsService;

/*
 * Task 159 Design API to update policy schedule details into database.---------
 * Task completed By Abhijit daware
 */

@RestController
public class PolicyUserDetailsController {
	@Autowired
	private PolicyUserDetailsService policyUserDetailsService;

	@PutMapping("/getUserDetails")
	public PolicyUserDetails getPolicyUserDetails(@RequestBody PolicyUserDetails policyUserDetails) {
		PolicyUserDetails psd = policyUserDetailsService.getPolicyUserDetailsById(policyUserDetails);
		return psd;
	}
}
