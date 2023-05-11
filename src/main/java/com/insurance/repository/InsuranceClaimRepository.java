package com.insurance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.InsuranceClaimDetails;

@Repository
public interface InsuranceClaimRepository extends CrudRepository<InsuranceClaimDetails, Integer> {
	
	

}
