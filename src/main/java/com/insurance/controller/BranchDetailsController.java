package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.BranchDetails;
import com.insurance.service.BranchDetailsService;

/*
 * Task 161: Design API to add branch details into system--------> Abhijit
 * Task 162: Design API to update branch details into system.-------> Rohini
 * Task 163: Design API to fetch branch details from system.----------> Yash
 */
@RestController
public class BranchDetailsController {
	// insert service here
	@Autowired
	private BranchDetailsService branchDetailsService;

	/*
	 * Task 161: Design API to add branch details into system
	 * 
	 * @author Abhijit Daware
	 */
	@PostMapping("/getbranchdata")
	public ResponseEntity<BranchDetails> saveBranchD(@RequestBody BranchDetails branchDetails) {
		BranchDetails branchD = branchDetailsService.saveBranchDetails(branchDetails);
		return ResponseEntity.ok().body(branchD);
	}

	/*
	 * Task 162: Design API to update branch details into system
	 * 
	 * @author Rohini Shinde
	 */
	@PutMapping("/updateBranchData")
	public BranchDetails updateBranch(@RequestBody BranchDetails branchDetails) {
		return branchDetailsService.updateBranchUpdate(branchDetails);
	}

	/*
	 * Task 163: Design API to fetch branch details from system
	 * 
	 * @author Yash Mate
	 */
	@GetMapping("/getBranchDetails/{id}")
	public ResponseEntity<BranchDetails> getBranchDetailsFetch(@PathVariable("id") int id) {
		BranchDetails branchDetailsFetch2 = branchDetailsService.getBranchDetailsFetch(id);
		return ResponseEntity.ok().body(branchDetailsFetch2);
	}

}
