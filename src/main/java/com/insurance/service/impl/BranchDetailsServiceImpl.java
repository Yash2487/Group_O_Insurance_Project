package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.BranchDetails;
import com.insurance.repository.BranchDetailsRepository;
import com.insurance.service.BranchDetailsService;

/*Design API to add branch details into system
 * Task completed By Abhijit Daware
 */

@Service
public class BranchDetailsServiceImpl implements BranchDetailsService {
	@Autowired
	private BranchDetailsRepository branchDetailsRepository;

	@Override
	public BranchDetails saveBranchDetails(BranchDetails branchDetails) {
		BranchDetails branchD = branchDetailsRepository.save(branchDetails);
		return branchD;
	}

}
