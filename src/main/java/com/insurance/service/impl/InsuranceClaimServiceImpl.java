package com.insurance.service.impl;
//IP- 2--- 144*--Build the Restful web service to add claim details------> Vinayak
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.InsuranceClaimDetails;
import com.insurance.repository.InsuranceClaimRepository;
import com.insurance.service.InsuranceClaimService;

@Service
public class InsuranceClaimServiceImpl implements InsuranceClaimService {

	// Inject the InsuranceClaimRepository here
	@Autowired
	private InsuranceClaimRepository insuranceClaimRepository;

	@Override
	public InsuranceClaimDetails saveInsuranceClaimDetails(InsuranceClaimDetails insuranceClaimDetails) {
		InsuranceClaimDetails details = insuranceClaimRepository.save(insuranceClaimDetails);

		return details;
	}

}
