package com.insurance.controller;

/*
 * Task 163: Design API to fetch branch details from system
 * @author Yash Mate
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.BranchDetailsFetch;
import com.insurance.service.BranchDetailsFetchService;

@RestController
public class BranchDetailsFetchController {
	// insert service here
	@Autowired
	private BranchDetailsFetchService branchDetailsFetchService;

	// Design API to fetch branch details from system
	@GetMapping("/getBranchDetails/{id}")
	public ResponseEntity<BranchDetailsFetch> getBranchDetailsFetch(@PathVariable("id") int id) {
		BranchDetailsFetch branchDetailsFetch2 = branchDetailsFetchService.getBranchDetailsFetch(id);
		return ResponseEntity.ok().body(branchDetailsFetch2);
	}

}
