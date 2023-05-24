package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PolicyData7;
import com.insurance.service.PolicyData7Service;
/*Task 141 Design the API to add Policy Details into database Done By Rohini Shinde*/

@RestController
public class PolicyData7Controller {
	// inject the service reference
	@Autowired
	private PolicyData7Service policyData7Service;

	@PostMapping("/savePolicyData7")
	public ResponseEntity<PolicyData7> savePolicy7Data(@RequestBody PolicyData7 policyData7) {
		PolicyData7 policies = policyData7Service.savePolicyData7(policyData7);
		return ResponseEntity.ok().body(policies);
	}

}
