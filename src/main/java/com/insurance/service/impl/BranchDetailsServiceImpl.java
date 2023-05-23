package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.BranchDetails;
import com.insurance.repository.BranchDetailsRepository;
import com.insurance.service.BranchDetailsService;

/*
 * Task 161: Design API to add branch details into system--------> Abhijit
 * Task 162: Design API to update branch details into system.-------> Rohini
 * Task 163: Design API to fetch branch details from system.----------> Yash
 */
@Service
public class BranchDetailsServiceImpl implements BranchDetailsService {
	// inject repository
	@Autowired
	private BranchDetailsRepository branchDetailsRepository;

	// this will used to fetch branch details from DB
	@Override
	public BranchDetails getBranchDetailsFetch(int id) {
		BranchDetails branchDetailsFetch1 = branchDetailsRepository.findDetailsById(id);
		return branchDetailsFetch1;
	}

	// this will used to add branch details into DB
	@Override
	public BranchDetails saveBranchDetails(BranchDetails branchDetails) {
		BranchDetails branchD = branchDetailsRepository.save(branchDetails);
		return branchD;
	}

	// this will used to update branch details into DB
	@Override
	public BranchDetails updateBranchUpdate(BranchDetails branchDetails) {

		BranchDetails branchUpdate2 = branchDetailsRepository.findById(branchDetails.getBranchId()).orElse(null);
		if (branchUpdate2 != null) {
			branchUpdate2.setBranchName(branchDetails.getBranchName());
			branchDetailsRepository.save(branchUpdate2);
			return branchUpdate2;

		}
		return null;
	}

}
