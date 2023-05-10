package com.insurance.task145.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.task145.model.InsuranceClaimDetails;
import com.insurance.task145.service.InsuranceClaimService;

@RestController
public class InsuranceClaimController {

	// Inject the InsuranceClaimService Here
	@Autowired
	private InsuranceClaimService insuranceClaimService;

	@PostMapping("/insertClaimDetails")
	public ResponseEntity<InsuranceClaimDetails> saveInsuranceClaimDetails(
			@RequestBody InsuranceClaimDetails insuranceClaimDetails) {
		InsuranceClaimDetails insurance = insuranceClaimService.saveInsuranceClaimDetails(insuranceClaimDetails);
		return ResponseEntity.ok().body(insurance);

	}

}
