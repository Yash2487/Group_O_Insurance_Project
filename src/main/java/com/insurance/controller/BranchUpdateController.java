package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.BranchUpdate;
import com.insurance.services.BranchUpdateService;
/*Task 162 Design the API to update branch details into system*/
@RestController
public class BranchUpdateController {
	//inject the service
	@Autowired
	private BranchUpdateService branchUpdateService;
	@PutMapping("/updateBranchData")
	public BranchUpdate updateBranch(@RequestBody BranchUpdate branchUpdate) {
		return branchUpdateService.updateBranchUpdate(branchUpdate);
		}

}
