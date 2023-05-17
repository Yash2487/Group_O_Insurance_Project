package com.insurance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.PolicyUserDetails;

/*
 * Task 159 Design API to update policy schedule details into database.---------
 * Task completed By Abhijit daware
 */

@Repository
public interface PolicyUserDetailsRepository extends CrudRepository<PolicyUserDetails, Integer> {

}
