package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.ClaimDetails;
import com.insurance.service.ClaimDetailsService;

/*
 * Task 145--Build the Restful web service to add claim details------> Vinayak
 * Task 146--Build the Restful web service to update claim details--------> Rohini
 * Task 147--Build the Restful web service to get claim details-------> Abhijit
 * Task 148--Build the Restful web service to delete claim details ----------> Rohini
 */
@RestController
public class ClaimDetailsController {
	// inject the service
	@Autowired
	private ClaimDetailsService claimDetailsService;

	/*
	 * Build the Restful web service to add claim details
	 * 
	 * @author Vinayak
	 */
	@PostMapping("/insertClaimDetails")
	public ResponseEntity<ClaimDetails> saveInsuranceClaimDetails(@RequestBody ClaimDetails claimDetails) {
		ClaimDetails claimDetails1 = claimDetailsService.saveClaimDetails(claimDetails);
		return ResponseEntity.ok().body(claimDetails1);

	}

	/*
	 * Build the Restful web service to update claim details
	 * 
	 * @author Rohini
	 */
	@PutMapping("/updateClaimData")
	public ClaimDetails updateClaimDetails(@RequestBody ClaimDetails claimDetails) {
		return claimDetailsService.updateClaimDetails(claimDetails);
	}

	/*
	 * Build the Restful web service to get claim details
	 * 
	 * @author Abhijit
	 */
	@GetMapping("/policydetails/{id}")
	public ResponseEntity<ClaimDetails> getPolicyById(@PathVariable("id") Integer id) {
		ClaimDetails pc = claimDetailsService.getClaimDetailsById(id);
		return ResponseEntity.ok().body(pc);
	}

	/*
	 * Build the Restful web service to delete claim details
	 * 
	 * @author Rohini
	 */
	@DeleteMapping("/delete/{id}")
	public void deletePolicyById(@PathVariable("id") Integer id) {
		// calling the method
		claimDetailsService.deleteById(id);
	}
}
