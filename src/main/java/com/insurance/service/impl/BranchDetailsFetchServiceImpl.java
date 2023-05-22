package com.insurance.service.impl;

/*
 * Task 163: Design API to fetch branch details from system
 * @author Yash Mate
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.BranchDetailsFetch;
import com.insurance.repository.BranchDetailsFetchRepository;
import com.insurance.service.BranchDetailsFetchService;

@Service
public class BranchDetailsFetchServiceImpl implements BranchDetailsFetchService {
	// inject repository
	@Autowired
	private BranchDetailsFetchRepository branchDetailsFetchRepository;

	@Override
	public BranchDetailsFetch getBranchDetailsFetch(int id) {
		BranchDetailsFetch branchDetailsFetch1 = branchDetailsFetchRepository.findDetailsById(id);
		return branchDetailsFetch1;
	}

}
