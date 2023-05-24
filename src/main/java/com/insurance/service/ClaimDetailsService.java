package com.insurance.service;

import com.insurance.model.ClaimDetails;

public interface ClaimDetailsService {

	ClaimDetails updateClaimDetails(ClaimDetails claimDetails);

	void deleteById(int id);

	ClaimDetails saveClaimDetails(ClaimDetails ClaimDetails);

	ClaimDetails getClaimDetailsById(int id);

	

}
