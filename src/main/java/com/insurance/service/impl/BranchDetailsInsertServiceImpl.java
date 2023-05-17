package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.BranchDetailsInsert;
import com.insurance.repository.BranchDetailsInsertRepository;
import com.insurance.service.BranchDetailsInsertService;

/*Design API to add branch details into system
 * Task completed By Abhijit Daware
 */

@Service
public class BranchDetailsInsertServiceImpl implements BranchDetailsInsertService {
	@Autowired
	private BranchDetailsInsertRepository branchDetailsRepository;

	@Override
	public BranchDetailsInsert saveBranchDetails(BranchDetailsInsert branchDetails) {
		BranchDetailsInsert branchD = branchDetailsRepository.save(branchDetails);
		return branchD;
	}

}
