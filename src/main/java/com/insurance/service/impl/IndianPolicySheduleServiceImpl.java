package com.insurance.service.impl;

//Task 160: Design API to fetch policy schedule details from system -----> Vinayak.
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.IndianPolicyShedule;
import com.insurance.repository.IndianPolicySheduleRepository;
import com.insurance.service.IndianPolicySheduleService;

@Service
public class IndianPolicySheduleServiceImpl implements IndianPolicySheduleService {

	// Inject the IndianPolicySheduleRepository Repository Here
	@Autowired
	private IndianPolicySheduleRepository indianPolicySheduleRepository;

	@Override
	public IndianPolicyShedule getPolicyShedule(Integer Id) {
		IndianPolicyShedule policy = indianPolicySheduleRepository.findById(Id);
		return policy;
	}

	@Override
	public IndianPolicyShedule savePolicyShedule(IndianPolicyShedule indianPolicyShedule) {
		IndianPolicyShedule policyTable = indianPolicySheduleRepository.save(indianPolicyShedule);
		return policyTable;
	}

}
