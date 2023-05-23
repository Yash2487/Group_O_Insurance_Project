package com.insurance.controller;

//Task 160: Design API to fetch policy schedule details from system -----> Vinayak.
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.IndianPolicyShedule;
import com.insurance.service.IndianPolicySheduleService;

@RestController
public class IndianPolicySheduleController {

	// inject the Service Interface here

	@Autowired
	private IndianPolicySheduleService indianPolicySheduleService;

	@PostMapping("/savePolicyDetails")
	public ResponseEntity<IndianPolicyShedule> savePolicyShedule(@RequestBody IndianPolicyShedule indianPolicyShedule) {
		IndianPolicyShedule shedule = indianPolicySheduleService.savePolicyShedule(indianPolicyShedule);
		return ResponseEntity.ok().body(shedule);

	}

	@GetMapping("/getPolicy/{id}")
	public ResponseEntity<IndianPolicyShedule> getPolicyShedule(@PathVariable("id") Integer id) {
		IndianPolicyShedule indianPolicyShedule = indianPolicySheduleService.getPolicyShedule(id);
		return ResponseEntity.ok().body(indianPolicyShedule);
	}

}
