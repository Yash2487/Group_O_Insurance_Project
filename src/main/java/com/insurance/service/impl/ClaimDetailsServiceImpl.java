package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.ClaimDetails;
import com.insurance.repository.ClaimDetailsRepository;
import com.insurance.services.ClaimDetailsService;

/*Task Number= 146  Build the Restful Web Service to update the claim details
 * By Rohini Shinde
 */
@Service
public class ClaimDetailsServiceImpl implements ClaimDetailsService {
	// inject the repository reference
	@Autowired
	private ClaimDetailsRepository claimDetailsRepository;

	@Override
	public ClaimDetails updateClaimDetails(ClaimDetails claimDetails) {
		ClaimDetails claimDetail1 = claimDetailsRepository.findById(claimDetails.getId()).orElse(null);
		if (claimDetail1 != null) {
			claimDetail1.setClaimStatus(claimDetails.getClaimStatus());
			claimDetailsRepository.save(claimDetail1);
			return claimDetail1;
		}
		return null;
	}
}
