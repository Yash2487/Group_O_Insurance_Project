package com.insurance.service.impl;
//Task 164 Design API to delete branch details from system ------> Vinayak
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.repository.IndiaBranchDetailsRepository;
import com.insurance.services.IndiaBranchDetailsService;

@Service
public class IndiaBranchDetailsServiceImpl implements IndiaBranchDetailsService {

	@Autowired
	private IndiaBranchDetailsRepository indiaBranchDetailsRepository;

	@Override
	public void deleteBranchDetailsBybranchId(int branchId) {
		indiaBranchDetailsRepository.deleteById(branchId);

	}

}