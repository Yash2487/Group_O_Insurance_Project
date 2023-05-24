package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.ClaimDetails;
import com.insurance.repository.ClaimDetailsRepository;
import com.insurance.service.ClaimDetailsService;

/*
 * Task 145--Build the Restful web service to add claim details------> Vinayak
 * Task 146--Build the Restful web service to update claim details--------> Rohini
 * Task 147--Build the Restful web service to get claim details-------> Abhijit
 * Task 148--Build the Restful web service to delete claim details ----------> Rohini
 */
@Service
public class ClaimDetailsServiceImpl implements ClaimDetailsService {
	// inject the repository reference
	@Autowired
	private ClaimDetailsRepository claimDetailsRepository;

	// used to add claim details
	@Override
	public ClaimDetails saveClaimDetails(ClaimDetails ClaimDetails) {
		ClaimDetails details = claimDetailsRepository.save(ClaimDetails);

		return details;
	}

	// used to update the claim details
	@Override
	public ClaimDetails updateClaimDetails(ClaimDetails claimDetails) {
		ClaimDetails claimDetail1 = claimDetailsRepository.findById(claimDetails.getId());
		if (claimDetail1 != null) {
			claimDetail1.setClaimStatus(claimDetails.getClaimStatus());
			claimDetailsRepository.save(claimDetail1);
			return claimDetail1;
		}
		return null;
	}

	// used to get claim details
	@Override
	public ClaimDetails getClaimDetailsById(int id) {
		ClaimDetails claimDetails = claimDetailsRepository.findById(id);
		return claimDetails;
	}

	// used to delete claim details
	@Override
	public void deleteById(int id) {
		claimDetailsRepository.deleteById(id);
	}

}
