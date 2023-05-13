package com.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PremiumDetails;
import com.insurance.service.PremiumDetailsService;

/*
 * Task 151 Build the Restful web service to
 * get all the policy premium details for specific duration
 * by-> Yash
 */
@RestController
public class PremiumDetailsController {

	// inject service here
	@Autowired
	private PremiumDetailsService premiumDetailsService;

	/*
	 * Build the Restful web service to get all the policy premium details for
	 * specific duration
	 */
	@GetMapping("/getPolicyPremiumDetails/{policyCommencementDate}")
	public ResponseEntity<List<PremiumDetails>> getEmployeeData(
			@PathVariable("policyCommencementDate") String policyCommencementDate) {
		List<PremiumDetails> premiumDetails = premiumDetailsService.getEmployeeData(policyCommencementDate);
		return ResponseEntity.ok().body(premiumDetails);
	}

}
