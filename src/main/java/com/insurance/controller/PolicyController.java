package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Policy;
import com.insurance.service.PolicyService;

@RestController
public class PolicyController {
    
	/* Task 147 Build the Restful web service to get claim details 
	 * Task completed by Abhijit Daware*/
	
	@Autowired
	private PolicyService policyService;

	@GetMapping("/policydetails/{id}")
	public ResponseEntity<Policy> getPolicyById(@PathVariable("id") Integer id) {
		Policy pc = policyService.getPolicyById(id);
		return ResponseEntity.ok().body(pc);
	}
}
