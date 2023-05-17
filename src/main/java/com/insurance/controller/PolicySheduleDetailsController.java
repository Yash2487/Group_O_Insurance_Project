package com.insurance.controller;

/*
 * Task 158 Design API to add policy schedule details into database
 * by Yash Mate
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PolicySheduleDetails;
import com.insurance.service.PolicySheduleDetailsService;

@RestController
public class PolicySheduleDetailsController {
	// inject service here
	@Autowired
	private PolicySheduleDetailsService detailsService;

	// Design API to add policy schedule details into database
	@PostMapping("/addPolicyScheduleDetails")
	public ResponseEntity<PolicySheduleDetails> addPolicyScheduleDetails(@RequestBody PolicySheduleDetails details) {
		PolicySheduleDetails details2 = detailsService.addPolicyScheduleDetails(details);
		return ResponseEntity.ok().body(details2);
	}

}
