package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.PolicyDetails;

/*
 * Task 150 Build the Restful web service to fetch user with multiple claim details --------->
 *  Abhijit Daware
 */

@Repository
public interface PolicyDetailsRepository extends CrudRepository<PolicyDetails, Serializable> {

	
}
