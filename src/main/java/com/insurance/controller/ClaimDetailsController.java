package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.ClaimDetails;
import com.insurance.services.ClaimDetailsService;

/*Task Number= 146  Build the Restful Web Service to update the claim details
 * By Rohini Shinde
 */
@RestController
public class ClaimDetailsController {
	// inject the service
	@Autowired
	private ClaimDetailsService claimDetailsService;

	// design a restful web service to update the ClaimDetails data into the
	// database
	@PutMapping("/updateClaimData")
	public ClaimDetails updateClaimDetails(@RequestBody ClaimDetails claimDetails) {
		return claimDetailsService.updateClaimDetails(claimDetails);

	}

}
