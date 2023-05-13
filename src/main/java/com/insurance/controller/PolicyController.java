package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.services.PolicyService;
/* Task 148 Build the Restful Web Service to delete claim details by Rohini Shinde */

@RestController
public class PolicyController {
	//inject the service
	@Autowired
	private PolicyService policyService;
	
	//Design the Restful web services to delete the data based on the id
	@DeleteMapping("/delete/{id}")
	public void deletePolicyById(@PathVariable("id")Integer id) {
		//calling the method
		policyService.deleteById(id);
	}

}
