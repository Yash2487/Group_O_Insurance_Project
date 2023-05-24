package com.insurance.service;

import com.insurance.model.BranchDetails;

/*
 * Task 161: Design API to add branch details into system--------> Abhijit
 * Task 162: Design API to update branch details into system.-------> Rohini
 * Task 163: Design API to fetch branch details from system.----------> Yash
 */
public interface BranchDetailsService {

	// this is used to fetch branch details
	public BranchDetails getBranchDetailsFetch(int id);

	// this is used to insert branch details data
	public BranchDetails saveBranchDetails(BranchDetails branchDetails);

	// this is used to update branch details
	public BranchDetails updateBranchUpdate(BranchDetails branchDetails);

}
