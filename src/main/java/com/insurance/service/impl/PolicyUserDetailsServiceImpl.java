package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.PolicyUserDetails;
import com.insurance.repository.PolicyUserDetailsRepository;
import com.insurance.service.PolicyUserDetailsService;

/* Task 159 Design API to update policy schedule details into database.---------
Task completed By Abhijit daware*/

@Service
public class PolicyUserDetailsServiceImpl implements PolicyUserDetailsService {

	@Autowired
	private PolicyUserDetailsRepository policyUserDetailsRepository;

	@Override
	public PolicyUserDetails getPolicyUserDetailsById(PolicyUserDetails policyUserDetails) {
		PolicyUserDetails psd = policyUserDetailsRepository.findById(policyUserDetails.getId()).orElse(null);
		if (psd != null) {

			psd.setStatus(policyUserDetails.getStatus());
			policyUserDetailsRepository.save(psd);
			return psd;
		}
		return null;
	}

}
