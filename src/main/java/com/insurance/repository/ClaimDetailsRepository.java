package com.insurance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.ClaimDetails;

/*Task Number= 146  Build the Restful Web Service to update the claim details
 * By Rohini Shinde
 */
@Repository
public interface ClaimDetailsRepository extends CrudRepository<ClaimDetails, Integer> {

//	public ClaimDetails (ClaimDetails claimDetails);

}
