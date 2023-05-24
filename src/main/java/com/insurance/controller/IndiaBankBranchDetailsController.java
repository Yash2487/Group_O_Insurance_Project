package com.insurance.controller;
//Task 164 Design API to delete branch details from system ------> Vinayak
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.service.IndiaBankBranchDetailsService;

@RestController
public class IndiaBankBranchDetailsController {

	@Autowired
	private IndiaBankBranchDetailsService indiaBranchDetailsService;

	@DeleteMapping("/deleteBranchDetails/{branchId}")
	public void deleteIndiaBranchByBranchId(@PathVariable("branchId") Integer branchId) {

		indiaBranchDetailsService.deleteBranchDetailsBybranchId(branchId);
	}

}
