package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.PolicyData7;
import com.insurance.repository.PolicyData7Repository;
import com.insurance.service.PolicyData7Service;
/*Task 141 Design the API to add Policy Details into database Done By Rohini Shinde*/

@Service
public class PolicyData7ServiceImpl implements PolicyData7Service {
	// inject the repository reference
	@Autowired
	private PolicyData7Repository policyData7Repository;

	@Override
	public PolicyData7 savePolicyData7(PolicyData7 policyData7) {
		PolicyData7 policies = policyData7Repository.save(policyData7);
		return policies;
	}

}
