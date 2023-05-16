package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.BranchDetailsInsert;
import com.insurance.service.BranchDetailsInsertService;

/*Design API to add branch details into system
 * Task completed By Abhijit Daware
 */

@RestController
public class BranchDetailsInsertController {
	@Autowired
	private BranchDetailsInsertService branchDetailsService;

	@PostMapping("/getbranchdata")
	public ResponseEntity<BranchDetailsInsert> saveBranchD(@RequestBody BranchDetailsInsert branchDetails) {
		BranchDetailsInsert branchD = branchDetailsService.saveBranchDetails(branchDetails);
		return ResponseEntity.ok().body(branchD);
	}
}
