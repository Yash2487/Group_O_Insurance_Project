package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.service.DeletePolicyDataService;

/*
 * Task 143 Design Restful API to delete the policy details from system.------> Abhijit Daware
 */

@RestController
public class DeletePolicyDataController {
	@Autowired
	private DeletePolicyDataService detailsPolicyService;

	@DeleteMapping("/deleteData/{id}")
	public void deleteDetailsPolicyId(@PathVariable("id") Integer id) {
		detailsPolicyService.deleteById(id);
	}
}
