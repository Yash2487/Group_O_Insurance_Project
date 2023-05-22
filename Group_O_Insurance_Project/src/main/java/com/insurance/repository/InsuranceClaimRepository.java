package com.insurance.repository;

//IP- 2--- 144*--Build the Restful web service to add claim details------> Vinayak
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.InsuranceClaimDetails;

@Repository
public interface InsuranceClaimRepository extends CrudRepository<InsuranceClaimDetails, Integer> {

}
