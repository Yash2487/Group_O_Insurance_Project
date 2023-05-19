package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.insurance.model.BranchUpdate;
import com.insurance.repository.BranchUpdateRepository;
import com.insurance.services.BranchUpdateService;
/*Task 162 Design the API to update branch details into system*/
@Service
public class BranchUpdateServiceImpl implements BranchUpdateService {
	// inject the repository reference
	@Autowired
	private BranchUpdateRepository branchUpdateRepository;

	@Override
	public BranchUpdate updateBranchUpdate(BranchUpdate branchUpdate) {

		BranchUpdate branchUpdate2 = branchUpdateRepository.findById(branchUpdate.getBranchId()).orElse(null);
		if (branchUpdate2 != null) {
			branchUpdate2.setBranchName(branchUpdate.getBranchName());
			branchUpdateRepository.save(branchUpdate);
			return branchUpdate2;

		}
		return null;
	}

}
