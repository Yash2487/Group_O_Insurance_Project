package com.insurance.service.impl;

/*
 * Task 158 Design API to add policy schedule details into database
 * by Yash Mate
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.PolicySheduleDetails;
import com.insurance.repository.PolicySheduleDetailsRepository;
import com.insurance.service.PolicySheduleDetailsService;

@Service
public class PolicySheduleDetailsServiceImpl implements PolicySheduleDetailsService {
	// inject repository here
	@Autowired
	private PolicySheduleDetailsRepository detailsRepository;

	@Override
	public PolicySheduleDetails addPolicyScheduleDetails(PolicySheduleDetails details) {

		return detailsRepository.save(details);
	}
}
