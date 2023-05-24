package com.insurance.service.impl;
//Task 164 Design API to delete branch details from system ------> Vinayak
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.repository.IndiaBankBranchDetailsRepository;
import com.insurance.service.IndiaBankBranchDetailsService;

@Service
public class IndiaBankBranchDetailsServiceImpl implements IndiaBankBranchDetailsService {

	@Autowired
	private IndiaBankBranchDetailsRepository indiaBranchDetailsRepository;

	@Override
	public void deleteBranchDetailsBybranchId(int branchId) {
		indiaBranchDetailsRepository.deleteById(branchId);

	}

}
