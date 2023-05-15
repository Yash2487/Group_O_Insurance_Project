package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.BranchDetails;
import com.insurance.service.BranchDetailsService;

/*Design API to add branch details into system
 * Task completed By Abhijit Daware
 */

@RestController
public class BranchDetailsController {
	@Autowired
	private BranchDetailsService branchDetailsService;

	@PostMapping("/getbranchdata")
	public ResponseEntity<BranchDetails> saveBranchD(@RequestBody BranchDetails branchDetails) {
		BranchDetails branchD = branchDetailsService.saveBranchDetails(branchDetails);
		return ResponseEntity.ok().body(branchD);
	}
}
